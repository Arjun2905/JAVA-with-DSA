package com.company;
import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometer : ");
        double dist = sc.nextDouble();
        System.out.println(dist + " in Km is " + dist/1.609 + " in Miles");
    }
}
