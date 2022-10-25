package br.com.bradseg.bucb.crivoauto.comum;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Slf4j
@Component
public class NlsUtil {

    private final MessageSource messageSource;

    @Autowired
    public NlsUtil(MessageSource messageSource) {
        Assert.notNull(messageSource, "MessageSource não pode ser nulo");
        this.messageSource = messageSource;
    }

    public String getMensagem(String mensagem) {
        if (mensagem == null || "".equals(mensagem)) {
            return mensagem;
        }

        try {
            return messageSource.getMessage(mensagem, null, LocaleContextHolder.getLocale());
        } catch (NoSuchMessageException e) {
            log.info(e.getMessage(), e);
            return mensagem;
        }
    }
}
