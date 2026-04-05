package org.example.Factory.AbstractFactory;

 interface MealFactory {
    Burger createBurger(String type);
    GarlicBread createGarlicbread(String type);
}
