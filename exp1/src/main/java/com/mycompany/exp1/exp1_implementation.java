/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exp1;

import javax.jws.WebService;
//import javax.jws.WebMethod;

/**
 *
 * @author biar
 */
@WebService(endpointInterface = "com.mycompany.exp1.exp1_interface")
public class exp1_implementation implements exp1_interface {
    
    public String[] getClients() {
        String[] result = {"1,Massimo Mecella","2,Miguel Ceriani","3,Mario Rossi","4,Mario Bianchi"};
        return result;
        
    }
    
}