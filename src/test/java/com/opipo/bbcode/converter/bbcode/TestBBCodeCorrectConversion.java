package com.opipo.bbcode.converter.bbcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public interface TestBBCodeCorrectConversion<T extends BBTag> extends TestBBCode<T> {
    Pair<String, String> getCorrectBBCodeAndHTMLTags();

    @Test
    @DisplayName("Correct conversion")
    default void whenCreateBBTagThenConverToHTMLTag() {
        Pair<String, String> pair = getCorrectBBCodeAndHTMLTags();
        assertEquals("initial"+pair.getRight()+"end",newBBTag().execute("initial"+pair.getLeft()+"end"));
    }

    @Test
    @DisplayName("Contains")
    default void whenCreateBBTagThenContainsIt() {
        Pair<String, String> pair = getCorrectBBCodeAndHTMLTags();
        assertTrue(newBBTag().contains(pair.getLeft()));
    }
}
