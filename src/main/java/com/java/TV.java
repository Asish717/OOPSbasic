package com.java;

public class TV {
    public String brand;
    public int size;
    public int price;
    public TV(String brand,int size,int price){
        this.brand=brand;
        this.size=size;
        this.price=price;
    }
    public void discount(){
        if (size>=20&&size<=30){
            int total=price-2000;
            System.out.println("Final price: "+total);
        }
        else if (size>=31&&size<=40){
            int total=price-4000;
            System.out.println("Final price: "+total);
        }
        else if (size>=41) {
            int total = price - 5000;
            System.out.println("Final price: " + total);
        }
        else {
            int total = price - 1000;
            System.out.println("Final price: " + total);
        }
    }
    public void brandSizePrice(){
        System.out.println("Brand: "+brand);
        System.out.println("Size: "+size+" inches");
    }
    public static void main(String[] args) {
        TV t=new TV("Sony",33,30000);
        t.brandSizePrice();
        t.discount();
    }
}
