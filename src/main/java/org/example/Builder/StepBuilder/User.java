package org.example.Builder.StepBuilder;

public class User {
    private String name;
    private int age;
    private String email;

    private User(){}

    // Entry point
    public static NameStep builder(){
        return new Builder();
    }

    // Nested Step interfaces
    interface NameStep{
        EmailStep setName(String name);
    }

    interface EmailStep{
        OptionalStep setEmail(String email);
    }

    interface OptionalStep{
        OptionalStep setAge(int age);
        User build();
    }



    // Concrete step builder as static nested class
    public static class Builder implements NameStep,EmailStep,OptionalStep{

        private String name;
        private String email;
        private int age;


        @Override
        public EmailStep setName(String name) {
            this.name = name;
            return this;
        }


        @Override
        public OptionalStep setEmail(String email) {
            this.email = email;
            return this;
        }

        @Override
        public OptionalStep setAge(int age) {
           this.age = age;
           return this;
        }

        @Override
        public User build() {
            User user = new User();
            user.name = this.name;
            user.email = this.email;
            user.age = this.age;
            return  user;
        }
    }

    @Override
    public String toString(){
        return this.name + this.email + this.age;

    }

}
