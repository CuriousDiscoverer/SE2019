/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_mavenproject1;

/**
 *
 * @author biar
 */
public class Client_mavenproject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int a = 1;
            int b = 40;
            int result = operation(a, b);
            System.out.println("Result = " + result);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }

    

    private static int operation(int a, int b) {
        org.me.firstws.FirstWS_Service service = new org.me.firstws.FirstWS_Service();
        org.me.firstws.FirstWS port = service.getFirstWSPort();
        return port.operation(a, b);
    }

    
    
}
