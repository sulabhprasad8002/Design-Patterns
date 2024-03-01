package ObserverPattern.StockPrice;

import java.util.*;

public class StockTicker implements StockSubject{
    Map<String, Float> stocks = new HashMap<>();
    private Set<StockObserver> observers = new HashSet<>();

    @Override
    public void registerObserver(StockObserver stockObserver) {
        this.observers.add(stockObserver);
    }

    @Override
    public void removeObserver(StockObserver stockObserver) {
        this.observers.remove(stockObserver);
    }

    @Override
    public void notifyObservers() {
        for(StockObserver observer : observers) {
            stocks.forEach(observer::update);
        }
    }

    public void setPrice(String stockSymbol, float price) {
        this.stocks.put(stockSymbol, price);
        this.notifyObservers();
    }
}
