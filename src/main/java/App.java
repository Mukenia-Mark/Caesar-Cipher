import models.CeasarCipherEncrypt;
import models.CeaserCipherDecrepter;

import java.beans.Encoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
  public static void main(String[] args){
    boolean programRunning=true;
    while (programRunning) {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Welcome to this Caesar Cipher.");
      System.out.println("Would you like to encrypt a message, decrypt an message, or exit? Enter" +
                         " one of the following: Encrypt, Decrypt, or Exit.");
      
      try {
        String navigationChoice = bufferedReader.readLine();
        
        if (navigationChoice.equals("Encrypt")){
          System.out.println("Please enter the message you would like me to encrypt: ");
          String message = bufferedReader.readLine();
          System.out.println("Please enter the number of characters you want your message shifted" +
                             " by: ");
          int shift = Integer.parseInt(bufferedReader.readLine());
          CeasarCipherEncrypt ceasarCipherEncrypt = new CeasarCipherEncrypt(message, shift);
          String encryptedMessage = ceasarCipherEncrypt.encryptMessage(ceasarCipherEncrypt);
          System.out.println("Here is your encrypted message: "+ encryptedMessage);
          
        }else if(navigationChoice.equals("Decrypt")){
          System.out.println("Please enter the message you would like me to decrypt: ");
          String message = bufferedReader.readLine();
          System.out.println("Please enter the number of characters that your message was shifted" +
                             " by: ");
          int shift = Integer.parseInt(bufferedReader.readLine());
          CeaserCipherDecrepter ceaserCipherDecrepter = new CeaserCipherDecrepter(message, shift);
          String decryptedMessage = ceaserCipherDecrepter.decreptMessage(ceaserCipherDecrepter);
          System.out.println("Here is your decrypted message: "+ decryptedMessage);
          
          
        }else if(navigationChoice.equals("Exit")){
          System.out.println("Goodbye!");
          programRunning = false;
        }else{
          System.out.println("I'm sorry, I don't recognise your input.");
        }
      }
      catch (IOException e){
        e.printStackTrace();
      }
    }
  }
}