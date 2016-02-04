package com.fererlab.webservice.stock.serviceengine;

import com.fererlab.webservice.stock.dto.ProductDTO;
import com.fererlab.webservice.stock.dto.ProductDTOList;
import com.fererlab.webservice.stock.model.Product;
import com.fererlab.webservice.stock.restful.PaymentResource;
import com.fererlab.webservice.stock.selector.PaymentServiceSelector;
import com.fererlab.webservice.stock.service.ProductService;
import com.fererlab.webservice.stock.service.StockService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;
import java.util.Random;

@Stateless(name = "StockServiceEngineImpl", mappedName = "StockServiceEngineImpl")
public class StockServiceEngineImpl implements StockServiceEngine {

    @EJB(beanName = "StockServiceImpl")
    private StockService stockService;

    @EJB(beanName = "ProductServiceImpl")
    private ProductService productService;

    @EJB(beanName = "PaymentServiceSelector")
    private PaymentServiceSelector paymentServiceSelector;

    @Override
    public ProductDTOList findAll() {
        List<Product> productList = productService.findAll();
        ProductDTOList productDTOList = new ProductDTOList();
        for (Product product : productList) {
            ProductDTO productDTO = new ProductDTO();
            productDTO.setId(product.getId());
            productDTO.setName(product.getName());
            Integer stock = stockService.findStock(product.getId());
            productDTO.setStock(stock);
            productDTOList.getProductDTOList().add(productDTO);
        }
        return productDTOList;
    }

    @Override
    public ProductDTO find(Integer id) {
        Product product = productService.find(id);
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        Integer stock = stockService.findStock(product.getId());
        productDTO.setStock(stock);
        return productDTO;
    }

    @Override
    public String test() {
        String paymentResourceTest = "";
        PaymentResource paymentResource = paymentServiceSelector.select();
        System.out.println("--> paymentResource = " + paymentResource);
        if (paymentResource != null) {
            paymentResourceTest = paymentResource.test();
            System.out.println("--> paymentResource.test() = " + paymentResourceTest);
        }
        return getClass().getName() + "." + (new Random().nextDouble()) + " - " + paymentResourceTest;
    }

}
