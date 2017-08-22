package com.opipo.bbcode.converter.html;

import java.util.Arrays;
import java.util.List;

public class A extends HtmlTag {

    public A(String content, String parameters) {
        super(content, getParameters(parameters));
        htmlParameters.put("href",
                getParamFromTag(parameters).isEmpty() ?
                        content :
                        getParamFromTag(parameters));
    }

    public String getHTMLTag() {
        return "a";
    }

    public List<String> getHTMLParametersKeys() {
        return Arrays.asList(new String[]{"href"});
    }
}
