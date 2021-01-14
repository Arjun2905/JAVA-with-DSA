package com.company;

class Rectangle{
    int length;
    int breadth;

    void setSize(int l, int b){
        length = l;
        breadth = b;
    }

    void details(){
        System.out.println("Perimeter : " + 2*(length+breadth));
        System.out.println("Area : " + length*breadth);
    }
}

public class customRectangleClass {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setSize(5,10);
        r.details();
    }

}
