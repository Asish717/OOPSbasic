package com.java;

public class Dog {
    public String breed;
    public int age;
    public int weight;
    public Dog(String breed,int age,int weight){
        this.breed=breed;
        this.age=age;
        this.weight=weight;
    }
    public void breedAgeWeight(){
        System.out.println("Breed: "+breed);
        System.out.println("Age: "+age);
        System.out.println("Weight: "+weight);
    }
    public void humanAge(int convert){
        int human=age*convert;
        System.out.println("Dog's age in human years: "+human);
    }

    public static void main(String[] args) {
        Dog d=new Dog("pug",3,10);
        d.breedAgeWeight();
        d.humanAge(8);
    }
}
