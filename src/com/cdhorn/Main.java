package com.cdhorn;

public class Main {

    public static void main(String[] args) {

        Money money = new Money("JPY", 5.0);
        money.toEuro();

        Money money2 = new Money("EUR", 54.6);
        money2.toYen();

        Money money3 = new Money("USD", 50.0);
        money3.toBitCoin();

        Money money4 = new Money("XBT", 23.0);
        money4.toDollar();

    }
}
