package com.opipo.bbcode.converter.html;

import java.util.Arrays;
import java.util.List;

public class OrderedList extends HtmlTag {

    public OrderedList(String content, String parameters){
        super(content,getParameters(parameters));
        String paramNeded = getParamFromTag(parameters);
        String val = paramNeded.length()!=1?"circle":
                ("1".equalsIgnoreCase(paramNeded)?"numeric":
                        ("a".equalsIgnoreCase(paramNeded)?"alpha":"circle"));
        htmlParameters.put("style", "list-style-type: " + val);
    }

    public String getHTMLTag(){
        return "ol";
    }

    public List<String> getHTMLParametersKeys(){
        return Arrays.asList(new String[]{"style"});
    }
}
