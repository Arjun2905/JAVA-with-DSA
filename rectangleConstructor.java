package com.company;

class rectangle{
    int length;
    int breadth;

    public rectangle() {
        this.length = 16;
        this.breadth = 8;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area(){
        return this.breadth*this.length;
    }
}

public class rectangleConstructor {
    public static void main(String[] args) {
        rectangle R1 = new rectangle();
        rectangle R2 = new rectangle(10,8);
        System.out.println("Area : " + R1.area());
        System.out.println("Area : " + R2.area());
    }
}
