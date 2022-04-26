public class Factory {
    public Coin getCoin(String coinType){
        if(coinType == null){
            return null;
        }
        if(coinType.equalsIgnoreCase("ILS")){
            return new Ils();
        } else if(coinType.equalsIgnoreCase("USD")){
            return new Usd();
        }
        return null;
    }
}
