package com.stackroute.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurenceofWordTest {
    MultipleOccurenceofWord obj;

    @Before
    public void setup() {

        obj = new MultipleOccurenceofWord();
    }

    @Test
    public void MultipleOccurenceofwordinString() {
        String result = obj.FindMultipleOccurenceofWord("She sells seashells by the seashore","se");
        assertEquals("4-6 10-12 27-29", result);
    }
    @Test
    public void OccurenceofwordisNotinString() {
        String result = obj.FindMultipleOccurenceofWord("She sells seashells by the seashore","seha");
        assertEquals("Not found", result);
    }

}