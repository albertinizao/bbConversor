package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BreakLine extends BBTag<com.opipo.bbcode.converter.html.BrakLine> {

    @Override
    public String getBBTag() {
        return "br";
    }

    protected Boolean hasEndTag() {
        return false;
    }

    @Override
    protected com.opipo.bbcode.converter.html.BrakLine buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.BrakLine(content,parameters);
    }
}
