package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    int  takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        return inputNumber;
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber == number){
            System.out.println("Correct match");
            System.out.println("Number of guesses : " + noOfGuesses);
            return true;
        }

        else if(inputNumber<number){
            System.out.println("Too low...");
        }

        else if(inputNumber>number){
            System.out.println("Too high...");
        }

        return false;
    }
}


public class guessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            //System.out.println(b);
        }
    }
}
