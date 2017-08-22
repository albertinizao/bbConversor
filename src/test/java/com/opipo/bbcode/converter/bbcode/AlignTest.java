package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Align")
public class AlignTest implements TestBBCodeTagGeneric<Align> {

    @Override
    public Align newBBTag() {
        return new Align();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[align param=\"1\"]prueba[/align]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[align=left]contenido[/align]", "<div style=\"text-align: left\">contenido</div>");
    }
}
