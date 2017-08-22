package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Image")
public class ImageTest implements TestBBCodeTagGeneric<Image> {

    @Override
    public Image newBBTag() {
        return new Image();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[img param=\"1\"]prueba[/img]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[img]http://www.pagina.com/image.png[/img]", "<img src=\"http://www.pagina.com/image.png\"></img>");
    }
}
