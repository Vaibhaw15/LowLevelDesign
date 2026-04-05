package org.example.Factory.Simplefactory;

//Simple factory pattern is a creational design pattern that is use to create
//object without exposing the object creation
//logic to client.
public class SimpleBurger implements Burger{

    @Override
    public void prepare(){
        System.out.println("Basic Burger is preparing");
    }
}
