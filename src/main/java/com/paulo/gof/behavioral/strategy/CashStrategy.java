package com.paulo.gof.behavioral.strategy;

public class CashStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println(amount+" pay with cashhhh");
    }
}
