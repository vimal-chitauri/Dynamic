
import sun.misc.IOUtils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Base64;

class CryptAES256 {

    public static void main(String[] args) throws FileNotFoundException {
        String originalString = "password";
        System.out.println("Original String to encrypt - " + originalString);
        // String encryptedString = encrypt(originalString);
        //  System.out.println("Encrypted String - " + encryptedString);
        FileInputStream fis = new FileInputStream("src/test/resources/stringtoolong.txt");



    }

    public static String decrypt(String encrypted) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] original = cipher.doFinal(Base64.getDecoder().decode(encrypted));

            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    private static final String key = "0000000000000000";
    private static final String initVector = "364BDF2ED77A8544D3B711A03B69EEADCC63C9D721BAA5A7007FEF19B7395EF9";
}

/*
public static String encrypt(String value) {
        try {
        IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

        byte[] encrypted = cipher.doFinal(value.getBytes());
        return Base64.encodeBase64String(encrypted);
        } catch (Exception ex) {
        ex.printStackTrace();
        }
        return null;
        }

        }*/
