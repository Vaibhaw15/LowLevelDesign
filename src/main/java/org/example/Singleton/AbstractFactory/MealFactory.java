package org.example.Singleton.AbstractFactory;

 interface MealFactory {
    Burger createBurger(String type);
    GarlicBread createGarlicbread(String type);
}
