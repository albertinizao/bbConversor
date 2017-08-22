package com.opipo.bbcode.converter.html;

public class Underline extends Span {

    public Underline(String content, String parameters){
        super(content,parameters);
        htmlParameters.put("style","text-decoration: underline;");
    }
}
