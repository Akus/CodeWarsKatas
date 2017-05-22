package com.akosbodor.shortest_word;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortestWordTest {
    @Test
    public void findShort_Test1() throws Exception {
        assertEquals(3, ShortestWord.FindShort("bitcoin take over the world maybe who knows perhaps"));
    }
    
    @Test
    public void findShort_Test2() throws Exception {
        assertEquals(3, ShortestWord.FindShort("turns out random test cases are easier than writing out basic ones"));
    }

}