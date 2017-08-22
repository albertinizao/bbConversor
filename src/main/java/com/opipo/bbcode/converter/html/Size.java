package com.opipo.bbcode.converter.html;

public class Size extends Span {

    public Size(String content, String parameters) {
        super(content, getParameters(parameters));
        htmlParameters.put("style", "font-size: " + getParamFromTag(parameters) + "px;");
    }
}
