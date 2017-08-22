package com.opipo.bbcode.converter.bbcode;

public interface TestBBCodeTagGeneric<T extends BBTag> extends TestBBCodeCorrectConversion<T>, TestBBCodeWithBadParams<T>, TestBBCodeWithOtherTag<T> {
}
