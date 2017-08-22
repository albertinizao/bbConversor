package com.opipo.bbcode.converter.html;

public class Strikethrough extends Span {

    public Strikethrough(String content, String parameters){
        super(content,parameters);
        htmlParameters.put("style","text-decoration: line-through;");
    }
}
