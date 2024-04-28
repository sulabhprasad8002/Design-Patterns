package Behavioural.ObserverPattern.StockPrice;

public class StockMarketSimulator {

    public static void main(String[] args) {
        StockTicker ticker = new StockTicker();

        SimpleStockDisplay simpleStockDisplay = new SimpleStockDisplay();
        PercentageChangeDisplay percentageChangeDisplay = new PercentageChangeDisplay();

        ticker.registerObserver(simpleStockDisplay);
        ticker.registerObserver(percentageChangeDisplay);

        ticker.setPrice("ABC", 100.01f);
        ticker.setPrice("XYZ", 200.02f);

        ticker.setPrice("ABC", 101.00f);
        ticker.setPrice("XYZ", 204.02f);
    }
}
