package com.fererlab.webservice.stock.restful;

import javax.ejb.Local;
import javax.ws.rs.*;

@Local
@Path("/payment")
@Produces({"application/json"})
@Consumes({"application/json"})
public interface PaymentResource {

    @GET
    @Path("/test")
    String test();

}
