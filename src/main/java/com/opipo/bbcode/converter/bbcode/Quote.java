package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Quote extends BBTag<com.opipo.bbcode.converter.html.Blockquote> {

    @Override
    public String getBBTag() {
        return "quote";
    }

    @Override
    protected com.opipo.bbcode.converter.html.Blockquote buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.Blockquote(content,parameters);
    }
}
