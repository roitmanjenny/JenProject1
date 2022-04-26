public class Usd extends Coin{
    private static final double value = 3.52;
    @Override
    public static double getValue() {
        return value;
    }

    @Override
    public static double calculate(double input) {
        return input*getValue();
    }
}
