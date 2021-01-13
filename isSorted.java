package com.company;

import java.util.Scanner;

public class isSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of Array");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int j: arr){
            System.out.print(j + " ");
        }

        System.out.println();

        boolean state = true;

        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                state = false;
                break;
            }
        }

        if(state){
            System.out.println("Array is sorted ");
        }else{
            System.out.println("Arrays is not sorted");
        }
    }
}
