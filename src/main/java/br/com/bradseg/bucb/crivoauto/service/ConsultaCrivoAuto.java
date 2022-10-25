
package br.com.bradseg.bucb.crivoauto.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import br.com.bradseg.bucb.crivoauto.po.ConsultaCrivoPO;


/**
 * <p>Java class for consultaCrivoAuto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaCrivoAuto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://service.crivoauto.bucb.bradseg.com.br/}consultaCrivoPO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaCrivoAuto", propOrder = {
    "arg0"
})
public class ConsultaCrivoAuto {

    protected ConsultaCrivoPO arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaCrivoPO }
     *     
     */
    public ConsultaCrivoPO getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaCrivoPO }
     *     
     */
    public void setArg0(ConsultaCrivoPO value) {
        this.arg0 = value;
    }

}
