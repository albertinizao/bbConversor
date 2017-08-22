package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Code extends BBTag<com.opipo.bbcode.converter.html.Pre> {

    @Override
    public String getBBTag() {
        return "code";
    }

    @Override
    protected com.opipo.bbcode.converter.html.Pre buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.Pre(content,parameters);
    }
}
