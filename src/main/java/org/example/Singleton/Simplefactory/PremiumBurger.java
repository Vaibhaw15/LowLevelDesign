package org.example.Singleton.Simplefactory;

public class PremiumBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Premium Burger is preparing");
    }
}
