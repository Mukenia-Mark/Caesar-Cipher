package models;

public class CeasarCipherEncrypt {
  
  private String message;
  private int shift;
  
  public CeasarCipherEncrypt(String message, int shift) {
    this.message = message;
    this.shift = shift;
  }
  public String getMessage(){
    return this.message;
  }
  public int getShift(){
    return this.shift;
  }
}
