package com.paweldubel.samouczekprogramisty.objectProgramming.file.imagefile;

public class JPGImageFIle extends AbstractImageFile{

    private int compression;

    public JPGImageFIle(String name, int size,int compression) {
        super(name,size);
        this.compression = compression;
    }

    public int getCompression() {
        return compression;
    }

    public void displayImage(){
        System.out.println("Displaying JPG");
    }
}
