
package br.com.bradseg.bucb.crivoauto.util;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import br.com.bradseg.bucb.crivoauto.exception.BUCBCrivoException;
import br.com.bradseg.bucb.crivoauto.po.ConsultaCrivoPO;
import br.com.bradseg.bucb.crivoauto.po.ExecutaOperacaoCrivoPO;
import br.com.bradseg.bucb.crivoauto.service.ConsultaCrivoAuto;
import br.com.bradseg.bucb.crivoauto.service.ConsultaCrivoAutoResponse;
import br.com.bradseg.bucb.crivoauto.service.ExecutaOperacaoAuto;
import br.com.bradseg.bucb.crivoauto.service.ExecutaOperacaoAutoResponse;
import br.com.bradseg.bucb.crivoauto.service.ExecutaOperacaoObjAnaliseAuto;
import br.com.bradseg.bucb.crivoauto.service.ExecutaOperacaoObjAnaliseAutoResponse;
import br.com.bradseg.bucb.crivoauto.vo.ParametroEntradaVO;
import br.com.bradseg.bucb.crivoauto.vo.ParametroSaidaVO;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the br.com.bradseg.bucb.crivoauto.service
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ExecutaOperacaoAuto_QNAME = new QName("http://service.crivoauto.bucb.bradseg.com.br/",
            "executaOperacaoAuto");
    private final static QName _ExecutaOperacaoObjAnaliseAutoResponse_QNAME = new QName(
            "http://service.crivoauto.bucb.bradseg.com.br/", "executaOperacaoObjAnaliseAutoResponse");
    private final static QName _ConsultaCrivoAuto_QNAME = new QName("http://service.crivoauto.bucb.bradseg.com.br/",
            "consultaCrivoAuto");
    private final static QName _ExecutaOperacaoObjAnaliseAuto_QNAME = new QName(
            "http://service.crivoauto.bucb.bradseg.com.br/", "executaOperacaoObjAnaliseAuto");
    private final static QName _BUCBCrivoException_QNAME = new QName("http://service.crivoauto.bucb.bradseg.com.br/",
            "BUCBCrivoException");
    private final static QName _ExecutaOperacaoAutoResponse_QNAME = new QName(
            "http://service.crivoauto.bucb.bradseg.com.br/", "executaOperacaoAutoResponse");
    private final static QName _ConsultaCrivoAutoResponse_QNAME = new QName(
            "http://service.crivoauto.bucb.bradseg.com.br/", "consultaCrivoAutoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema
     * derived classes for package: br.com.bradseg.bucb.crivoauto.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaCrivoAutoResponse }
     * 
     */
    public ConsultaCrivoAutoResponse createConsultaCrivoAutoResponse() {
        return new ConsultaCrivoAutoResponse();
    }

    /**
     * Create an instance of {@link ExecutaOperacaoAutoResponse }
     * 
     */
    public ExecutaOperacaoAutoResponse createExecutaOperacaoAutoResponse() {
        return new ExecutaOperacaoAutoResponse();
    }

    /**
     * Create an instance of {@link ExecutaOperacaoObjAnaliseAuto }
     * 
     */
    public ExecutaOperacaoObjAnaliseAuto createExecutaOperacaoObjAnaliseAuto() {
        return new ExecutaOperacaoObjAnaliseAuto();
    }

    /**
     * Create an instance of {@link BUCBCrivoException }
     * 
     */
    public BUCBCrivoException createBUCBCrivoException() {
        return new BUCBCrivoException();
    }

    /**
     * Create an instance of {@link ExecutaOperacaoAuto }
     * 
     */
    public ExecutaOperacaoAuto createExecutaOperacaoAuto() {
        return new ExecutaOperacaoAuto();
    }

    /**
     * Create an instance of {@link ExecutaOperacaoObjAnaliseAutoResponse }
     * 
     */
    public ExecutaOperacaoObjAnaliseAutoResponse createExecutaOperacaoObjAnaliseAutoResponse() {
        return new ExecutaOperacaoObjAnaliseAutoResponse();
    }

    /**
     * Create an instance of {@link ConsultaCrivoAuto }
     * 
     */
    public ConsultaCrivoAuto createConsultaCrivoAuto() {
        return new ConsultaCrivoAuto();
    }

    /**
     * Create an instance of {@link ConsultaCrivoPO }
     * 
     */
    public ConsultaCrivoPO createConsultaCrivoPO() {
        return new ConsultaCrivoPO();
    }

    /**
     * Create an instance of {@link ExecutaOperacaoCrivoPO }
     * 
     */
    public ExecutaOperacaoCrivoPO createExecutaOperacaoCrivoPO() {
        return new ExecutaOperacaoCrivoPO();
    }

    /**
     * Create an instance of {@link ParametroSaidaVO }
     * 
     */
    public ParametroSaidaVO createParametroSaidaVO() {
        return new ParametroSaidaVO();
    }

    /**
     * Create an instance of {@link ParametroEntradaVO }
     * 
     */
    public ParametroEntradaVO createParametroEntradaVO() {
        return new ParametroEntradaVO();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutaOperacaoAuto
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.crivoauto.bucb.bradseg.com.br/", name = "executaOperacaoAuto")
    public JAXBElement<ExecutaOperacaoAuto> createExecutaOperacaoAuto(ExecutaOperacaoAuto value) {
        return new JAXBElement<ExecutaOperacaoAuto>(_ExecutaOperacaoAuto_QNAME, ExecutaOperacaoAuto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link ExecutaOperacaoObjAnaliseAutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.crivoauto.bucb.bradseg.com.br/", name = "executaOperacaoObjAnaliseAutoResponse")
    public JAXBElement<ExecutaOperacaoObjAnaliseAutoResponse> createExecutaOperacaoObjAnaliseAutoResponse(
            ExecutaOperacaoObjAnaliseAutoResponse value) {
        return new JAXBElement<ExecutaOperacaoObjAnaliseAutoResponse>(_ExecutaOperacaoObjAnaliseAutoResponse_QNAME,
                ExecutaOperacaoObjAnaliseAutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaCrivoAuto
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.crivoauto.bucb.bradseg.com.br/", name = "consultaCrivoAuto")
    public JAXBElement<ConsultaCrivoAuto> createConsultaCrivoAuto(ConsultaCrivoAuto value) {
        return new JAXBElement<ConsultaCrivoAuto>(_ConsultaCrivoAuto_QNAME, ConsultaCrivoAuto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link ExecutaOperacaoObjAnaliseAuto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.crivoauto.bucb.bradseg.com.br/", name = "executaOperacaoObjAnaliseAuto")
    public JAXBElement<ExecutaOperacaoObjAnaliseAuto> createExecutaOperacaoObjAnaliseAuto(
            ExecutaOperacaoObjAnaliseAuto value) {
        return new JAXBElement<ExecutaOperacaoObjAnaliseAuto>(_ExecutaOperacaoObjAnaliseAuto_QNAME,
                ExecutaOperacaoObjAnaliseAuto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BUCBCrivoException
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.crivoauto.bucb.bradseg.com.br/", name = "BUCBCrivoException")
    public JAXBElement<BUCBCrivoException> createBUCBCrivoException(BUCBCrivoException value) {
        return new JAXBElement<BUCBCrivoException>(_BUCBCrivoException_QNAME, BUCBCrivoException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link ExecutaOperacaoAutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.crivoauto.bucb.bradseg.com.br/", name = "executaOperacaoAutoResponse")
    public JAXBElement<ExecutaOperacaoAutoResponse> createExecutaOperacaoAutoResponse(
            ExecutaOperacaoAutoResponse value) {
        return new JAXBElement<ExecutaOperacaoAutoResponse>(_ExecutaOperacaoAutoResponse_QNAME,
                ExecutaOperacaoAutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link ConsultaCrivoAutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.crivoauto.bucb.bradseg.com.br/", name = "consultaCrivoAutoResponse")
    public JAXBElement<ConsultaCrivoAutoResponse> createConsultaCrivoAutoResponse(ConsultaCrivoAutoResponse value) {
        return new JAXBElement<ConsultaCrivoAutoResponse>(_ConsultaCrivoAutoResponse_QNAME,
                ConsultaCrivoAutoResponse.class, null, value);
    }

}
