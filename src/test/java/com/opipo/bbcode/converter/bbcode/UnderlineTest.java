package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Underline")
public class UnderlineTest implements TestBBCodeTagGeneric<Underline> {

    @Override
    public Underline newBBTag() {
        return new Underline();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[u param=\"1\"]prueba[/u]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[u]contenido[/u]", "<span style=\"text-decoration: underline;\">contenido</span>");
    }
}
