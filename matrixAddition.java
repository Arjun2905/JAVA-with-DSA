package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class matrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matA[][] = new int[2][3];
        int matB[][] = new int[2][3];
        int matC[][] = new int[2][3];

        System.out.println("Enter elements in matA");

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                matA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements in matB");

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                matB[i][j] = sc.nextInt();
            }
        }

        System.out.println("Addition of matA and matB is");

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(matC[i][j] + " ");
            }
            System.out.println();
        }


    }
}
