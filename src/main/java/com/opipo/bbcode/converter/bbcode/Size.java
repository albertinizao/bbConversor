package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Size extends BBTag<com.opipo.bbcode.converter.html.Size> {

    @Override
    public String getBBTag() {
        return "size";
    }

    @Override
    protected com.opipo.bbcode.converter.html.Size buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.Size(content,parameters);
    }
}
