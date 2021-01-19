package com.company;

class Rectangle1{
    int length;
    int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    Rectangle1(int l, int b){
        System.out.println("This is rectangle constructor");
        this.length = l;
        this.breadth = b;
    }

    float Area(){
        return length*breadth;
    }

}

class Cuboid extends Rectangle1{
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Cuboid(int l, int b, int h){
        super(l,b);
        System.out.println("This is cuboid constructor");
        this.height = h;
    }

    float Volume(){
        return length*breadth*height;
    }
}

public class cuboidConstructor {
    public static void main(String[] args) {
        Cuboid C = new Cuboid(12,8,11);
        System.out.println("Volume : " + C.Volume());
        System.out.println("Length : " + C.getLength() + " Breadth : " + C.getBreadth() + " Height : " + C.getHeight());
        System.out.println("Area of one side : " + C.Area());
    }
}
