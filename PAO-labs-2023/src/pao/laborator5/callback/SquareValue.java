package pao.laborator5.callback;

public class SquareValue implements ICalculator{
    @Override
    public int transform(int x) {
        return x * x;
    }
}
