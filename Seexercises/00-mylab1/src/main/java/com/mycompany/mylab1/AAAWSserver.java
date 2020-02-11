/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mylab1;

import javax.xml.ws.Endpoint;
/**
 *
 * @author biar
 */
public class AAAWSserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        AAAWSimplementation implementor = new AAAWSimplementation();
        String address = "http://localhost:8080/00-mylab1";//http://localhost:8080/00-mylab1/AAAWS
        Endpoint.publish(address, implementor);
        System.out.println("MyAAAWS Started");
    }
    
}
