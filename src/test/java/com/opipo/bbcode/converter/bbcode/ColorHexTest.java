package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Color (hex)")
public class ColorHexTest implements TestBBCodeTagGeneric<Color> {

    @Override
    public Color newBBTag() {
        return new Color();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[color=#FF0000 param=\"1\"]prueba[/color]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[color=#FF0000]contenido[/color]", "<span style=\"color: #FF0000\">contenido</span>");
    }
}
