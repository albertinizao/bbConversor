package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public interface TestBBCodeWithOtherTag<T extends BBTag> extends TestBBCode<T> {
    default String getIncorrectBBTag() {
        return "[j]prueba[/j]";
    }

    @Test
    @DisplayName("Incorrect conversion")
    default void whenCreateFakeThenNothingHappens() {
        assertEquals(getIncorrectBBTag(), newBBTag().execute(getIncorrectBBTag()));
    }

    @Test
    @DisplayName("Doesn't contain")
    default void whenCreateBBTagThenNotContainsIt() {
        assertFalse(newBBTag().contains(getIncorrectBBTag()));
    }
}
