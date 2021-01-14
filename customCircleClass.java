package com.company;

class Circle{
    int radius;

    void setRadius(int n){
        radius = n;
    }

    void details(){
        System.out.println("Perimeter : " + 2*Math.PI*radius);
        System.out.println("Area : " + Math.PI*radius*radius);
    }
}

public class customCircleClass {
    public static void main(String[] args) {
        Circle C = new Circle();
        C.setRadius(6);
        C.details();
    }
}
