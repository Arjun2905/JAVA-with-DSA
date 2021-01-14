package com.company;

class Phone{

    void Ringing(){
        System.out.println("Phone is ringing");
    }

    void Vibrating(){
        System.out.println("Phone is on vibrating mode");
    }

    void Silent(){
        System.out.println("Phone is set on silent mode");
    }
}

public class customCellPhone {
    public static void main(String[] args) {
        Phone micromax = new Phone();
        micromax.Ringing();
        micromax.Vibrating();
        micromax.Silent();
    }
}
