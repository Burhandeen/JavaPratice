package Methods;

public class Scope {

    private static int x = 1;

    public static void main(String[] args) {
        int x = 5;
        System.out.printf("Local variable x is %d", x);

        useLocalvariable();
        useField();
        useLocalvariable();
        useField();
    }

    public static void useLocalvariable(){
        int x = 25;
        System.out.printf("%nLocal x on entering method uselocalvariable is %d%n", x);
        x++;
        System.out.printf("%nLocal x before exiting method uselocalvariable is %d%n", x);
    }
    public static void useField(){
        System.out.printf("%nfield on enetering method usefield is %d%n", x);
        x *= 10;
        System.out.printf("field x before exiting method usefield is %d%n", x);
    }
}
