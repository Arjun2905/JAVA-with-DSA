package com.company;

public class floatArraySum {
    public static void main(String[] args) {
        float[] arr = {4.2f,2.3f,4.4f,5.6f,7.7f};
        float sum = 0;
        for(float e : arr){
            sum = sum + e;
        }

        System.out.println("Sum of float Array is : " + sum);
    }
}
