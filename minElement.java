package com.company;

public class minElement {
    public static void main(String[] args) {
        int arr[] = {111,32,73,41,56,69};
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }

        System.out.print("The minimum element of an Array is : " + min);
    }
}
