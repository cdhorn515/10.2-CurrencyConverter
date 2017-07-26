package com.cdhorn;


import java.text.DecimalFormat;
import java.util.HashMap;

public class Money {

    public double amount;
    public String currency;
    public double yen;
    public double bitcoin;
    public double euro;
    //limit decimal places to thousandths
    DecimalFormat df = new DecimalFormat("#.###");

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
        return Double.parseDouble(df.format(convertedAmount));

    }


    public double toEuro() {
        euro = Double.parseDouble(df.format(convertToDollar() * 0.86));
//                convertToDollar() * 0.86;
        System.out.println(amount + " " + currency + " is approximately " + euro + " EUR");
        return euro;
    }

    public double toYen() {
        yen = Double.parseDouble(df.format(convertToDollar() * 111.88));

        ;
        System.out.println(amount + " " + currency + " is approximately " + yen + " JPY.");
        return yen;
    }

    public double toBitCoin() {
        bitcoin = Double.parseDouble(df.format(convertToDollar() * 0.00039));
        System.out.println(amount + " " + currency + " is approximately " + bitcoin + " XBT.");
        return bitcoin;
    }

    public void toDollar() {
        System.out.println(amount + " " + currency + " is approximately " + convertToDollar() + " USD.");
    }
}
