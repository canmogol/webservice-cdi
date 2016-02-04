package com.fererlab.webservice.stock.restful;

import com.fererlab.webservice.stock.dto.ProductDTO;
import com.fererlab.webservice.stock.dto.ProductDTOList;
import com.fererlab.webservice.stock.serviceengine.StockServiceEngine;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.QueryParam;

//      http://localhost:8080/stock-war/api/stock/test
//      http://localhost:8080/webservice-cdi-war/api/stock/test
@Stateless
public class StockResourceImpl implements StockResource {

    @EJB(beanName = "StockServiceEngineImpl")
    private StockServiceEngine stockServiceEngine;

    @Override
    public String test() {
        return stockServiceEngine.test();
    }

    @Override
    public ProductDTOList findAll() {
        return stockServiceEngine.findAll();
    }

    @Override
    public ProductDTO find(@QueryParam("id") Integer id) {
        return stockServiceEngine.find(id);
    }

}
