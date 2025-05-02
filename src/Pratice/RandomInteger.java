package Pratice;
import java.security.SecureRandom;

public class RandomInteger {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom(); // An instance of secure random used to generate random numbers
        System.out.println(random.nextInt(6));
    }
}
