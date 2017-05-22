package com.akosbodor.get_the_middle_char;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MiddleExampleTests {
  @Test
  public void evenTests() {
    assertEquals("es", GetTheMiddleChar.getMiddle("test"));
    assertEquals("dd", GetTheMiddleChar.getMiddle("middle"));
  }
  
  @Test
  public void oddTests() {
    assertEquals("t", GetTheMiddleChar.getMiddle("testing"));
    assertEquals("A", GetTheMiddleChar.getMiddle("A"));
  }
}
