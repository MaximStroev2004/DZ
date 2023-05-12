package com.example.demo4;

public class VisaCard extends Card {
    public VisaCard() {
        super(PaymentSystem.VISA);
    }

    @Override
    public void payInCountry(Country country, int amount) {
        if (isCountryValidForTheseCard(country) && isBalanceGreaterOrEqualThan(amount)) {
            balance = balance - amount;
            System.out.println("Accepted!");
        }
    }
}
