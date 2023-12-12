package com.java;

public class Phone {
    public String make;
    public String model;
    public int storage;
    public Phone(String make,String model,int storage){
        this.make=make;
        this.model=model;
        this.storage=storage;
    }
    public void makeModelStorage(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Storage: "+storage);
    }
    public void price(){
        if (make=="Poco"&&model=="X2"){
            int cost=2000;
            double storageCost=2*storage;
            double total=storageCost+cost;
            System.out.println("Final price: "+total);
        }
        else if (make=="iPhone"&&model=="15"){
            int cost=5000;
            double storageCost=2*storage;
            double total=storageCost+cost;
            System.out.println("Final price: "+total);
        }
        else if (make=="Samsung"&&model=="S22"){
            int cost=4000;
            double storageCost=2*storage;
            double total=storageCost+cost;
            System.out.println("Final price: "+total);
        }
        else {
            int cost=3000;
            double storageCost=2*storage;
            double total=storageCost+cost;
            System.out.println("Final price: "+total);
        }
    }
    public static void main(String[] args) {
        Phone phone=new Phone("iPhone","14",128);
        phone.makeModelStorage();
        phone.price();
    }
}
