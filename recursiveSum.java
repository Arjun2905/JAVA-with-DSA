package com.company;

import java.util.Scanner;

public class recursiveSum {

    static int Sum(int a){
        if(a==1){
            return 1;
        }else{
            return a + Sum(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get sum up to that : ");
        int n = sc.nextInt();

        int c =Sum(n);
        System.out.print(c);
    }
}
