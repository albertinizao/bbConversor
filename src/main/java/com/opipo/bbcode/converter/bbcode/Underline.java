package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Underline extends BBTag<com.opipo.bbcode.converter.html.Underline> {

    @Override
    public String getBBTag() {
        return "u";
    }

    @Override
    protected com.opipo.bbcode.converter.html.Underline buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.Underline(content,parameters);
    }
}
