package org.example.Factory.Simplefactory;

public class PremiumBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Premium Burger is preparing");
    }
}
