package com.company;

import java.util.Scanner;

public class fibonacci {

    static int fibonacciSeries(int n){
        if(n == 0){
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return (fibonacciSeries(n-1) + fibonacciSeries(n-2));
        }
        }



    //System.out.print(" + ");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter up to which number you want sum of fibonacci series");
        int n = sc.nextInt();
        int c= fibonacciSeries(n);
        System.out.println(c);
    }
}
