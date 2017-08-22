package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Cell")
public class CellTest implements TestBBCodeTagGeneric<Cell> {

    @Override
    public Cell newBBTag() {
        return new Cell();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[td param=\"1\"]prueba[/td]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[td]contenido[/td]", "<td>contenido</td>");
    }
}
