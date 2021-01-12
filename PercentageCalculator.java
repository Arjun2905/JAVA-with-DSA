package com.company;
import java.util.Scanner;
public class PercentageCalculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of Subjects");
        int n = sc.nextInt();
        System.out.println("Enter marks of each subjects ");
        int sum = 0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            sum = sum + a;
        }

        System.out.println("Percentage of a student is : " + (float)sum*100/(n*100));
    }
}
