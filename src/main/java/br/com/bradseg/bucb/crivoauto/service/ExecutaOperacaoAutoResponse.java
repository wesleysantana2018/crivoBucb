
package br.com.bradseg.bucb.crivoauto.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.com.bradseg.bucb.crivoauto.vo.ParametroSaidaVO;


/**
 * <p>Java class for executaOperacaoAutoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executaOperacaoAutoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.crivoauto.bucb.bradseg.com.br/}parametroSaidaVO" maxOccurs="999" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executaOperacaoAutoResponse", propOrder = {
    "_return"
})
public class ExecutaOperacaoAutoResponse {

    @XmlElement(name = "return")
    protected List<ParametroSaidaVO> _return;

    /**
     * Gets the value of the return property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the return property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametroSaidaVO }
     * 
     * 
     */
    public List<ParametroSaidaVO> getReturn() {
        if (_return == null) {
            _return = new ArrayList<ParametroSaidaVO>();
        }
        return this._return;
    }

}
