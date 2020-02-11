/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mylab1;
import javax.jws.WebService;
//import javax.jws.WebMethod;

/**
 *
 * @author biar
 */
@WebService(endpointInterface = "com.mycompany.mylab1.AAAWSinterface")
public class AAAWSimplementation implements AAAWSinterface {
   
    public String[] getClients() {
        String[] result = {"1,Massimo Mecella","2,Miguel Ceriani","3,Mario Rossi","4,Mario Bianchi"};
        return result;
        
    }
    
}