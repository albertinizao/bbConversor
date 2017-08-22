package com.opipo.bbcode.converter.html;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoldTest {

    @Test
    public void whenCreateBoldIsBold(){
        Bold bold = new Bold("contenido","");
        assertEquals("<span style=\"font-weight: bold;\">contenido</span>", bold.toString());
    }

    @Test
    public void whenCreateBoldIsBold2(){
        Bold bold = new Bold("","");
        assertEquals("<span style=\"font-weight: bold;\"></span>", bold.toString());
    }
}
