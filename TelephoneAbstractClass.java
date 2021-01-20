package com.company;

abstract class Telephone{
    abstract void lift();
    abstract void disconnect();

    void call(){
        System.out.println("Calling someone...");
    }
}

class SmartTelephone extends Telephone{

    void lift(){
        System.out.println("Lifts the phone");
    }

    void disconnect(){
        System.out.println("Hanging up");
    }

}

public class TelephoneAbstractClass {
    public static void main(String[] args) {
        SmartTelephone Bsnl = new SmartTelephone();
        Bsnl.disconnect();
        Bsnl.lift();

        System.out.println();

        Telephone telephone = new SmartTelephone();
        telephone.disconnect();
        telephone.lift();
        telephone.call();
    }
}
