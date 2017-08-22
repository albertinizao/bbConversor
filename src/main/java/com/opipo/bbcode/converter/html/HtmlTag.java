package com.opipo.bbcode.converter.html;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public abstract class HtmlTag {

    protected Map<String, String> htmlParameters = new ConcurrentHashMap<>();
    protected String content;

    protected HtmlTag(String content, String parameters) {
        super();
        this.content = content;
        setParameters(parameters);
    }

    public abstract String getHTMLTag();

    protected Boolean hasEndTag() {
        return true;
    }

    public String getHTMLEndTag() {
        if (hasEndTag()) {
            StringBuilder sb = new StringBuilder();
            sb.append("</");
            sb.append(getHTMLTag());
            sb.append(">");
            return sb.toString();
        } else {
            return null;
        }
    }

    abstract List<String> getHTMLParametersKeys();

    public void setParameters(String parameters) {
        parameters = parameters.trim();
        while (parameters.contains("  ")) {
            parameters = parameters.replaceAll("  ", " ");
        }
        if (!parameters.isEmpty()) {
            String[] params = parameters.split(" ");
            for (String param : params) {
                param.replaceAll(" ", "");
                String[] dupla = param.split("=");
                if (getHTMLParametersKeys().contains(dupla[0])) {
                    htmlParameters.put(dupla[0], dupla.length > 1 ? dupla[1] : "");
                } else  if (!dupla[0].isEmpty()){
                    throw new IllegalArgumentException(dupla[0] + " is not a valid parameters for " + getHTMLTag());
                }
            }
        }
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(getHTMLTag());
        sb.append(htmlParameters.isEmpty()?"":" ");
        sb.append(htmlParameters.entrySet().stream().map(e -> (new StringBuilder()).append(e.getKey()).append("=\"").append(e.getValue()).append("\"").toString()).collect(Collectors.joining(" ")));
        sb.append(">");
        sb.append(content);
        if (this.hasEndTag()) {
            sb.append(getHTMLEndTag());
        }
        return sb.toString();
    }

    protected static String getParameters(String parameters) {
        return parameters.contains(" ")?parameters.substring(parameters.indexOf(" ")):"";
    }

    protected static String getParamFromTag(String parameters){
        return parameters.contains(" ")?parameters.substring(0,parameters.indexOf(" ")):parameters;
    }


}
