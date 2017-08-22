package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Row extends BBTag<com.opipo.bbcode.converter.html.Row> {

    @Override
    public String getBBTag() {
        return "tr";
    }

    @Override
    protected com.opipo.bbcode.converter.html.Row buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.Row(content,parameters);
    }
}
