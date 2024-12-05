import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.security.PrivateKey; 
import java.security.PublicKey; 
import java.security.KeyFactory; 
import java.security.spec.X509EncodedKeySpec; 
import java.security.spec.PKCS8EncodedKeySpec; 
import javax.crypto.Cipher; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
 
public class OpenSSLExample { 
    public static void main(String[] args) { 
        try { 
            // Load public and private keys 
            PublicKey publicKey = loadPublicKey("public.key"); 
            PrivateKey privateKey = loadPrivateKey("private.key"); 
 
            // Encrypt the data 
            String dataToEncrypt = "SensitiveData"; 
            byte[] encryptedData = encrypt(publicKey, dataToEncrypt); 
            Path encryptedFilePath = Paths.get("sensitive.enc"); 
            Files.write(encryptedFilePath, encryptedData); 
 
            // Decrypt the data 
            byte[] decryptedData = decrypt(privateKey, encryptedData); 
            System.out.println("Decrypted Data: " + new String(decryptedData)); 
 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
 
    // Encrypt data using the public key 
    public static byte[] encrypt(PublicKey publicKey, String data) throws Exception { 
        Cipher cipher = Cipher.getInstance("RSA"); 
        cipher.init(Cipher.ENCRYPT_MODE, publicKey); 
        return cipher.doFinal(data.getBytes()); 
    } 
 
    // Decrypt data using the private key 
    public static byte[] decrypt(PrivateKey privateKey, byte[] encryptedData) throws 
Exception { 
        Cipher cipher = Cipher.getInstance("RSA"); 
        cipher.init(Cipher.DECRYPT_MODE, privateKey); 
        return cipher.doFinal(encryptedData); 
    } 
 
    // Load the public key from a file 
    public static PublicKey loadPublicKey(String filePath) throws Exception { 
        byte[] keyBytes = Files.readAllBytes(Paths.get(filePath)); 
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes); 
        KeyFactory keyFactory = KeyFactory.getInstance("RSA"); 
        return keyFactory.generatePublic(spec); 
    } 
 
    // Load the private key from a file 
    public static PrivateKey loadPrivateKey(String filePath) throws Exception { 
        byte[] keyBytes = Files.readAllBytes(Paths.get(filePath)); 
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes); 
        KeyFactory keyFactory = KeyFactory.getInstance("RSA"); 
        return keyFactory.generatePrivate(spec); 
    } 
}  
