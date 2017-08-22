package com.opipo.bbcode.converter.html;

import java.util.Arrays;
import java.util.List;

public class Li extends HtmlTag {

    public Li(String content, String parameters){
        super(content,parameters);
    }

    public String getHTMLTag(){
        return "li";
    }

    public List<String> getHTMLParametersKeys(){
        return Arrays.asList(new String[]{"style"});
    }
}
