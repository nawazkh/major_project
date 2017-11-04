
 
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;



public class GenerateSymmetricKeys {

    private static void generateKey(String keyAlgorithm) {

        try {

            KeyGenerator keyGen = KeyGenerator.getInstance(keyAlgorithm);
            SecretKey key = keyGen.generateKey();

            System.out.println(
                    "\n" +
                    "Generating symmetric key using " +
                    key.getAlgorithm() + 
                    " algorithm");

            
            byte[] keyBytes = key.getEncoded();
            int numBytes = keyBytes.length;

            System.out.println(
                    "  The number of bytes in the key = " +
                    numBytes + ".");

                 SecretKey key2 = new SecretKeySpec(keyBytes, keyAlgorithm);
            System.out.println(
                "  Are both symmetric keys equal? " + key.equals(key2));

        } catch (NoSuchAlgorithmException e) {

            System.out.println("Exception");
            System.out.println("No such algorithm: " + keyAlgorithm);

        }

    }


    public static void main(String[] args) {

        
        generateKey("Des");

        
        generateKey("Blowfish");

        
        generateKey("DESede");
    }

}


