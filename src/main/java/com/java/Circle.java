package com.java;

public class Circle {
    public int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public void area(){
        double result=2.416*Math.pow(radius,2);
        System.out.println("Area of circle: "+result);
    }
    public void circumference(){
        double result=2*2.416*radius;
        System.out.println("Perimeter of circle: "+result);
    }

    public static void main(String[] args) {
        Circle circle=new Circle(4);
        circle.area();
        circle.circumference();
    }
}
