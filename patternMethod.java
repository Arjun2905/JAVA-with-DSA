package com.company;

import java.util.Scanner;

public class patternMethod {

    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many line you want in pattern : ");
        int n = sc.nextInt();

        pattern(n);

    }
}
