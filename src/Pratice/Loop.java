package Pratice;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int val = input.nextInt();
        String choice;

        switch (val){
            case 1:
               choice = "Home";
                break;
            case 2:
                choice = "About us";
                break;
            case 3:
                choice = "Contact us";
                break;
            case 4:
                choice = "Help";
                break;
            default:
                choice = "Click on 1 to go back";
                break;
        }
        System.out.printf("%s", choice);
    }
}
