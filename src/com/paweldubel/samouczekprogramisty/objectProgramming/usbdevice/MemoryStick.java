package com.paweldubel.samouczekprogramisty.objectProgramming.usbdevice;

public class MemoryStick implements  USBDevice{
   private String name;
   private boolean ejected;

    public MemoryStick(String name) {
        this.name = name;
    }


    @Override
    public boolean connect() {

        System.out.println(name+ " connected");
        return  true;
    }

    @Override
    public boolean disconnect() {
        if(!ejected){
            System.out.println("Please eject Memory Stick" + name +" first");
            return false;
        }
        else {
            System.out.println(name + " disconnected");
            return true;
        }

    }

    @Override
    public String getName() {
        return name;
    }

    public void eject(){
        System.out.println("Ejecting of Memory Stick " + name);
        ejected=true;

    }
}
