package com.opipo.bbcode.converter.html;

import java.util.Arrays;
import java.util.List;

public class Blockquote extends HtmlTag {

    public Blockquote(String content, String parameters){
        super(content,parameters);
    }

    public String getHTMLTag(){
        return "blockquote";
    }

    public List<String> getHTMLParametersKeys(){
        return Arrays.asList(new String[]{""});
    }
}
