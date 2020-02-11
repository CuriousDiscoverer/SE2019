/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp1client;

import java.util.List;

/**
 *
 * @author biar
 */
public class Exp1client {

    private static java.util.List<java.lang.String> getClients() {
        com.mycompany.exp1.Exp1ImplementationService service = new com.mycompany.exp1.Exp1ImplementationService();
        com.mycompany.exp1.Exp1Interface port = service.getExp1ImplementationPort();
        return port.getClients();
    }
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // TODO code application logic here
        System.out.println("Clients:");
        List<String> clients = getClients();
        for(String c : clients) {
                System.out.println(c);
            //System.out.println(c);
        }
    }
    
}
