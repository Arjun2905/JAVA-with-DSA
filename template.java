package com.company;

import java.util.Scanner;

public class template {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.print("Enter a template : ");
        sc.next();
        String temp = sc.nextLine();
        String name1 = temp.replace("Name", name);
        System.out.println(name1);
    }
}
