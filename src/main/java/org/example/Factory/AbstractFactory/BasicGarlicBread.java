package org.example.Factory.AbstractFactory;

public class BasicGarlicBread implements GarlicBread{
    @Override
    public void prepare() {
        System.out.println("Basic Garlic is Preparing");
    }
}
