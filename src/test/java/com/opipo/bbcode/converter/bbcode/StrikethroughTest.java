package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Strikethrough")
public class StrikethroughTest implements TestBBCodeTagGeneric<Strikethrough> {

    @Override
    public Strikethrough newBBTag() {
        return new Strikethrough();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[s param=\"1\"]prueba[/s]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[s]contenido[/s]", "<span style=\"text-decoration: line-through;\">contenido</span>");
    }
}
