package com.company;

import java.util.Scanner;

public class EncryptDecrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade");
        char grade = sc.next().charAt(0);
        grade = (char)(grade + 8);
        System.out.println("***** After encryption *****");
        System.out.println(grade);
        grade = (char)(grade - 8);
        System.out.println("***** After decryption *****");
        System.out.println(grade);
    }
}
