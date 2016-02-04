package com.fererlab.webservice.stock.selector;

import com.fererlab.webservice.stock.restful.PaymentResource;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Provider;

@LocalBean
@Stateless(name = "PaymentServiceSelector", mappedName = "PaymentServiceSelector")
public class PaymentServiceSelector {

    @Inject
    private Provider<PaymentResource> provider;

    public PaymentResource select() {
        PaymentResource resource = null;
        try {
            resource = provider.get();
        } catch (Exception e) {
            ResteasyClient client = new ResteasyClientBuilder().build();
            ResteasyWebTarget target = client.target("http://localhost:8080/payment-war/api/");
            resource = target.proxy(PaymentResource.class);
        }
        return resource;
    }


}
