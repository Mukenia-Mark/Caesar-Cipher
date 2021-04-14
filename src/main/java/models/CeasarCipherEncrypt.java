package models;

public class CeasarCipherEncrypt {
  
  private String message;
  private int shift;
  private String encryption;
  
  public CeasarCipherEncrypt(String message, int shift) {
    this.message = message;
    this.shift = shift;
  
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public int getShift() {
    return this.shift;
  }
 
 
 public String encryptMessage(CeasarCipherEncrypt encryptMessage){
    StringBuilder result = new StringBuilder();
    for (char word : message.toCharArray()){
      if (word != ' '){
        int oldLetter = word - 'a';
        int newLetter = (oldLetter + shift) % 26;
        char newWord = (char) ('a' + newLetter);
        result.append(newWord);
      }else{
        result.append(word);
      }
    }
   String encryption = result.toString();
   return encryption;
  }

}
