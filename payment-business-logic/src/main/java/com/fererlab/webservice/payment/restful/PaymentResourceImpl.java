package com.fererlab.webservice.payment.restful;

import com.fererlab.webservice.stock.restful.PaymentResource;

import javax.ejb.Stateless;
import java.util.Random;

//      http://localhost:8080/payment-war/api/payment/test
//      http://localhost:8080/webservice-cdi-war/api/payment/test
@Stateless
public class PaymentResourceImpl implements PaymentResource {

    @Override
    public String test() {
        return getClass().getName() + "." + (new Random().nextDouble());
    }

}
