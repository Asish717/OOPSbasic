package com.java;

import java.awt.*;

public class Furniture {
    public String type;
    public String material;
    public int price;
    public Furniture(String type,String material,int price){
        this.type=type;
        this.material=material;
        this.price=price;
    }
    public void discount(){
        if (material=="wood"){
            int total=price-200;
            System.out.println("Discounted price: "+total);
        }
        else if (material=="metal"){
            int total=price-300;
            System.out.println("Discounted price: "+total);
        }
        else {
            int total=price-100;
            System.out.println("Discounted price: "+total);
        }
    }
    public void info(){
        System.out.println("Furniture type: "+type);
        System.out.println("Furniture material: "+material);
    }
    public static void main(String[] args) {
        Furniture fur=new Furniture("chair","plastic",2000);
        fur.info();
        fur.discount();
    }
}
