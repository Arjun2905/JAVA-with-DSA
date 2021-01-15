package com.company;

class myCylinder{
    int radius;
    int height;

    myCylinder(int r, int h){
        this.height = r;
        this.radius = h;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public float surface(){
        return (float) (2*Math.PI*this.radius*(this.radius + this.height));
    }

    public float volume(){
        return (float) (Math.PI*this.radius*this.radius*this.height);
    }

}

public class cylinderConstructor {
    public static void main(String[] args) {
        myCylinder cylinder = new myCylinder(10,5);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getRadius());
        System.out.println("Volume of cylinder : " + cylinder.volume());
        System.out.println("Total Surface area of cylinder : " + cylinder.surface());
    }
}
