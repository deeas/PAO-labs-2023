package pao.laborator5.callback;

public class Main {
    public static int total(ICalculator iCalculator, int n) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            result = result + iCalculator.transform(i);
        }

        return result;
    }

    public static void main(String[] args) {
        ICalculator same = new SameValue();
        System.out.println(total(same, 5));

        ICalculator square = new SquareValue();
        System.out.println(total(square, 5));
    }
}
