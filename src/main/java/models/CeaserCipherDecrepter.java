package models;

public class CeaserCipherDecrepter {
  
  private String message;
  private int shift;
  private String decryption;
  
  public CeaserCipherDecrepter(String message, int shift) {
  this.message = message;
  this.shift = shift;
  }
  
  public String getMessage(){
    return this.message;
  }
  public int getShift(){
    return this.shift;
  }
  
  public String decreptMessage(CeaserCipherDecrepter decreptMessage){
    StringBuilder result = new StringBuilder();
    for (char word : message.toCharArray()){
      if (word != ' '){
        int oldLetter = word - 'a';
        int newLetter = (oldLetter + -shift) % 26;
        char newWord = (char) ('a' + newLetter);
        result.append(newWord);
        
      }else{
        result.append(word);
      }
    }
    String decreption = result.toString();
    return decreption;
  }

}
