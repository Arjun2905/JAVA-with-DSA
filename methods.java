package com.company;

public class methods {

    int Add(int a, int b){
        int sum = 0;
        sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        int x = 6;
        int y = 9;
        methods obj = new methods();
        int z = obj.Add(x,y);
        System.out.println(z);
    }
}
