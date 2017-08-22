package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Link (word)")
public class LinkWordTest implements TestBBCodeTagGeneric<Link> {

    @Override
    public Link newBBTag() {
        return new Link();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[url=pepe juan=otro]prueba[/url]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[url=http://www.pagina.com]contenido[/url]", "<a href=\"http://www.pagina.com\">contenido</a>");
    }
}
