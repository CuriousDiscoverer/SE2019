
package pkg00.lab1clientjava;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pkg00.lab1clientjava package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetClientsResponse_QNAME = new QName("http://mylab1.mycompany.com/", "getClientsResponse");
    private final static QName _GetClients_QNAME = new QName("http://mylab1.mycompany.com/", "getClients");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pkg00.lab1clientjava
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetClients }
     * 
     */
    public GetClients createGetClients() {
        return new GetClients();
    }

    /**
     * Create an instance of {@link GetClientsResponse }
     * 
     */
    public GetClientsResponse createGetClientsResponse() {
        return new GetClientsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mylab1.mycompany.com/", name = "getClientsResponse")
    public JAXBElement<GetClientsResponse> createGetClientsResponse(GetClientsResponse value) {
        return new JAXBElement<GetClientsResponse>(_GetClientsResponse_QNAME, GetClientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mylab1.mycompany.com/", name = "getClients")
    public JAXBElement<GetClients> createGetClients(GetClients value) {
        return new JAXBElement<GetClients>(_GetClients_QNAME, GetClients.class, null, value);
    }

}
