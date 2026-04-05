package org.example.Singleton.AbstractFactory;

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
