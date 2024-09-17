package Methods;

public class MethodOverload {

    public static void main(String[] args) {
        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 3.5 is %f%n", square(3.5));

    }

    public static int square(int Value){
        System.out.printf("%nCalled square with int argument: %d%n", Value);
        return Value * Value;
    }

    public static double square(double doubleValue){
        System.out.printf("%nCalled square with double argument: %f%n", doubleValue);
        return doubleValue * doubleValue;
    }
}
