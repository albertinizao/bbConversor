package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.html.Emphasize;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Italic extends BBTag<com.opipo.bbcode.converter.html.Emphasize> {

    @Override
    public String getBBTag() {
        return "i";
    }

    @Override
    protected Emphasize buildHtmlTag(String content, String parameters) {
        return new Emphasize(content,parameters);
    }
}
