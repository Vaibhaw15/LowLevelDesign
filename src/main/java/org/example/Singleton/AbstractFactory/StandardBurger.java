package org.example.Singleton.AbstractFactory;

public class StandardBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Standard Burger is Preparing");
    }
}
