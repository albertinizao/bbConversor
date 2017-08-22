package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Color extends BBTag<com.opipo.bbcode.converter.html.Color> {

    @Override
    public String getBBTag() {
        return "color";
    }

    @Override
    protected com.opipo.bbcode.converter.html.Color buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.Color(content,parameters);
    }
}
