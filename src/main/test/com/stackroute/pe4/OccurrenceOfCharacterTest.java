package com.stackroute.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrenceOfCharacterTest {
    OccurrenceOfCharacter obj;

    @Before
    public void setup() {

        obj = new OccurrenceOfCharacter();
    }

    @Test
    public void CounttheOccurrenceOfCharacter() {
        int result = obj.CountOccurrenceOfCharacter("Java is java again java again", 'a');
        assertEquals(10, result);

    }
    @Test
    public void CharacterNotFoundinString() {
        int result = obj.CountOccurrenceOfCharacter("Java is java again java again", 'e');
        assertEquals(0, result);

    }
}