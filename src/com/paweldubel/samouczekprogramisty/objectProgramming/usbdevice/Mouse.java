package com.paweldubel.samouczekprogramisty.objectProgramming.usbdevice;

public class Mouse implements USBDevice {
    private int cursorX;
    private int cursorY;
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    public int getCursorX() {
        return cursorX;
    }

    public void setCursorX(int cursorX) {
        this.cursorX = cursorX;
    }

    public int getCursorY() {
        return cursorY;
    }

    public void setCursorY(int cursorY) {
        this.cursorY = cursorY;
    }

    @Override
    public boolean connect() {

        System.out.println(name + " connected");
        return  true;
    }

    @Override
    public boolean disconnect() {
        System.out.println(name + " disconnected");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
