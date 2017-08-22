package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Row")
public class RowTest implements TestBBCodeTagGeneric<Row> {

    @Override
    public Row newBBTag() {
        return new Row();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[tr param=\"1\"]prueba[/tr]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[tr]contenido[/tr]", "<tr>contenido</tr>");
    }
}
