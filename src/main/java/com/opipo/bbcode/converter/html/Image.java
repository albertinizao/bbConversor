package com.opipo.bbcode.converter.html;

import java.util.Arrays;
import java.util.List;

public class Image extends HtmlTag {

    public Image(String content, String parameters) {
        super("", parameters);
        htmlParameters.put("src",content);
    }

    public String getHTMLTag() {
        return "img";
    }

    public List<String> getHTMLParametersKeys() {
        return Arrays.asList(new String[]{"src"});
    }
}
