package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Font extends BBTag<com.opipo.bbcode.converter.html.Font> {

    @Override
    public String getBBTag() {
        return "font";
    }

    @Override
    protected com.opipo.bbcode.converter.html.Font buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.Font(content,parameters);
    }
}
