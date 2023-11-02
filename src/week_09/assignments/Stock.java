package week_09.assignments;

public class Stock {
    String name;
    String symbol;
    double previousClosingPrice;
    double currentPrice;

    Stock() {
    }

    Stock(String newName, String newSymbol, double newPreviousClosingPrice, double newCurrentPrice) {
        this.name = newName;
        this.symbol = newSymbol;
        this.previousClosingPrice = newPreviousClosingPrice;
        this.currentPrice = newCurrentPrice;
    }

    double getChangePercent() {
        if (0 > currentPrice - previousClosingPrice) {
            return (100 - (100 * currentPrice / previousClosingPrice)) * -1;
        } else {
            return 100 - (100 * currentPrice / previousClosingPrice);
        }
    }

    void toString(Stock corporation) {
        System.out.printf("Stock name  : %s\n", corporation.name);
        System.out.printf("Stock symbol: %s\n", corporation.symbol);
        System.out.printf("Price-change percentage: %f\n", corporation.getChangePercent());
    }
}
