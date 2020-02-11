/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.firstws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author biar
 */
@WebService(serviceName = "FirstWS")
public class FirstWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public int operation(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        int k = a + b;
        return k;
    }
}
