package com.paweldubel.samouczekprogramisty.objectProgramming;


import com.paweldubel.samouczekprogramisty.objectProgramming.drive.Drive;
import com.paweldubel.samouczekprogramisty.objectProgramming.drive.HDDDrive;
import com.paweldubel.samouczekprogramisty.objectProgramming.drive.SSDDrive;
import com.paweldubel.samouczekprogramisty.objectProgramming.file.File;
import com.paweldubel.samouczekprogramisty.objectProgramming.file.imagefile.GIFImageFile;
import com.paweldubel.samouczekprogramisty.objectProgramming.file.imagefile.JPGImageFIle;
import com.paweldubel.samouczekprogramisty.objectProgramming.file.musicfile.MP3MusicFile;

import java.util.ArrayList;
import java.util.List;

public class Mainsamouczek {

    public static void main(String[] args) {
//        GIFImageFile gif1 = new GIFImageFile("Gif1.gif", 4096);
//        JPGImageFIle jpg1 = new JPGImageFIle("nazwa1.jpg", 200, 400);
//        MP3MusicFile mp3MusicFile = new MP3MusicFile("plik.mp3", 16000, "Jetson", "jabadabad", 256);
//
//        SSDDrive drive = new SSDDrive();
//        drive.addFile(gif1);
//        drive.addFile(jpg1);
//        drive.addFile(mp3MusicFile);
//
//
//        drive.listFiles();
//
//
//        HDDDrive hddDrive = new HDDDrive();
//        hddDrive.addFile(gif1);
//        hddDrive.addFile(jpg1);
//        hddDrive.addFile(mp3MusicFile);
//        hddDrive.listFiles();
//        File file = drive.findFile("plik.mp3");
//        System.out.println(file.getSize());
//
//        gif1.showAnimation();
//        jpg1.displayImage();
//        mp3MusicFile.play();


   //     MP3MusicFile mp3MusicFile = new MP3MusicFile("plik.mp3", 2000, "cool kids of deatj", "jabadaba", 2000);
    //    System.out.println(mp3MusicFile);


        GIFImageFile gifImageFile = new GIFImageFile("plik.gif", 200);
        System.out.println(gifImageFile.getVersion());
        Monitor monitor = new Monitor();
        System.out.println(Monitor.MAX_HEIGHT);

    }
}
