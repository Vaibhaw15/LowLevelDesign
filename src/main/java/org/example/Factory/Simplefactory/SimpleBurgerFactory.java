package org.example.Factory.Simplefactory;

public class SimpleBurgerFactory {
    public static void main(String[] args){
        String type = "Basic";

        BurgerFactory burgerFactory = new BurgerFactory();

        Burger burger = burgerFactory.createBurger(type);

        burger.prepare();

    }
}
