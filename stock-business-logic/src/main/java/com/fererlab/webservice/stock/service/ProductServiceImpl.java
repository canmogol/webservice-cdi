package com.fererlab.webservice.stock.service;

import com.fererlab.webservice.stock.model.Product;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless(name = "ProductServiceImpl", mappedName = "ProductServiceImpl")
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> findAll() {
        return new ArrayList<Product>() {{
            add(new Product(1, "Cherry"));
            add(new Product(2, "Berry"));
            add(new Product(3, "Kiwi"));
        }};
    }

    @Override
    public Product find(Integer id) {
        return new Product(id, "Friday");
    }

}
