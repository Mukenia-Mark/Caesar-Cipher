package models;

public class CeaserCipherDecrepter {
  
  private String message;
  
  public CeaserCipherDecrepter(String message, int shift) {
  this.message = message;
  }
  
  public String getMessage(){
    return this.message;
  }
}
