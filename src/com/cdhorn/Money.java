package com.cdhorn;


public class Money {

    public double amount;
    public String currency;
    public double dollar;
    public double yen;
    public double bitcoin;
    public double euro;

    public Money(double amount) {
        this.amount = amount;
    }


    public double dollarToEuro(double dollar) {
        euro = dollar * 0.86;
        System.out.println(dollar + " dollars is approximately " + euro + " euros");
        return euro;
    }

    public double dollarToYen(double dollar) {
        yen = dollar * 111.86;
        System.out.println(dollar + " dollars is approximately " + yen + " yen.");
        return yen;
    }

    public double dollarToBitCoin(double dollar) {
        bitcoin = dollar * 0.00039;
        System.out.println(dollar + " dollars is approximately " + bitcoin + " bitcoin.");
        return bitcoin;
    }

    public double euroToDollar(double euro) {
        dollar = euro * 1.16;
        System.out.println(euro + " euros is approximately " + dollar + " dollars.");
        return dollar;
    }

    public double bitcoinToDollar(double bitcoin) {
        dollar = bitcoin * 2541.31;
        System.out.println(bitcoin + " bitcoin is approximately " + dollar + " dollars.");
        return dollar;
    }

    public double yenToDollar(double yen) {
        dollar = yen * 0.009;
        System.out.println(yen + " yen is approximately " + dollar + " dollars.");
        return dollar;
    }

    public double yenToEuro(double yen) {
        yenToDollar(yen);
        euro = dollarToEuro(dollar);
        return euro;
    }

    public double yenToBitcoin(double yen) {
        yenToDollar(yen);
        bitcoin = dollarToBitCoin(dollar);
        return bitcoin;
    }

    public double euroToYen(double euro) {
        euroToDollar(euro);
        yen = dollarToYen(dollar);
        return yen;
    }

    public double euroToBitcoin(double euro) {
        euroToDollar(euro);
        bitcoin = dollarToBitCoin(dollar);
        return bitcoin;
    }

    public double bitcoinToEuro(double bitcoin) {
        bitcoinToDollar(bitcoin);
        euro = dollarToEuro(dollar);
        return euro;
    }

    public double bitcointoYen(double bitcoin) {
        bitcoinToDollar(bitcoin);
        yen = dollarToYen(dollar);
        return yen;
    }
}
