package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Align extends BBTag<com.opipo.bbcode.converter.html.Align> {

    @Override
    public String getBBTag() {
        return "align";
    }

    @Override
    protected com.opipo.bbcode.converter.html.Align buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.Align(content,parameters);
    }
}
