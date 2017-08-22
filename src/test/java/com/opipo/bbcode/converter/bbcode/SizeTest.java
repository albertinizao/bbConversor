package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Size")
public class SizeTest implements TestBBCodeTagGeneric<Size> {

    @Override
    public Size newBBTag() {
        return new Size();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[size param=\"1\"]prueba[/size]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[size=12]contenido[/size]", "<span style=\"font-size: 12px;\">contenido</span>");
    }
}
