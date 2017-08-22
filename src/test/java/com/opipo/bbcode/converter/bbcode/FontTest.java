package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Font")
public class FontTest implements TestBBCodeTagGeneric<Font> {

    @Override
    public Font newBBTag() {
        return new Font();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[font param=\"1\"]prueba[/font]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[font=Verdana]contenido[/font]", "<span style=\"font-family: Verdana\">contenido</span>");
    }
}
