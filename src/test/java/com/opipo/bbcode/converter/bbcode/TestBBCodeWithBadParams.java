package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public interface TestBBCodeWithBadParams<T extends BBTag> extends TestBBCode<T> {

    String getBBTagWithBadParams();

    @Test
    @DisplayName("Bad Params")
    default void whenCreateBoldWithBadParamsThenGetException(){
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> newBBTag().execute(getBBTagWithBadParams()));
    }
}
