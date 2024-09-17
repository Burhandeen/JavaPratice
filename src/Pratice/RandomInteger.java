package Pratice;
import java.security.SecureRandom;

public class RandomInteger {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom(); // An instance of secure random used to generate random numbers

        for(int counter = 1; counter <= 20; counter++){
            int face = 1 + random.nextInt(6);
            System.out.printf("%d", face);

            if(counter % 5 == 0){
                System.out.println();
            }
        }
    }
}
