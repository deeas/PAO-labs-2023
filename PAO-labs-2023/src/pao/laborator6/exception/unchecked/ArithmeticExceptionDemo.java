package pao.laborator6.exception.unchecked;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int a = 30, b = 0;
        divide(a, b);
    }

    private static void divide(int a, int b) throws IllegalArgumentException {
        if (b > 0) {
            int c = a / b;

            System.out.println("Result = " + c);
        } else {
            throw new IllegalArgumentException("B is lower than 0");
        }
    }
}
