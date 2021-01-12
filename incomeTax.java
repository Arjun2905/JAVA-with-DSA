package com.company;

import java.util.Scanner;

public class incomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        float income = sc.nextFloat();
        float tax = 0;
        if(income<=2.5f){
            tax = 0;
            System.out.println("Tax to be paid is : " + tax);
        }

        else if(income>2.5f && income<=5.0f){
            tax = tax + 0.05f*(income-2.5f);
            System.out.println("Tax to be paid is : " + tax);
        }

        else if(income>5.0f && income<=10.0f){
            tax = tax + 0.05f*(5.0f-2.5f);
            tax = tax + 0.2f*(income-5.0f);
            System.out.println("Tax to be paid is : " + tax);
        }

        else if(income>10.0f){
            tax = tax + 0.05f*(5f-2.5f);
            tax = tax + 0.2f*(10f-5.0f);
            tax = tax + 0.3f*(income-10f);
            System.out.println("Tax to be paid is : " + tax);
        }
    }
}
