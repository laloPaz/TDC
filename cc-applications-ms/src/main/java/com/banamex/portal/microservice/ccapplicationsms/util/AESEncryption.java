package com.banamex.portal.microservice.ccapplicationsms.util;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class AESEncryption {
	
	private static final String password = "^The_chance_wont_come_again_And_dont_speak_too_soon_For_the_wheel_is_still_in_spin_And_there_is_no_telling_who_That_its_naming_For_the_loser_now_Will_be_later_to_win_For_the_times_they_are_a-changing^";
    private static final String salt = "^S4l4t#f-$24d08m1988yt4mp1c0$02s12dds1212212@$@4&~#%^$*";
	private static int pswdIterations = 65536  ;
    private static int keySize = 256;
    private final byte[] ivBytes = Base64.decodeBase64("YNpQKRzrA6DkNxCgQd5YIQ==");
    
    @SuppressWarnings("static-access")
	public String encrypt(String plainText) throws Exception {   
        
        byte[] saltBytes = salt.getBytes("UTF-8");
        
        
        /* Derive the key. */
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        PBEKeySpec spec = new PBEKeySpec(
                password.toCharArray(), 
                saltBytes, 
                pswdIterations, 
                keySize
        );
        SecretKey secretKey = factory.generateSecret(spec);
        SecretKeySpec secret = new SecretKeySpec(secretKey.getEncoded(), "AES");
        
        /* Encrypt the message. */
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secret, new IvParameterSpec(ivBytes));
        byte[] encryptedTextBytes = cipher.doFinal(plainText.getBytes("UTF-8"));
        
        return new Base64().encodeBase64String(encryptedTextBytes);
    }
    
    
    
    @SuppressWarnings("static-access")
    public String decrypt(String encryptedText) throws Exception {
 
        byte[] saltBytes = salt.getBytes("UTF-8");
        byte[] encryptedTextBytes = new Base64().decodeBase64(encryptedText);
 
        /* Derive the key */
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        PBEKeySpec spec = new PBEKeySpec(
                password.toCharArray(), 
                saltBytes, 
                pswdIterations, 
                keySize
                );
        SecretKey secretKey = factory.generateSecret(spec);
        SecretKeySpec secret = new SecretKeySpec(secretKey.getEncoded(), "AES");
        
        /* Decrypt the message. */
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(ivBytes));
        byte[] decryptedTextBytes = null;
        try {
            decryptedTextBytes = cipher.doFinal(encryptedTextBytes);
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        
        return new String(decryptedTextBytes);
    }
    
}
