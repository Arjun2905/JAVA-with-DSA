package com.company;

public class avgMarks {
    public static void main(String[] args) {
        float[] arr = {84.2f,92.3f,94.4f,75.6f,87.7f};
        float sum = 0;
        for(float e : arr){
            sum = sum + e;
        }

        float avg = sum/ arr.length;

        System.out.println("Avg marks of class in physics are : " + avg);
    }
}
