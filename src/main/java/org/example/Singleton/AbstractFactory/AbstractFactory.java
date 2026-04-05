package org.example.Singleton.AbstractFactory;



//The Abstract Factory Pattern is a creational design pattern that provides an interface
// to create families of related objects without specifying their concrete classes.

public class AbstractFactory {

    public static void main(String[] args){
        String burgerType = "basic";
        String garlicBreadType = "standard";

        MealFactory mealFactory = new SingBrother();
        Burger burger =  mealFactory.createBurger(burgerType);
        GarlicBread garlicBread = mealFactory.createGarlicbread(garlicBreadType);

        burger.prepare();
        garlicBread.prepare();
    }

}
