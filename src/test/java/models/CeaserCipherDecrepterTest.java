package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeaserCipherDecrepterTest {
  @Test
  public void newCeaserCipherDecrepter_instantiatesCorrectly() {
    CeaserCipherDecrepter testCeaserCipherDecrepter = new CeaserCipherDecrepter("lipps", 4);
    assertEquals(true, testCeaserCipherDecrepter instanceof CeaserCipherDecrepter);
  }
  
  @Test
  public void newCeaserCipherDecrepter_newMessageInput() {
    CeaserCipherDecrepter testCeaserCipherDecrepter = new CeaserCipherDecrepter("lipps", 4);
    assertEquals("lipps", testCeaserCipherDecrepter.getMessage());
  }
  
  @Test
  public void newCeaserCipherDecrepter_newShiftInput() {
    CeaserCipherDecrepter testCeaserCipherDecrepter = new CeaserCipherDecrepter("lipps", 4);
    assertEquals(4, testCeaserCipherDecrepter.getShift());
  }
  
  @Test
  public void newCeaserCipherDecrepter_decreptMessage() {
    CeaserCipherDecrepter testCeaserCipherDecreptor = new CeaserCipherDecrepter("lipps", 4);
    assertEquals("hello", testCeaserCipherDecreptor.decreptMessage(testCeaserCipherDecreptor));
  }
}