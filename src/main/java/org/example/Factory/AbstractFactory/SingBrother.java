package org.example.Factory.AbstractFactory;

public class SingBrother implements MealFactory{
    @Override
    public Burger createBurger(String type) {
        if(type.equalsIgnoreCase("basic")){
            return new BasicBurger();
        }else if(type.equalsIgnoreCase("standard")){
            return new StandardBurger();
        }else {
            System.out.print("Invalid Burger");
            return  null;
        }
    }

    @Override
    public GarlicBread createGarlicbread(String type) {
        if(type.equalsIgnoreCase("basic")){
            return new BasicGarlicBread();
        }else if(type.equalsIgnoreCase("standard")){
            return new StandardGarlicBread();
        }else {
            System.out.print("Invalid GarlicBread");
            return  null;
        }
    }
}
