package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.html.A;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Link extends BBTag<A> {

    @Override
    public String getBBTag() {
        return "url";
    }

    @Override
    protected A buildHtmlTag(String content, String parameters) {
        return new A(content,parameters);
    }
}
