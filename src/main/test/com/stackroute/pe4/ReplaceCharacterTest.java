package com.stackroute.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {
    ReplaceCharacter obj;

    @Before
    public void setup() {

        obj = new ReplaceCharacter();
    }

    @Test
    public void ReplacetheCharacter() {
        String result = obj.ReplaceCharacterwithAnotherCharacter("daily dry");
        assertEquals("faity fry", result);
    }
    @Test
    public void CharacterNotFound() {
        String result = obj.ReplaceCharacterwithAnotherCharacter("aily ry");
        assertEquals("aity ry", result);
    }

}