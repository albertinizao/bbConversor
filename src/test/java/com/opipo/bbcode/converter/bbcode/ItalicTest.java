package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Italic")
public class ItalicTest implements TestBBCodeTagGeneric<Italic> {

    @Override
    public Italic newBBTag() {
        return new Italic();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[i param=\"1\"]prueba[/i]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[i]contenido[/i]", "<span style=\"font-style: italic;\">contenido</span>");
    }
}
