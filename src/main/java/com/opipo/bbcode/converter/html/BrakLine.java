package com.opipo.bbcode.converter.html;

import java.util.Arrays;
import java.util.List;

public class BrakLine extends HtmlTag {

    public BrakLine(String content, String parameters){
        super(content,parameters);
    }

    public String getHTMLTag(){
        return "br/";
    }

    public List<String> getHTMLParametersKeys(){
        return Arrays.asList(new String[]{});
    }

    protected Boolean hasEndTag() {
        return false;
    }
}
