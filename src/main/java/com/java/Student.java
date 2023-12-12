package com.java;

public class Student {
    public int age;
    public String name;
    public int ID;
    public Student(String name,int age,int ID){
        this.name=name;
        this.age=age;
        this.ID=ID;
    }
    public void nameAndAge(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student std=new Student("Asish",25,12245);
        std.nameAndAge();
    }
}
