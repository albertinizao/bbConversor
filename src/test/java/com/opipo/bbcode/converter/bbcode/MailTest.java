package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - Mail")
public class MailTest implements TestBBCodeTagGeneric<Mail> {

    @Override
    public Mail newBBTag() {
        return new Mail();
    }

    @Override
    public String getBBTagWithBadParams() {
        return "[mail param=\"1\"]prueba[/mail]";
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("[mail]pepe@correo.com[/mail]", "<a href=\"mailto:pepe@correo.com\">pepe@correo.com</a>");
    }
}
