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
}