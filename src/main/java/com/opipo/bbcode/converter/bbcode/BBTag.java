package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.html.HtmlTag;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class BBTag<T extends HtmlTag> {
    public abstract String getBBTag();

    public String execute(String original) {
        try {
            String endTag = "[" + (hasEndTag() ? "/" : "") + getBBTag().replaceAll("\\\\", "") + "]";
            String toSearch = original.substring(0, endTag.length() + original.indexOf(endTag));
            String lastPart = original.substring(toSearch.length());
            Matcher matcher = getMatcher(toSearch);
            if (matcher.find()) {
                return matcher.group(1) + buildHtmlTag(hasEndTag() ? matcher.group(3) : "",
                        matcher.group(2)).toString() + lastPart;
            } else {
                return original;
            }
        } catch (java.lang.IllegalStateException ise) {
            return original;
        }
    }

    public Boolean contains(String original) {
        return getMatcher(original).find();
    }

    protected Matcher getMatcher(String text) {
        return Pattern.compile(getStringPatter()).matcher(text);
    }

    protected Boolean hasEndTag() {
        return true;
    }

    public String getStringPatter() {
        String endTag = hasEndTag() ? "(.*?)\\[/" + getBBTag() + "\\]" : "";
        return "(.*?)\\[" + getBBTag() + "[ ]*?[=]?(.*?)\\]" + endTag;
    }

    protected abstract T buildHtmlTag(String content, String parameters);
}
