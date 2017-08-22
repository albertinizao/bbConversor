package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - List Element")
public class ListElementTest implements TestBBCodeTagGeneric<ListElement> {

    @Override
    public ListElement newBBTag() {
        return new ListElement();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[* param=\"1\"]prueba[/*]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[*]contenido[/*]", "<li>contenido</li>");
    }
}
