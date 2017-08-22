package com.opipo.bbcode.converter.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("BB conversion")
public class BBToHTMLConversionServiceTest {

    private BBToHTMLConversionService bbToHtmlConversionService = new BBToHTMLConversionService();

    @Test
    public void getAllTheBBTags() {
        assertNotNull(bbToHtmlConversionService.getBBCodeClasses());
        Arrays.stream(bbToHtmlConversionService.getBBCodeClasses()).forEach(f->System.out.println(f.getSimpleName()));
    }

    @Test
    public void converText() {
        assertEquals("<span style=\"font-weight: bold;\">pru<span style=\"font-style: italic;\">eba</span></span>", bbToHtmlConversionService.converText("[b]pru[i]eba[/i][/b]"));
    }

    @Test
    public void convertComplexTest2() {
        String original = "[b][u]BOLD[/u][/b]" +
                "[b][i]Italic[/i][/b]" ;
        System.out.println(bbToHtmlConversionService.converText(original));
    }

    @Test
    public void convertComplexTest() {
        String original = "[table]\n" +
                "[tr]\n" +
                "\t[td][list][*]elemento[/*][/list][/td]\n" +
                "\t[td][img]prueba.png[/img][/td]\n" +
                "\t[td][url]www.google.com[/url][/td]\n" +
                "[/tr]\n" +
                "[tr]\n" +
                "\t[td][b]Bold[/b][/td]\n" +
                "\t[td][u]Underline[/u][/td]\n" +
                "\t[td][i]Italic[/i][/td]\n" +
                "[/tr]\n" +
                "[/table]\n";
        System.out.println(bbToHtmlConversionService.converText(original));
        System.out.println(original);
    }

}
