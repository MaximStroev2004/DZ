package com.example.demo4;

import java.io.Serializable;

public class MasterCard extends  Card implements ICard , Serializable {
    public MasterCard() {
        super(PaymentSystem.MASTERCARD);
    }
    @Override
     public void payInCountry(Country country, int amount) {
        if (isCountryValidForTheseCard(country)) {
            // Проверим что на балансе хватит денег перед платежем
            if (balance >= amount){
                balance = balance - amount;
                System.out.println("Accepted!");
            }
        }

    }

    public boolean isCountryValidForTheseCard(Country country) {
        return true;
    }
}
