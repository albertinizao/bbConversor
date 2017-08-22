package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Color")
public class ColorTest implements TestBBCodeTagGeneric<Color> {

    @Override
    public Color newBBTag() {
        return new Color();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[color param=\"1\"]prueba[/color]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[color=red]contenido[/color]", "<span style=\"color: red\">contenido</span>");
    }
}
