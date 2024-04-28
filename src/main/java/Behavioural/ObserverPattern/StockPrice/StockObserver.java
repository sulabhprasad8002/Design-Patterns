package Behavioural.ObserverPattern.StockPrice;

public interface StockObserver {
    public void update(String stockSymbol, float price);
}
