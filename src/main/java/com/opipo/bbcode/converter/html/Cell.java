package com.opipo.bbcode.converter.html;

import java.util.Arrays;
import java.util.List;

public class Cell extends HtmlTag {

    public Cell(String content, String parameters) {
        super(content, parameters);
    }

    public String getHTMLTag() {
        return "td";
    }

    public List<String> getHTMLParametersKeys() {
        return Arrays.asList(new String[]{"style"});
    }
}
