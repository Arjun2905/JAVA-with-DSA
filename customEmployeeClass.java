package com.company;

class Employee{
    int Salary;
    String Name;

    int  getSalary(){
        return Salary;
    }

    String getName(){
        return Name;
    }

    public void setName(String name){
        Name = name;
    }
}

public class customEmployeeClass {

    public static void main(String[] args) {

        Employee Id1 = new Employee();
        Id1.setName("Arjun");
        Id1.Salary = 400000;

        int salary = Id1.getSalary();
        String Name = Id1.getName();

        System.out.println(Name + " : " + salary );

    }
}
