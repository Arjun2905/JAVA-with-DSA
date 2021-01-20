package com.company;

interface TvRemote{
    //void RemoteButtons();
    void RemoteOff();
    void RemoteOn();
    //void RemoteExit();
}

interface SmartRemote extends TvRemote{
    //@Override
    void RemoteButtons();

    //@Override
    void RemoteExit();
}

class Tv implements SmartRemote{
    public void RemoteOff(){
        System.out.println("Switching off...");
    }

    public void RemoteOn(){
        System.out.println("Switching on...");
    }

    public void RemoteExit(){
        System.out.println("Exits...");
    }

    public void RemoteButtons(){
        System.out.println("Pressing buttons...");
    }
}

public class TvRemoteInterface {
    public static void main(String[] args) {
        Tv Sam = new Tv();
        Sam.RemoteButtons();
        Sam.RemoteExit();
        Sam.RemoteOff();
        Sam.RemoteOn();
    }
}
