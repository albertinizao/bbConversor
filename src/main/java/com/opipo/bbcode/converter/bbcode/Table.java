package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Table extends BBTag<com.opipo.bbcode.converter.html.Table> {

    @Override
    public String getBBTag() {
        return "table";
    }

    @Override
    protected com.opipo.bbcode.converter.html.Table buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.Table(content,parameters);
    }
}
