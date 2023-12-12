package com.java;

public class Shirt {
    public String size;
    public String color;
    public int price;
    public Shirt(String size,String color,int price){
        this.size=size;
        this.color=color;
        this.price=price;
    }
    public void discountOnSize(){
        if (size=="small"){
            int total=price-100;
            System.out.println("Discount with size: "+total);
        }
        else if (size=="medium"){
            int total=price-200;
            System.out.println("Discount with size: "+total);
        }
        else {
            int total=price-250;
            System.out.println("Discount with size: "+total);
        }
    }
    public void discountOnAll(){
        if (size=="small"){
            if (price>=500&&price<=1200){
                if (color=="black"||color=="white"){
                    double total=price-(price*0.05);
                    System.out.println(total);
                }
                else {
                    double total=price-(price*0.05);
                    System.out.println(total);
                }
            }
            else {
                double total=price-(price*0.05);
                System.out.println(total);
            }
        }
        else if (size=="medium"){
            if (price>=800&&price<=1500){
                if (color=="black"||color=="white"){
                    double total=price-(price*0.1);
                    System.out.println(total);
                }
                else {
                    double total=price-(price*0.1);
                    System.out.println(total);
                }
            }
            else {
                double total=price-(price*0.1);
                System.out.println(total);
            }
        }
        else {
            if (price>=1000&&price<=1700){
                double total=price-(price*0.15);
                System.out.println(total);
            }
            else {
                double total=price-(price*0.15);
                System.out.println(total);
            }
        }
    }
    public void sizeColor(){
        System.out.println("Size: "+size);
        System.out.println("Color: "+color);
    }
    public static void main(String[] args) {
        Shirt s=new Shirt("large","black",1300);
        s.sizeColor();
        s.discountOnSize();
        s.discountOnAll();
    }
}
