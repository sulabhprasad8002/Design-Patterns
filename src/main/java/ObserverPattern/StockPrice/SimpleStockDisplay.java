package ObserverPattern.StockPrice;

public class SimpleStockDisplay implements StockObserver{
    @Override
    public void update(String stockSymbol, float price) {
        System.out.println("Update stock: " + stockSymbol + " -Price: " + price);
    }
}
