package com.opipo.bbcode.converter.html;

public class Font extends Span {

    public Font(String content, String parameters) {
        super(content, getParameters(parameters));
        htmlParameters.put("style", "font-family: " + getParamFromTag(parameters));
    }
}
