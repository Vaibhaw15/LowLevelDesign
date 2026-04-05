package org.example.Builder.SimpleBuilder;


//

public class User {


    // Required fields
    private String name;
    private int age;

    // Optional fields
    private String country;
    private String city;

    // Private constructor
    private User(Builder builder){
      this.name = builder.name;
      this.age = builder.age;
      this.city = builder.city;
      this.country = builder.country;
    }

    // Static Builder Class
    public static class Builder{
        private String name;
        private int age;
        private String country;
        private String city;

        //Required field in constructor
        public Builder(String name, int age){
            this.name = name;
            this.age = age;
        }


        // Optional setters (method chaining)
        public Builder setCity(String city){
            this.city = city;
            return  this;
        }


        // Optional setters (method chaining)
        public Builder setCountry(String country){
            this.country = country;
            return  this;
        }


        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString(){
       return this.name+" " + this.age +" "+this.city+" "+this.country;
    }
}
