package com.hasher;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * This class manage all methods in matter of hashing with SHA256 algorithm
 * This class use Singleton design pattern because we need just a single instance 
 * to do the job of resume into a hash any String 
 * @author Mario Carranza Mena B51573
 */
public class Hasher {
    
    private static Hasher instance;
    
    private Hasher() {
    }
    
    public static Hasher getInstance() {
        if (instance == null) {
            instance = new Hasher();
        }   
        return instance;
    }
     /**
      * @return String object with a SHA256 representation from requested String
      * @param hashRequest String to be processed throught Sha256 algorithm
      */
    public String getHash(String hashRequest) {    
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] bytedHash = digest.digest(hashRequest.getBytes(StandardCharsets.UTF_8));
            StringBuffer hexadecimal = new StringBuffer();
            for (int i = 0; i < bytedHash.length; i++) {
	    String hex = Integer.toHexString(0xff & bytedHash[i]);
	    if(hex.length() == 1) hexadecimal.append('0');
	        hexadecimal.append(hex);
	    }
	    return hexadecimal.toString();
            
        } catch (NoSuchAlgorithmException ex) {
            System.err.println("SHA256 Get Hash Exception: " + ex.getMessage());
        }
        return "NotAllowed";
    }
}
