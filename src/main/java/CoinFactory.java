public class CoinFactory {
    public static Coin getCoin(Coins coinType) {
        switch (coinType) {
            case ILS:
                return new Ils();
            case USD:
                return new Usd();
            default:
                return null;
        }
    }
}
