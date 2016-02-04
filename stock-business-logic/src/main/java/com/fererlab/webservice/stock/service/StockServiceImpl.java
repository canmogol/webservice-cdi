package com.fererlab.webservice.stock.service;

import javax.ejb.Stateless;
import java.util.Random;

@Stateless(name = "StockServiceImpl", mappedName = "StockServiceImpl")
public class StockServiceImpl implements StockService {

    @Override
    public Integer findStock(Integer productId) {
        return new Random().nextInt(10);
    }

}
