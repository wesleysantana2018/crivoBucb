
package br.com.bradseg.bucb.crivoauto.po;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.com.bradseg.bucb.crivoauto.vo.ParametroSaidaVO;


/**
 * <p>Java class for consultaCrivoPO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaCrivoPO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retornoDesejado" type="{http://service.crivoauto.bucb.bradseg.com.br/}parametroSaidaVO" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaCrivoPO", propOrder = {
    "codigoOperacao",
    "login",
    "retornoDesejado",
    "senha"
})
public class ConsultaCrivoPO {

    protected String codigoOperacao;
    protected String login;
    @XmlElement(nillable = true)
    protected List<ParametroSaidaVO> retornoDesejado;
    protected String senha;

    /**
     * Gets the value of the codigoOperacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOperacao() {
        return codigoOperacao;
    }

    /**
     * Sets the value of the codigoOperacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOperacao(String value) {
        this.codigoOperacao = value;
    }

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

}
