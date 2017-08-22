package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - List")
public class ListTest implements TestBBCodeTagGeneric<List> {

    @Override
    public List newBBTag() {
        return new List();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[list param=\"1\"]prueba[/list]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[list]contenido[/list]", "<ol style=\"list-style-type: circle\">contenido</ol>");
    }
}
