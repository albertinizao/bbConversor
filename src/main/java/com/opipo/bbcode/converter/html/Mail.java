package com.opipo.bbcode.converter.html;

public class Mail extends A {

    public Mail(String content, String parameters) {
        super(content, parameters);
        htmlParameters.put("href", "mailto:" + htmlParameters.get("href"));
    }
}
