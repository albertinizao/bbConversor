package com.opipo.bbcode.converter.html;

import java.util.Arrays;
import java.util.List;

public class Table extends HtmlTag {

    public Table(String content, String parameters) {
        super(content, parameters);
    }

    public String getHTMLTag() {
        return "table";
    }

    public List<String> getHTMLParametersKeys() {
        return Arrays.asList(new String[]{"style"});
    }
}
