public class DivisionExample {

    public static int divide(int numerator, int denominator) {
        try {
            return numerator / denominator;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            return 0; 
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 0;

        System.out.println("10 / 2 = " + divide(a, b)); 
        System.out.println("10 / 0 = " + divide(a, c)); 
    }
}
