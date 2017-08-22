package com.opipo.bbcode.converter.html;

import java.util.Arrays;
import java.util.List;

public class Span extends HtmlTag {

    public Span(String content, String parameters){
        super(content,parameters);
    }

    public String getHTMLTag(){
        return "span";
    }

    public List<String> getHTMLParametersKeys(){
        return Arrays.asList(new String[]{"style"});
    }
}
