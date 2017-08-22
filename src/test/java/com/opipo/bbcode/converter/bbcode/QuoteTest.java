package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Quote")
public class QuoteTest implements TestBBCodeTagGeneric<Quote> {

    @Override
    public Quote newBBTag() {
        return new Quote();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[quote param=\"1\"]prueba[/quote]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[quote]contenido[/quote]", "<blockquote>contenido</blockquote>");
    }
}
