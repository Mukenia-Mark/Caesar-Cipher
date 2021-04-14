package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeasarCipherEncryptTest {
  @Test
  public void newCeaserCipherEncrypt_instantiatesCorrectly() {
    CeasarCipherEncrypt testCeaserCipherEncrypt = new CeasarCipherEncrypt("hello", 4);
    assertEquals(true, testCeaserCipherEncrypt instanceof CeasarCipherEncrypt);
  }
  
  @Test
  public void newCeaserCipherEncrypt_newMessageInput() {
    CeasarCipherEncrypt testCeaserCipherEncrypt = new CeasarCipherEncrypt("hello",4);
    assertEquals("hello", testCeaserCipherEncrypt.getMessage());
  }
  
  @Test
  public void newCeaserCipherEncrypt_newShiftInput() {
    CeasarCipherEncrypt testCeaserCipherEncrypt = new CeasarCipherEncrypt("hello", 4);
    assertEquals(4, testCeaserCipherEncrypt.getShift());
  }
}