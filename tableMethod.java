package com.company;

import java.util.Scanner;

public class tableMethod {

    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number for table : ");
        int n = sc.nextInt();
        table(n);
    }
}
