public class Ils extends Coin{

    private static final double value = 0.28;
    @Override
    public static double getValue() {
        return value;
    }

    @Override
    public static double calculate(double input) {
        return input/getValue();
    }
}
