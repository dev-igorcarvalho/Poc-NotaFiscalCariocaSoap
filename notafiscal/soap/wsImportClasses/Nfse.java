
package br.com.datagrupo.buyshowloja.webservices.notafiscal.soap.wsImportClasses;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Nfse", targetNamespace = "http://notacarioca.rio.gov.br/", wsdlLocation = "file:/home/dg/NetBeansProjects/SoapWs/src/main/java/br/com/mycompany/soapws/wsdl/NotaCariocaWS.wsdl")
public class Nfse
    extends Service
{

    private final static URL NFSE_WSDL_LOCATION;
    private final static WebServiceException NFSE_EXCEPTION;
    private final static QName NFSE_QNAME = new QName("http://notacarioca.rio.gov.br/", "Nfse");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/dg/NetBeansProjects/SoapWs/src/main/java/br/com/mycompany/soapws/wsdl/NotaCariocaWS.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NFSE_WSDL_LOCATION = url;
        NFSE_EXCEPTION = e;
    }

    public Nfse() {
        super(__getWsdlLocation(), NFSE_QNAME);
    }

    public Nfse(WebServiceFeature... features) {
        super(__getWsdlLocation(), NFSE_QNAME, features);
    }

    public Nfse(URL wsdlLocation) {
        super(wsdlLocation, NFSE_QNAME);
    }

    public Nfse(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NFSE_QNAME, features);
    }

    public Nfse(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Nfse(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NfseSoap
     */
    @WebEndpoint(name = "NfseSoap")
    public NfseSoap getNfseSoap() {
        return super.getPort(new QName("http://notacarioca.rio.gov.br/", "NfseSoap"), NfseSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NfseSoap
     */
    @WebEndpoint(name = "NfseSoap")
    public NfseSoap getNfseSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://notacarioca.rio.gov.br/", "NfseSoap"), NfseSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NFSE_EXCEPTION!= null) {
            throw NFSE_EXCEPTION;
        }
        return NFSE_WSDL_LOCATION;
    }

}