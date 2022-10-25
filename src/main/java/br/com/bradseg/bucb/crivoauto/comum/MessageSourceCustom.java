package br.com.bradseg.bucb.crivoauto.comum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContextHolder;

@Configuration
public class MessageSourceCustom {

    private final MessageSource messageSource;

    private static final String MENSAGEM_NAO_EXISTE = "Mensagem não existe.";

    @Autowired
    public MessageSourceCustom(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String getMessage(String msg) {
        return messageSource.getMessage(msg, null, MENSAGEM_NAO_EXISTE, LocaleContextHolder.getLocale());
    }

}
