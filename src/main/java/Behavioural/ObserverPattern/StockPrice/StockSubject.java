package Behavioural.ObserverPattern.StockPrice;

public interface StockSubject {
    public void registerObserver(StockObserver stockObserver);
    public void removeObserver(StockObserver stockObserver);
    public void notifyObservers();
}
