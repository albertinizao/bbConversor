package com.opipo.bbcode.converter.bbcode;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Center extends BBTag<com.opipo.bbcode.converter.html.Center> {

    @Override
    public String getBBTag() {
        return "center";
    }

    @Override
    protected com.opipo.bbcode.converter.html.Center buildHtmlTag(String content, String parameters) {
        return new com.opipo.bbcode.converter.html.Center(content,parameters);
    }
}
