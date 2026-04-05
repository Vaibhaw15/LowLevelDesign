package org.example.Builder.StepBuilder;



//StepBuilder pattern is a variation of the builder pattern that enforces step by step object creation using multiple
// interfaces, ensuring a fix order and mandatory field at compile time.

public class StepBuilder {
    public static void main(String[] args){

        User user = User.builder()
                .setName("Vaibhaw")
                .setEmail("V@gmail.com")
                .setAge(24)
                .build();

        System.out.println(user.toString());
    }
}