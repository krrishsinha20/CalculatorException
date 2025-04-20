public class SquareRoot {
    public static double sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("Square Root of negative number is not allowed.");
        }
        return Math.sqrt(a);
    }
}
