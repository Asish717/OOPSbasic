package com.java;

public class Computer {
    public int processor;
    public int RAM;
    public int storage;
    public Computer(int processor,int RAM,int storage){
        this.processor=processor;
        this.RAM=RAM;
        this.storage=storage;
    }
    public void proRamSto(){
        System.out.println("Processor: "+processor);
        System.out.println("Ram: "+RAM);
        System.out.println("Storage: "+storage);
    }
    public void price(){
        int pro=1000*processor;
        int ram=500*RAM;
        int sto=10*storage;
        int total=pro+ram+sto;
        System.out.println("Final price: "+total);
    }
    public static void main(String[] args) {
        Computer computer=new Computer(7,8,512);
        computer.proRamSto();
        computer.price();
    }
}
