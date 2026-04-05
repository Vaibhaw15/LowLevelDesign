package org.example.Factory.AbstractFactory;

public class BasicBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Basic Burger is Preparing");
    }
}
