package org.example.Builder.SimpleBuilder;



//Simple Builder is a Creational design patter use to Construct complex object step by step using
// methode chaining, without requiring multiple constructor.
public class SimpleBuilder {
    public static void main(String[] args){
        User u = new User.Builder("Vaibhaw",24)
                .setCity("Kolkata")
                .setCountry("India")
                .build();
        System.out.println("User created!");
        System.out.println(u.toString());
    }
}
