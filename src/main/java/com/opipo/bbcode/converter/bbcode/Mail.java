package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Mail extends BBTag<com.opipo.bbcode.converter.html.Mail> {

    @Override
    public String getBBTag() {
        return "mail";
    }

    @Override
    protected com.opipo.bbcode.converter.html.Mail buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.Mail(content,parameters);
    }
}
