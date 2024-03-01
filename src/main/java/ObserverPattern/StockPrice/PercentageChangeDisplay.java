package ObserverPattern.StockPrice;

import java.util.HashMap;
import java.util.Map;

public class PercentageChangeDisplay implements StockObserver{
    Map<String, Float> lastPrices = new HashMap<>();

    @Override
    public void update(String stockSymbol, float newPrice) {
        float lastPrice = lastPrices.getOrDefault(stockSymbol, newPrice);
        float change = (newPrice - lastPrice) / lastPrice * 100;

        System.out.printf("Stock %s changed by %.2f%%\n", stockSymbol, change);
        lastPrices.put(stockSymbol, newPrice);
    }
}
