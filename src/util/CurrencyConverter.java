package util;

public class CurrencyConverter {

    public static final double iof = 6.00;

    public static double paidReais (double dollarPrice, double amountDollar) {
        return (amountDollar * (iof/100) + amountDollar) * dollarPrice;
    }

}
