package com.opipo.bbcode.converter.html;

import java.util.Arrays;
import java.util.List;

public class Pre extends HtmlTag {

    public Pre(String content, String parameters){
        super(content,parameters);
    }

    public String getHTMLTag(){
        return "pre";
    }

    public List<String> getHTMLParametersKeys(){
        return Arrays.asList(new String[]{""});
    }
}
