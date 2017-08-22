package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.html.Li;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ListElement extends BBTag<Li> {

    @Override
    public String getBBTag() {
        return "\\*";
    }

    @Override
    protected Li buildHtmlTag(String content, String parameters) {
        return new Li(content,parameters);
    }
}
