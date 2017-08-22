package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Code")
public class CodeTest implements TestBBCodeTagGeneric<Code> {

    @Override
    public Code newBBTag() {
        return new Code();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[code param=\"1\"]prueba[/code]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[code]contenido[/code]", "<pre>contenido</pre>");
    }
}
