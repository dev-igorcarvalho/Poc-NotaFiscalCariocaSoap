//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.18 at 02:24:41 PM BRT 
//


package br.com.datagrupo.buyshowloja.webservices.notafiscal.models.nfse_pcrj_v01;

import br.com.datagrupo.buyshowloja.webservices.notafiscal.models.nfse.ListaMensagemRetorno;
import br.com.datagrupo.buyshowloja.webservices.notafiscal.models.nfse.TcCompNfse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}CompNfse"/>
 *           &lt;element ref="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}ListaMensagemRetorno" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "compNfse",
    "listaMensagemRetorno"
})
@XmlRootElement(name = "GerarNfseResposta")
public class GerarNfseResposta {

    @XmlElement(name = "CompNfse", namespace = "http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd")
    protected TcCompNfse compNfse;
    @XmlElement(name = "ListaMensagemRetorno", namespace = "http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd")
    protected ListaMensagemRetorno listaMensagemRetorno;

    /**
     * Gets the value of the compNfse property.
     * 
     * @return
     *     possible object is
     *     {@link TcCompNfse }
     *     
     */
    public TcCompNfse getCompNfse() {
        return compNfse;
    }

    /**
     * Sets the value of the compNfse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcCompNfse }
     *     
     */
    public void setCompNfse(TcCompNfse value) {
        this.compNfse = value;
    }

    /**
     * Gets the value of the listaMensagemRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link ListaMensagemRetorno }
     *     
     */
    public ListaMensagemRetorno getListaMensagemRetorno() {
        return listaMensagemRetorno;
    }

    /**
     * Sets the value of the listaMensagemRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaMensagemRetorno }
     *     
     */
    public void setListaMensagemRetorno(ListaMensagemRetorno value) {
        this.listaMensagemRetorno = value;
    }

}