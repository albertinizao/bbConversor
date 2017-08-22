package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Table")
public class TableTest implements TestBBCodeTagGeneric<Table> {

    @Override
    public Table newBBTag() {
        return new Table();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[table param=\"1\"]prueba[/table]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[table]contenido[/table]", "<table>contenido</table>");
    }
}
