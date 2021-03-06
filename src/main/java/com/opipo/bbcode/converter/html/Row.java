package com.opipo.bbcode.converter.html;

import java.util.Arrays;
import java.util.List;

public class Row extends HtmlTag {

    public Row(String content, String parameters) {
        super(content, parameters);
    }

    public String getHTMLTag() {
        return "tr";
    }

    public List<String> getHTMLParametersKeys() {
        return Arrays.asList(new String[]{"style"});
    }
}
