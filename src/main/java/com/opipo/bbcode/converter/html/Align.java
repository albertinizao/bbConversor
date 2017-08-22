package com.opipo.bbcode.converter.html;

public class Align extends Div {

    public Align(String content, String parameters) {
        super(content, getParameters(parameters));
        htmlParameters.put("style", "text-align: " + getParamFromTag(parameters));
    }
}
