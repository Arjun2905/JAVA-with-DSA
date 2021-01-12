package com.company;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        System.out.println("There are Seven Days in a week");
        System.out.println("Choose any number between 1 to 7");
        int days = sc.nextInt();
        switch (days){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            //case 1 -> System.out.println("Monday"); enhanced switch blocks are not supported in jdk 11.
        }
    }
}
