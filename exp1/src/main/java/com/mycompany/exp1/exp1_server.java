/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exp1;

import javax.xml.ws.Endpoint;


/**
 *
 * @author biar
 */
public class exp1_server {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        exp1_implementation implementor = new exp1_implementation();
        String address = "http://localhost:8080/exp1";//http://localhost:8080/00-mylab1/AAAWS
        Endpoint.publish(address, implementor);
        System.out.println("Exp1 Started");
    }
}



