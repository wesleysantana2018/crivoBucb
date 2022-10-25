
package br.com.bradseg.bucb.crivoauto.po;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.com.bradseg.bucb.crivoauto.vo.ParametroEntradaVO;
import br.com.bradseg.bucb.crivoauto.vo.ParametroSaidaVO;


/**
 * <p>Java class for executaOperacaoCrivoPO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executaOperacaoCrivoPO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parametrosEntrada" type="{http://service.crivoauto.bucb.bradseg.com.br/}parametroEntradaVO" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="politica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retornoDesejado" type="{http://service.crivoauto.bucb.bradseg.com.br/}parametroSaidaVO" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPessoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executaOperacaoCrivoPO", propOrder = {
    "login",
    "parametrosEntrada",
    "politica",
    "retornoDesejado",
    "senha",
    "tipoPessoa"
})
public class ExecutaOperacaoCrivoPO {

    protected String login;
    @XmlElement(nillable = true)
    protected List<ParametroEntradaVO> parametrosEntrada;
    protected String politica;
    @XmlElement(nillable = true)
    protected List<ParametroSaidaVO> retornoDesejado;
    protected String senha;
    protected String tipoPessoa;

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the parametrosEntrada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametrosEntrada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametrosEntrada().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametroEntradaVO }
     * 
     * 
     */
    public List<ParametroEntradaVO> getParametrosEntrada() {
        if (parametrosEntrada == null) {
            parametrosEntrada = new ArrayList<ParametroEntradaVO>();
        }
        return this.parametrosEntrada;
    }

    /**
     * Gets the value of the politica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolitica() {
        return politica;
    }

    /**
     * Sets the value of the politica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolitica(String value) {
        this.politica = value;
    }

    /**
     * Gets the value of the retornoDesejado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retornoDesejado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetornoDesejado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametroSaidaVO }
     * 
     * 
     */
    public List<ParametroSaidaVO> getRetornoDesejado() {
        if (retornoDesejado == null) {
            retornoDesejado = new ArrayList<ParametroSaidaVO>();
        }
        return this.retornoDesejado;
    }

    /**
     * Gets the value of the senha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Sets the value of the senha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Gets the value of the tipoPessoa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPessoa() {
        return tipoPessoa;
    }

    /**
     * Sets the value of the tipoPessoa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPessoa(String value) {
        this.tipoPessoa = value;
    }

}
