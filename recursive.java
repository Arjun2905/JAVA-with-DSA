package com.company;

public class recursive {

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println(factorial(x));
    }
}
