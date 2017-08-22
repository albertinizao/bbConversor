package com.opipo.bbcode.converter.html;

public class Bold extends Span {

    public Bold(String content, String parameters){
        super(content,parameters);
        htmlParameters.put("style","font-weight: bold;");
    }
}
