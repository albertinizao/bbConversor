package com.opipo.bbcode.converter.services;

import com.opipo.bbcode.converter.bbcode.BBTag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("BB conversion")
public class BBToHTMLConversionServiceTest {

    private BBToHTMLConversionService bbToHtmlConversionService = new BBToHTMLConversionService();

    @Test
    @DisplayName("Get all bbCode classes")
    public void getAllTheBBTags() {
        Class<? extends BBTag>[] classes = bbToHtmlConversionService.getBBCodeClasses();
        assertNotNull(classes);
    }

    @Test
    public void converText() {
        assertEquals("<span style=\"font-weight: bold;\">pru<span style=\"font-style: italic;\">eba</span></span>", bbToHtmlConversionService.converText("[b]pru[i]eba[/i][/b]"));
    }

    @Test
    public void convertComplexTest2() {
        String original = "[b][u]BOLD[/u][/b]" +
                "[b][i]Italic[/i][/b]";
        assertEquals("<span style=\"font-weight: bold;\"><span style=\"text-decoration: underline;\">BOLD</span></span><span style=\"font-weight: bold;\"><span style=\"font-style: italic;\">Italic</span></span>",bbToHtmlConversionService.converText(original));
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
        assertEquals("<table><br/><tr><br/> <td><ol style=\"list-style-type: circle\"><li>elemento</li></ol></td><br/> <td><img src=\"prueba.png\"></img></td><br/> <td><a href=\"www.google.com\">www.google.com</a></td><br/></tr><br/><tr><br/> <td><span style=\"font-weight: bold;\">Bold</span></td><br/> <td><span style=\"text-decoration: underline;\">Underline</span></td><br/> <td><span style=\"font-style: italic;\">Italic</span></td><br/></tr><br/></table><br/>\n",bbToHtmlConversionService.converText(original));
    }

}
