package com.company;

import java.util.Scanner;

public class websiteType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your website address");
        String str = sc.nextLine();
        if(str.endsWith(".com")){
            System.out.println("It is a Commercial website");
        }

        if(str.endsWith(".org")){
            System.out.println("It is an Organisational website");
        }

        if(str.endsWith(".in")){
            System.out.println("It is an Indian website");
        }
    }
}
