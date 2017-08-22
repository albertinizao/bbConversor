package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Image extends BBTag<com.opipo.bbcode.converter.html.Image> {

    @Override
    public String getBBTag() {
        return "img";
    }

    @Override
    protected com.opipo.bbcode.converter.html.Image buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.Image(content,parameters);
    }
}
