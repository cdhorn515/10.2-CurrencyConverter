package com.cdhorn;


import java.util.HashMap;

public class Money {

    public double amount;
    public String currency;
    public double dollar;
    public double yen;
    public double bitcoin;
    public double euro;

    //HashMap is converting to US Dollars
    private HashMap<String, Double> rateMap = new HashMap<String, Double>() {{
        put("USD", 1.0);
        put("JPY", 0.0089);
        put("EUR", 1.164);
        put("XBT", 2546.03);
    }};

    public Money(String currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public double convertToDollar() {
        double convertedAmount;
        switch (currency) {
            case "JPY":
                double rate = rateMap.get("JPY");
                convertedAmount = amount * rate;
                break;
            case "EUR":
                rate = rateMap.get("EUR" );
                convertedAmount = amount * rate;
                break;
            case "XBT":
                rate = rateMap.get("XBT");
                convertedAmount = amount * rate;
                break;
            default:
                convertedAmount = amount;
        }
        return convertedAmount;
    }


    public double toEuro() {
        euro = convertToDollar() * 0.86;
        System.out.println(amount + " " + currency + " is approximately " + euro + " EUR");
        return euro;
    }

    public double toYen() {
        yen = convertToDollar() * 111.88;
        System.out.println(amount + " " + currency + " is approximately " + yen + " JPY.");
        return yen;
    }

    public double toBitCoin() {
        bitcoin = convertToDollar() * 0.00039;
        System.out.println(amount + " " + currency + " is approximately " + bitcoin + " XBT.");
        return bitcoin;
    }

    public void toDollar() {
        System.out.println(amount + " " + currency + " is approximately " + convertToDollar() + " USD.");
    }
}
