package com.company;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of which your table will print ");
        int n = sc.nextInt();
        for(int i=10;i>0;i--){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
