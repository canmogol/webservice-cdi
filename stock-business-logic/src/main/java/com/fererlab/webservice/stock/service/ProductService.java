package com.fererlab.webservice.stock.service;

import com.fererlab.webservice.stock.model.Product;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ProductService {

    List<Product> findAll();

    Product find(Integer id);

}
