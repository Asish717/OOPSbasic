package com.java;

public class Employee {
    public String name;
    public int salary;
    public int Id;
    public Employee(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.Id = id;
    }
    public void yearlySalary(){
        int yearly=salary*12;
        System.out.println("Yearly salary: "+yearly);
    }
    public void nameAndSalary(){
        System.out.println(name);
        System.out.println("Monthly salary: "+salary);
    }
    public static void main(String[] args) {
        Employee emp=new Employee("asish",3000,5653);
        emp.nameAndSalary();
        emp.yearlySalary();
    }
}
