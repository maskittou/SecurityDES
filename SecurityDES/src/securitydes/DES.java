/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package securitydes;

/**
 *
 * @author dell
 */
import java.io.*;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.*;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import sun.misc.BASE64Encoder;


public class DES {
   KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
   SecretKey myDesKey ;
     String strCipherText = new String();
 
		    Cipher desCipher;
 
		   
    
     public String decrypt(byte[] byteCipherText) throws IllegalBlockSizeException, BadPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchPaddingException
    {
      // Initialize the same cipher for decryption
        
  
		    desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
 byte[] byteDecryptedText = desCipher.doFinal(byteCipherText);
 

   String strDecryptedText = new String(byteDecryptedText);
    System.out.println(" Decrypted Text message is " +strDecryptedText);
    return strDecryptedText;
    } 
     
     public byte[] decryptBinary(byte[] byteCipherText) throws IllegalBlockSizeException, BadPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchPaddingException
    {
      // Initialize the same cipher for decryption
        
   
		    desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
 byte[] byteDecryptedText = desCipher.doFinal(byteCipherText);
 

   String strDecryptedText = new String(byteDecryptedText);
    System.out.println(" Decrypted Text message is " +strDecryptedText);
    return byteDecryptedText;
    }
     
     
    public byte[] encrypt(String strDataToEncrypt) throws IllegalBlockSizeException, BadPaddingException, InvalidKeyException
    {  
  
        desCipher.init(Cipher.ENCRYPT_MODE,myDesKey);

    byte[] byteDataToEncrypt = strDataToEncrypt.getBytes();
    byte[] byteCipherText = desCipher.doFinal(byteDataToEncrypt); 
    strCipherText = new BASE64Encoder().encode(byteCipherText);
   
    System.out.println("Cipher Text generated using des is " +strCipherText);
     return byteCipherText;
    }
    
     public byte[] encrypt(byte[] byteDataToEncrypt) throws IllegalBlockSizeException, BadPaddingException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException
    {  
        
                        // Initialize the cipher for encryption
		    desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
 
		 
 
		    // Encrypt the text
		    byte[] byteCipherText = desCipher.doFinal(byteDataToEncrypt);
 strCipherText = new BASE64Encoder().encode(byteCipherText);
      
    
   
    System.out.println("Cipher Text generated using des is " +strCipherText);
        System.out.println("Normal encrypted "+new String(byteCipherText));
     return byteCipherText;
    }
public DES ()throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException {


    //CreateTheKey();
desCipher = Cipher.getInstance("DES");
    

}


 public void SetKey(String keyString)
     {
         try
         {
    
  
  
  byte [] key=keyString.getBytes("ASCII");
  
myDesKey=new SecretKeySpec(key, "DES");
     }
         catch(Exception e)
         {e.printStackTrace();}
     
     }
   }
