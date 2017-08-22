package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Cell extends BBTag<com.opipo.bbcode.converter.html.Cell> {

    @Override
    public String getBBTag() {
        return "td";
    }

    @Override
    protected com.opipo.bbcode.converter.html.Cell buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.Cell(content,parameters);
    }
}
