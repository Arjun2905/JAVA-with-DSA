package com.company;

import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of Subjects");
        int n = sc.nextInt();
        System.out.println("Enter marks of each subjects ");
        float sum = 0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            sum = sum + a;
        }
        sum = sum/(n*10);
        System.out.println("CGPA of a student is : " + sum);
    }
}
