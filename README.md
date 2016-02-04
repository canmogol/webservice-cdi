# webservice-cdi
Web service call for two WAR deployments and CDI method call for same EAR deployment example

There are two ways to deploy same application(s)
- First is using the two seperate war files, stock-war and payment-war, you can test these deployments by calling below URLs

1. http://localhost:8080/payment-war/api/payment/test

2. http://localhost:8080/stock-war/api/stock/test

The "stock/test" call (the second one) will call the first one via Restful web service, check StockResourceImpl::test and StockServiceEngineImpl::test methods.


- Second is using the ear file which is the "webservice-cdi-ear.ear" file under webservice-cdi-ear project. You can test the same web services by calling below URLs

1. http://localhost:8080/webservice-cdi-war/api/payment/test

2. http://localhost:8080/webservice-cdi-war/api/stock/test

The "stock/test" call (the second one) will call the first one via EJB/CDI injected object's method call, check StockResourceImpl::test and StockServiceEngineImpl::test methods.

