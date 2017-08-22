package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Bold")
public class BoldTest implements TestBBCodeTagGeneric<Bold> {

    @Override
    public Bold newBBTag() {
        return new Bold();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[b param=\"1\"]prueba[/b]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[b]contenido[/b][b]contenido2[/b]", "<span style=\"font-weight: bold;\">contenido</span>[b]contenido2[/b]");
    }
}
