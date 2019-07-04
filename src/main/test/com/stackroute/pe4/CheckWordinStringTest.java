package com.stackroute.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckWordinStringTest {
    CheckWordinString obj;

    @Before
    public void setup() {

        obj = new CheckWordinString();
    }

    @Test
    public void CheckthewordinGivenString() {
        String result = obj.CheckNameintheString("This is Harry","Harry");
        assertEquals("true", result);
    }
    @Test
    public void WordisnotinGivenString() {
        String result = obj.CheckNameintheString("This is Henry","Harry");
        assertEquals("false", result);
    }



}