package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Link")
public class LinkTest implements TestBBCodeTagGeneric<Link> {

    @Override
    public Link newBBTag() {
        return new Link();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[url param=\"1\"]prueba[/url]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[url]http://www.pagina.com[/url]", "<a href=\"http://www.pagina.com\">http://www.pagina.com</a>");
    }
}
