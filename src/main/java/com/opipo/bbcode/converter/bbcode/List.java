package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.html.OrderedList;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class List extends BBTag<OrderedList> {

    @Override
    public String getBBTag() {
        return "list";
    }

    @Override
    protected OrderedList buildHtmlTag(String content, String parameters) {
        return new OrderedList(content,parameters);
    }
}
