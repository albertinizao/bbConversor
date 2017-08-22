package com.opipo.bbcode.converter.html;

import java.util.Arrays;
import java.util.List;

public class Div extends HtmlTag {

    public Div(String content, String parameters){
        super(content,parameters);
    }

    public String getHTMLTag(){
        return "div";
    }

    public List<String> getHTMLParametersKeys(){
        return Arrays.asList(new String[]{"style"});
    }
}
