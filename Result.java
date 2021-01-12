package com.company;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the marks of 3 subjects ");
        byte Chem = sc.nextByte();
        byte Phy = sc.nextByte();
        byte Maths = sc.nextByte();
        float avg = (Chem+Phy+Maths)/3.0f;
        System.out.println("Avg percentage of yours is :" + avg);
        if(avg>40 && Chem>=33 && Phy>=33 && Maths>=33){
            System.out.println("Congrats, You are Promoted");
        }else{
            System.out.println("You are fail");
        }
    }
}
