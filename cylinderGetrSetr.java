package com.company;

class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float surface(){
        return (float) (2*Math.PI*this.radius*(this.radius + this.height));
    }

    public float volume(){
        return (float) (Math.PI*this.radius*this.radius*this.height);
    }
}

public class cylinderGetrSetr {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(10);
        cylinder.setRadius(5);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getRadius());
        System.out.println("Volume of cylinder : " + cylinder.volume());
        System.out.println("Total Surface area of cylinder : " + cylinder.surface());
    }
}
