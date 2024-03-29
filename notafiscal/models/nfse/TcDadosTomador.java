//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.28 at 03:07:13 PM BRT 
//


package br.com.datagrupo.buyshowloja.webservices.notafiscal.models.nfse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tcDadosTomador complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tcDadosTomador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificacaoTomador" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tcIdentificacaoTomador" minOccurs="0"/>
 *         &lt;element name="RazaoSocial" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tsRazaoSocial" minOccurs="0"/>
 *         &lt;element name="Endereco" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tcEndereco" minOccurs="0"/>
 *         &lt;element name="Contato" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tcContato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcDadosTomador", propOrder = {
    "identificacaoTomador",
    "razaoSocial",
    "endereco",
    "contato"
})
public class TcDadosTomador {

    @XmlElement(name = "IdentificacaoTomador")
    protected TcIdentificacaoTomador identificacaoTomador;
    @XmlElement(name = "RazaoSocial")
    protected String razaoSocial;
    @XmlElement(name = "Endereco")
    protected TcEndereco endereco;
    @XmlElement(name = "Contato")
    protected TcContato contato;

    /**
     * Gets the value of the identificacaoTomador property.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoTomador }
     *     
     */
    public TcIdentificacaoTomador getIdentificacaoTomador() {
        return identificacaoTomador;
    }

    /**
     * Sets the value of the identificacaoTomador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoTomador }
     *     
     */
    public void setIdentificacaoTomador(TcIdentificacaoTomador value) {
        this.identificacaoTomador = value;
    }

    /**
     * Gets the value of the razaoSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Sets the value of the razaoSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazaoSocial(String value) {
        this.razaoSocial = value;
    }

    /**
     * Gets the value of the endereco property.
     * 
     * @return
     *     possible object is
     *     {@link TcEndereco }
     *     
     */
    public TcEndereco getEndereco() {
        return endereco;
    }

    /**
     * Sets the value of the endereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcEndereco }
     *     
     */
    public void setEndereco(TcEndereco value) {
        this.endereco = value;
    }

    /**
     * Gets the value of the contato property.
     * 
     * @return
     *     possible object is
     *     {@link TcContato }
     *     
     */
    public TcContato getContato() {
        return contato;
    }

    /**
     * Sets the value of the contato property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcContato }
     *     
     */
    public void setContato(TcContato value) {
        this.contato = value;
    }

}
