package com.company;

import java.util.Scanner;

public class findingElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        boolean state = false;
        int index = 0;
        int arr[] = new int[n];
        System.out.println("Enter the elements of Array");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search : ");
        int j = sc.nextInt();

        for(int i=0;i<n;i++){
            if(j==arr[i]){
                state = true;
                index = i;//System.out.println("Element is present at index : " + i);
                break;
            }
        }

        if(state==true){
            System.out.println("Element is present at index : " + index);
        }else{
            System.out.println("Element is not present in the Array");
        }
    }
}
