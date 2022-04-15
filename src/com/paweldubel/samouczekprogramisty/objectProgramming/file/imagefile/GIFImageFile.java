package com.paweldubel.samouczekprogramisty.objectProgramming.file.imagefile;

public class GIFImageFile extends AbstractImageFile   {


    public GIFImageFile(String name, int size) {
        super(name,size);
    }



    public void showAnimation(){

        System.out.println("SHowing GIF image");
    }
//    public int getVersion()
//    {return 2;}
}
