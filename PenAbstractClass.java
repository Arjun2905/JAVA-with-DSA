package com.company;

abstract class Pen{
    abstract void Write();
    abstract void Refill();
}

class FountainPen extends Pen{

    void Write(){
        System.out.println("Writing");
    }

    void Refill(){
        System.out.println("Refilling");
    }

    void changeNib(){
        System.out.println("Changing nib");
    }
}

public class PenAbstractClass {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.Write();
        pen.Refill();
        pen.changeNib();
    }
}
