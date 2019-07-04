package com.stackroute.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTheWordsTest {
    SortTheWords obj;

    @Before
    public void setup() {

        obj = new SortTheWords();
    }

    @Test
    public void SorttheWordsinString() {
        String result = obj.SortingtheWords("quick brown fox jumps");
        assertEquals("brown fox jumps quick", result);

    }
    @Test
    public void SorttheUpperCaseWordsinString() {
        String result = obj.SortingtheWords("String Seashore");
        assertEquals("Seashore String", result);

    }
    @Test
    public void SorttheWordsinParagraph() {
        String result = obj.SortingtheWords("are hello events that occur during the execution of programs that disrupt the normal flow of instructions In Java an exception is an object that wraps an error event that occurred within a method and contains Information about the error including its type");
        assertEquals("a about an an an and are contains disrupt during error error event events exception execution flow hello In including Information instructions is its Java method normal object occur occurred of of programs that that that that the the the type within wraps", result);

    }

}