package com.company;

public class avgOfSet {
    static float setSum(int ...arr){
        int sum = 0;
        for(int a : arr){
            sum = sum + a;
        }
        return (float)sum/arr.length;
    }
    public static void main(String[] args) {
        float avg = setSum(1,2,3,4,5,6,7,8);
        System.out.println("avg of a set is " + avg);
    }
}
