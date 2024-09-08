import java.util.Scanner;
public class Welcome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        System.out.println("Enter another number");
        int num2 = input.nextInt();
        int total = num1 + num2;
        System.out.printf("Sum is %d", total);
    }
}
