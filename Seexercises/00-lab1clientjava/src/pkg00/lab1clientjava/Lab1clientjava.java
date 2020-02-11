/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00.lab1clientjava;
import java.util.List;
/**
 *
 * @author biar
 */
public class Lab1clientjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Clients:");
        List<String> clients = getClients();
        for(String c : clients) {
                System.out.println(c);
            //System.out.println(c);
        }
    }

    private static java.util.List<java.lang.String> getClients() {
        pkg00.lab1clientjava.AAAWSimplementationService service = new pkg00.lab1clientjava.AAAWSimplementationService();
        pkg00.lab1clientjava.AAAWSinterface port = service.getAAAWSimplementationPort();
        return port.getClients();
    }
    
}
