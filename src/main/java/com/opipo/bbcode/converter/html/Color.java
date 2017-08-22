package com.opipo.bbcode.converter.html;

public class Color extends Span {

    public Color(String content, String parameters) {
        super(content, getParameters(parameters));
        htmlParameters.put("style", "color: " + getParamFromTag(parameters));
    }
}
