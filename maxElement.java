package com.company;

public class maxElement {
    public static void main(String[] args) {
        int max = 0;
        int arr[] = {11,32,73,41,56,69};
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }

        System.out.print("The maximum element of an Array is : " + max);
    }
}
