package com.fererlab.webservice.stock.serviceengine;

import com.fererlab.webservice.stock.dto.ProductDTO;
import com.fererlab.webservice.stock.dto.ProductDTOList;

import javax.ejb.Local;

@Local
public interface StockServiceEngine {

    ProductDTOList findAll();

    ProductDTO find(Integer id);

    String test();

}
