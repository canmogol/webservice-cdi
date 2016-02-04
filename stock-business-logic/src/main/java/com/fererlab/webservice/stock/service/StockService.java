package com.fererlab.webservice.stock.service;

import javax.ejb.Local;

@Local
public interface StockService {

    Integer findStock(Integer productId);

}
