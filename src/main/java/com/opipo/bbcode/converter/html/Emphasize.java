package com.opipo.bbcode.converter.html;

import java.util.Arrays;
import java.util.List;

public class Emphasize extends Span {

    public Emphasize(String content, String parameters) {
        super(content, parameters);
        htmlParameters.put("style", "font-style: italic;");
    }
}
