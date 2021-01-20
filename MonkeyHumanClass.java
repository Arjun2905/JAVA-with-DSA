package com.company;

interface BasicAnimal{
    void Eats();
    void Sleeps();
}

class Monkey{

    void Bite(){
        System.out.println("Bites");
    }

    void Jump(){
        System.out.println("Jumps");
    }

}

class Human extends Monkey implements BasicAnimal{

    public void Eats(){
        System.out.println("Eating");
    }

    public void Sleeps(){
        System.out.println("Sleeps");
    }

}

public class MonkeyHumanClass {
    public static void main(String[] args) {

        Human human = new Human();
        human.Eats();
        human.Bite();
        human.Jump();
        human.Sleeps();

        System.out.println();

        BasicAnimal animal = new Human();
        animal.Sleeps();
        animal.Eats();
    }
}
