package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Center")
public class CenterTest implements TestBBCodeTagGeneric<Center> {

    @Override
    public Center newBBTag() {
        return new Center();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[center param=\"1\"]prueba[/center]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[center]contenido[/center]", "<center>contenido</center>");
    }
}
