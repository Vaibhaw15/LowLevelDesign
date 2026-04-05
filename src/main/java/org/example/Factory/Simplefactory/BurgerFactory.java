package org.example.Factory.Simplefactory;

public class BurgerFactory {

    public Burger createBurger(String type){
        if(type.equalsIgnoreCase("basic")){
            return new SimpleBurger();
        }else if(type.equalsIgnoreCase("premium")){
            return new PremiumBurger();
        }else if(type.equalsIgnoreCase("standard")){
            return new StandardBurger();
        }else {
            System.out.print("Invalid Burger type");
            return  null;
        }
    }

}
