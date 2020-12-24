/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomkeygenerator;
/**
 * @author rafael
 */
import java.security.SecureRandom;

public class RandomKeyGenerator {
    //Dados para criação das chaves
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String CHAR_SPECIAL = "!@#$%&*?~";
    
    private static final String DATA_FOR_RANDONS = CHAR_LOWER + CHAR_UPPER + NUMBER + CHAR_SPECIAL;
    private static final SecureRandom random = new SecureRandom();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Apresentação de todos os dados
        */
        
        System.out.println("dados :" + DATA_FOR_RANDONS);
        
        for (int i = 0; i < 3; i++) {
            //Geração das chaves e apresentação das mesmas envoltas em um laço repetitivo
            String Result = generateRandomString(16);
            System.out.println(Result);
        }
    }
    public static String generateRandomString(int length) {
        if (length < 1) throw new IllegalArgumentException();
        
        StringBuilder sb = new StringBuilder(length);
        
        for (int i=0; i < length; i++) {
            int rndCharAt = random.nextInt(DATA_FOR_RANDONS.length());
            char rndChar = DATA_FOR_RANDONS.charAt(rndCharAt);
            /**debug
            * System.out.format("%d\t:\t%c%n", rndCharAt, rndChar);
            */
            sb.append(rndChar);
        }
        return sb.toString();
    }
}
