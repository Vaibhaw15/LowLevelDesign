package org.example.Factory.AbstractFactory;

public class StandardGarlicBread implements GarlicBread{
    @Override
    public void prepare() {
        System.out.println("Standard Garlic is Preparing");
    }
}