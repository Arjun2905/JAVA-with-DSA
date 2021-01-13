package com.company;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of Array");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int j: arr){
            System.out.print(j + " ");
        }

        System.out.println();

        int temp = 0;
        System.out.println("After reversing we get :");

        for(int i=0;i<=size/2;i++){
            temp = arr[i];
            arr[i] = arr[size-1-i];
            arr[size-1-i] = temp;
        }

        for(int j: arr){
            System.out.print(j + " ");
        }
    }
}
