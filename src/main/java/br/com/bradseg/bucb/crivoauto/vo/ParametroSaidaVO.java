
package br.com.bradseg.bucb.crivoauto.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parametroSaidaVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parametroSaidaVO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.crivoauto.bucb.bradseg.com.br/}parametroEntradaVO">
 *       &lt;sequence>
 *         &lt;element name="fonte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="produto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametroSaidaVO", propOrder = {
    "fonte",
    "produto"
})
public class ParametroSaidaVO
    extends ParametroEntradaVO
{

    protected String fonte;
    protected String produto;

    /**
     * Gets the value of the fonte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFonte() {
        return fonte;
    }

    /**
     * Sets the value of the fonte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFonte(String value) {
        this.fonte = value;
    }

    /**
     * Gets the value of the produto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduto() {
        return produto;
    }

    /**
     * Sets the value of the produto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduto(String value) {
        this.produto = value;
    }

}
