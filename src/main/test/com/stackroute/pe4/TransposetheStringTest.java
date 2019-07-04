package com.stackroute.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposetheStringTest {
    TransposetheString obj;

    @Before
    public void setup() {

        obj = new TransposetheString();
    }

    @Test
    public void ReverseEachWordinGivenString() {
        String result = obj.TransposetheGivenString("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god", result);

    }
    @Test
    public void StringcontainSpecialCharacter() {
        String result = obj.TransposetheGivenString("a quick br@#wn fox");
        assertEquals("a kciuq nw#@rb xof", result);

    }

}