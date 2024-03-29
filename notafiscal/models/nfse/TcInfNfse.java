//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.28 at 03:07:13 PM BRT 
//


package br.com.datagrupo.buyshowloja.webservices.notafiscal.models.nfse;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tcInfNfse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tcInfNfse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Numero" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tsNumeroNfse"/>
 *         &lt;element name="CodigoVerificacao" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tsCodigoVerificacao"/>
 *         &lt;element name="DataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IdentificacaoRps" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tcIdentificacaoRps" minOccurs="0"/>
 *         &lt;element name="DataEmissaoRps" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NaturezaOperacao" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tsNaturezaOperacao"/>
 *         &lt;element name="RegimeEspecialTributacao" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tsRegimeEspecialTributacao" minOccurs="0"/>
 *         &lt;element name="OptanteSimplesNacional" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tsSimNao"/>
 *         &lt;element name="IncentivadorCultural" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tsSimNao"/>
 *         &lt;element name="Competencia" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NfseSubstituida" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tsNumeroNfse" minOccurs="0"/>
 *         &lt;element name="OutrasInformacoes" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tsOutrasInformacoes" minOccurs="0"/>
 *         &lt;element name="Servico" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tcDadosServico"/>
 *         &lt;element name="ValorCredito" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="PrestadorServico" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tcDadosPrestador"/>
 *         &lt;element name="TomadorServico" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tcDadosTomador" minOccurs="0"/>
 *         &lt;element name="IntermediarioServico" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tcIdentificacaoIntermediarioServico" minOccurs="0"/>
 *         &lt;element name="OrgaoGerador" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tcIdentificacaoOrgaoGerador"/>
 *         &lt;element name="ConstrucaoCivil" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tcDadosConstrucaoCivil" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.abrasf.org.br/ABRASF/arquivos/nfse.xsd}tsIdTag" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcInfNfse", propOrder = {
    "numero",
    "codigoVerificacao",
    "dataEmissao",
    "identificacaoRps",
    "dataEmissaoRps",
    "naturezaOperacao",
    "regimeEspecialTributacao",
    "optanteSimplesNacional",
    "incentivadorCultural",
    "competencia",
    "nfseSubstituida",
    "outrasInformacoes",
    "servico",
    "valorCredito",
    "prestadorServico",
    "tomadorServico",
    "intermediarioServico",
    "orgaoGerador",
    "construcaoCivil"
})
public class TcInfNfse {

    @XmlElement(name = "Numero", required = true)
    protected BigInteger numero;
    @XmlElement(name = "CodigoVerificacao", required = true)
    protected String codigoVerificacao;
    @XmlElement(name = "DataEmissao", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEmissao;
    @XmlElement(name = "IdentificacaoRps")
    protected TcIdentificacaoRps identificacaoRps;
    @XmlElement(name = "DataEmissaoRps")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissaoRps;
    @XmlElement(name = "NaturezaOperacao")
    protected byte naturezaOperacao;
    @XmlElement(name = "RegimeEspecialTributacao")
    protected Byte regimeEspecialTributacao;
    @XmlElement(name = "OptanteSimplesNacional")
    protected byte optanteSimplesNacional;
    @XmlElement(name = "IncentivadorCultural")
    protected byte incentivadorCultural;
    @XmlElement(name = "Competencia", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar competencia;
    @XmlElement(name = "NfseSubstituida")
    protected BigInteger nfseSubstituida;
    @XmlElement(name = "OutrasInformacoes")
    protected String outrasInformacoes;
    @XmlElement(name = "Servico", required = true)
    protected TcDadosServico servico;
    @XmlElement(name = "ValorCredito")
    protected BigDecimal valorCredito;
    @XmlElement(name = "PrestadorServico", required = true)
    protected TcDadosPrestador prestadorServico;
    @XmlElement(name = "TomadorServico")
    protected TcDadosTomador tomadorServico;
    @XmlElement(name = "IntermediarioServico")
    protected TcIdentificacaoIntermediarioServico intermediarioServico;
    @XmlElement(name = "OrgaoGerador", required = true)
    protected TcIdentificacaoOrgaoGerador orgaoGerador;
    @XmlElement(name = "ConstrucaoCivil")
    protected TcDadosConstrucaoCivil construcaoCivil;
    @XmlAttribute(name = "Id")
    protected String id;

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumero(BigInteger value) {
        this.numero = value;
    }

    /**
     * Gets the value of the codigoVerificacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoVerificacao() {
        return codigoVerificacao;
    }

    /**
     * Sets the value of the codigoVerificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoVerificacao(String value) {
        this.codigoVerificacao = value;
    }

    /**
     * Gets the value of the dataEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Sets the value of the dataEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
    }

    /**
     * Gets the value of the identificacaoRps property.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoRps }
     *     
     */
    public TcIdentificacaoRps getIdentificacaoRps() {
        return identificacaoRps;
    }

    /**
     * Sets the value of the identificacaoRps property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoRps }
     *     
     */
    public void setIdentificacaoRps(TcIdentificacaoRps value) {
        this.identificacaoRps = value;
    }

    /**
     * Gets the value of the dataEmissaoRps property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissaoRps() {
        return dataEmissaoRps;
    }

    /**
     * Sets the value of the dataEmissaoRps property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissaoRps(XMLGregorianCalendar value) {
        this.dataEmissaoRps = value;
    }

    /**
     * Gets the value of the naturezaOperacao property.
     * 
     */
    public byte getNaturezaOperacao() {
        return naturezaOperacao;
    }

    /**
     * Sets the value of the naturezaOperacao property.
     * 
     */
    public void setNaturezaOperacao(byte value) {
        this.naturezaOperacao = value;
    }

    /**
     * Gets the value of the regimeEspecialTributacao property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getRegimeEspecialTributacao() {
        return regimeEspecialTributacao;
    }

    /**
     * Sets the value of the regimeEspecialTributacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setRegimeEspecialTributacao(Byte value) {
        this.regimeEspecialTributacao = value;
    }

    /**
     * Gets the value of the optanteSimplesNacional property.
     * 
     */
    public byte getOptanteSimplesNacional() {
        return optanteSimplesNacional;
    }

    /**
     * Sets the value of the optanteSimplesNacional property.
     * 
     */
    public void setOptanteSimplesNacional(byte value) {
        this.optanteSimplesNacional = value;
    }

    /**
     * Gets the value of the incentivadorCultural property.
     * 
     */
    public byte getIncentivadorCultural() {
        return incentivadorCultural;
    }

    /**
     * Sets the value of the incentivadorCultural property.
     * 
     */
    public void setIncentivadorCultural(byte value) {
        this.incentivadorCultural = value;
    }

    /**
     * Gets the value of the competencia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompetencia() {
        return competencia;
    }

    /**
     * Sets the value of the competencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompetencia(XMLGregorianCalendar value) {
        this.competencia = value;
    }

    /**
     * Gets the value of the nfseSubstituida property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNfseSubstituida() {
        return nfseSubstituida;
    }

    /**
     * Sets the value of the nfseSubstituida property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNfseSubstituida(BigInteger value) {
        this.nfseSubstituida = value;
    }

    /**
     * Gets the value of the outrasInformacoes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutrasInformacoes() {
        return outrasInformacoes;
    }

    /**
     * Sets the value of the outrasInformacoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutrasInformacoes(String value) {
        this.outrasInformacoes = value;
    }

    /**
     * Gets the value of the servico property.
     * 
     * @return
     *     possible object is
     *     {@link TcDadosServico }
     *     
     */
    public TcDadosServico getServico() {
        return servico;
    }

    /**
     * Sets the value of the servico property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcDadosServico }
     *     
     */
    public void setServico(TcDadosServico value) {
        this.servico = value;
    }

    /**
     * Gets the value of the valorCredito property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCredito() {
        return valorCredito;
    }

    /**
     * Sets the value of the valorCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCredito(BigDecimal value) {
        this.valorCredito = value;
    }

    /**
     * Gets the value of the prestadorServico property.
     * 
     * @return
     *     possible object is
     *     {@link TcDadosPrestador }
     *     
     */
    public TcDadosPrestador getPrestadorServico() {
        return prestadorServico;
    }

    /**
     * Sets the value of the prestadorServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcDadosPrestador }
     *     
     */
    public void setPrestadorServico(TcDadosPrestador value) {
        this.prestadorServico = value;
    }

    /**
     * Gets the value of the tomadorServico property.
     * 
     * @return
     *     possible object is
     *     {@link TcDadosTomador }
     *     
     */
    public TcDadosTomador getTomadorServico() {
        return tomadorServico;
    }

    /**
     * Sets the value of the tomadorServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcDadosTomador }
     *     
     */
    public void setTomadorServico(TcDadosTomador value) {
        this.tomadorServico = value;
    }

    /**
     * Gets the value of the intermediarioServico property.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoIntermediarioServico }
     *     
     */
    public TcIdentificacaoIntermediarioServico getIntermediarioServico() {
        return intermediarioServico;
    }

    /**
     * Sets the value of the intermediarioServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoIntermediarioServico }
     *     
     */
    public void setIntermediarioServico(TcIdentificacaoIntermediarioServico value) {
        this.intermediarioServico = value;
    }

    /**
     * Gets the value of the orgaoGerador property.
     * 
     * @return
     *     possible object is
     *     {@link TcIdentificacaoOrgaoGerador }
     *     
     */
    public TcIdentificacaoOrgaoGerador getOrgaoGerador() {
        return orgaoGerador;
    }

    /**
     * Sets the value of the orgaoGerador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcIdentificacaoOrgaoGerador }
     *     
     */
    public void setOrgaoGerador(TcIdentificacaoOrgaoGerador value) {
        this.orgaoGerador = value;
    }

    /**
     * Gets the value of the construcaoCivil property.
     * 
     * @return
     *     possible object is
     *     {@link TcDadosConstrucaoCivil }
     *     
     */
    public TcDadosConstrucaoCivil getConstrucaoCivil() {
        return construcaoCivil;
    }

    /**
     * Sets the value of the construcaoCivil property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcDadosConstrucaoCivil }
     *     
     */
    public void setConstrucaoCivil(TcDadosConstrucaoCivil value) {
        this.construcaoCivil = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
