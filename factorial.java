package com.company;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is :");
        int result = 1;
        for (int i=n;i>0;i--){
            result = result*i;
        }
        System.out.print(result);
    }
}
