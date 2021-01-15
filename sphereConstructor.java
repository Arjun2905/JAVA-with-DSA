package com.company;

class sphere{

    int radius;

    public int getRadius() {
        return radius;
    }

    public sphere(){
        this.radius = 5;
    }

    public sphere(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
}

public class sphereConstructor {
    public static void main(String[] args) {
        sphere S1 = new sphere();
        sphere S2 = new sphere(10);
        System.out.println("Radius : " + S1.getRadius());
        System.out.println("Surface Area : " + S1.surfaceArea());
        System.out.println("Radius : " + S2.getRadius());
        System.out.println("Surface Area : " + S2.surfaceArea());

    }
}
