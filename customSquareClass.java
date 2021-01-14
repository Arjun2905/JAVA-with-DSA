package com.company;

class Square{
    int side;

    void setSize(int n){
        side = n;
    }

    void details(){
        System.out.println("Perimeter : " + 4*side);
        System.out.println("Area : " + side*side);
    }
}

public class customSquareClass {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.setSize(5);
        sq.details();
    }
}
