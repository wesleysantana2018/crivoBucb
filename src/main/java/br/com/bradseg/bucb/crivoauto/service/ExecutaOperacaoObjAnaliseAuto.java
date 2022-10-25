
package br.com.bradseg.bucb.crivoauto.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import br.com.bradseg.bucb.crivoauto.po.ExecutaOperacaoCrivoPO;


/**
 * <p>Java class for executaOperacaoObjAnaliseAuto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executaOperacaoObjAnaliseAuto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://service.crivoauto.bucb.bradseg.com.br/}executaOperacaoCrivoPO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executaOperacaoObjAnaliseAuto", propOrder = {
    "arg0"
})
public class ExecutaOperacaoObjAnaliseAuto {

    protected ExecutaOperacaoCrivoPO arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutaOperacaoCrivoPO }
     *     
     */
    public ExecutaOperacaoCrivoPO getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutaOperacaoCrivoPO }
     *     
     */
    public void setArg0(ExecutaOperacaoCrivoPO value) {
        this.arg0 = value;
    }

}
