package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Bold extends BBTag<com.opipo.bbcode.converter.html.Bold> {

    @Override
    public String getBBTag() {
        return "b";
    }

    @Override
    protected com.opipo.bbcode.converter.html.Bold buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.Bold(content,parameters);
    }
}
