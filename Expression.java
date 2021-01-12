package com.company;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial velocity :");
        double u = sc.nextDouble();
        System.out.println("Enter final velocity :");
        double v = sc.nextDouble();
        System.out.println("Distance covered : ");
        double s = sc.nextDouble();
        System.out.println("Acceleration given : ");
        double a = sc.nextDouble();
        double res = (v*v - u*u)/(2*a*s);
        System.out.println("Resultant : " + res);
    }
}
