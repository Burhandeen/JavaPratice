package Pratice;
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failure = 0;
        int studentCounter = 1;

        while (studentCounter <= 10){
            System.out.println("Enter result (1 = pass 2 = fail): ");
            int result = input.nextInt();

            if(result == 1){
                passes = passes + 1;
            }
            else{
                failure = failure + 1;
            }
            studentCounter = studentCounter + 1;
        }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failure);
        if (passes > 8) {
            System.out.println("Bonus to the instructor");
        }
    }
}
