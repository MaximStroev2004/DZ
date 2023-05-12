package com.example.demo4;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        invoke(new MasterCard());
        List<String> aList = new ArrayList<>();

    }
        Card visaCard = new MasterCard();
        Card.setBalance(100);
        Card.payInCountry(RU, 75);
        System.out.println("Current balance:" +  Card.getBalance());

    public static void invoke(Card args) {
        Card.setBalance(100);
        Card.payInCountry(RU, 75);
        System.out.println("Current balance:" +  card.getBalance());
}

