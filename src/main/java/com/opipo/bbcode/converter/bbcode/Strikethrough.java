package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Strikethrough extends BBTag<com.opipo.bbcode.converter.html.Strikethrough> {

    @Override
    public String getBBTag() {
        return "s";
    }

    @Override
    protected com.opipo.bbcode.converter.html.Strikethrough buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.Strikethrough(content,parameters);
    }
}
