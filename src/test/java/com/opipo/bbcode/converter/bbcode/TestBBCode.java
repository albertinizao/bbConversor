package com.opipo.bbcode.converter.bbcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

@TestBBCodeTag
public interface TestBBCode<T extends BBTag> {

    T newBBTag();
}
