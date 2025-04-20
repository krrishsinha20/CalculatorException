public class Division {
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by Zero is not allowed.");
        }
        return a / b;
    }
}
