package com.fererlab.webservice.stock.restful;

import com.fererlab.webservice.stock.dto.ProductDTO;
import com.fererlab.webservice.stock.dto.ProductDTOList;

import javax.ejb.Local;
import javax.ws.rs.*;

@Local
@Path("/stock")
@Produces({"application/json"})
@Consumes({"application/json"})
public interface StockResource {

    @GET
    @Path("/test")
    String test();

    @GET
    @Path("/findAll")
    ProductDTOList findAll();

    @GET
    @Path("/find")
    ProductDTO find(@QueryParam("id") Integer id);
}
