package com.opipo.bbcode.converter.bbcode;

import com.opipo.bbcode.converter.Pair;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BBCode - BreakLine")
public class BreakLineTest implements TestBBCodeCorrectConversion<BreakLine>, TestBBCodeWithOtherTag<BreakLine> {

    @Override
    public BreakLine newBBTag() {
        return new BreakLine();
    }

    @Override
    public Pair<String, String> getCorrectBBCodeAndHTMLTags() {
        return new Pair<>("inicio[br]final", "inicio<br/>final");
    }
}
