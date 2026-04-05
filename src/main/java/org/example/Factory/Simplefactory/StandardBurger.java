package org.example.Factory.Simplefactory;

public class StandardBurger implements Burger{


    @Override
    public void prepare() {
        System.out.println("Standard Burger is preparing");
    }
}
