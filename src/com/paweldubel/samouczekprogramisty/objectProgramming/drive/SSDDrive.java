package com.paweldubel.samouczekprogramisty.objectProgramming.drive;

import com.paweldubel.samouczekprogramisty.objectProgramming.file.File;

import java.util.HashMap;
import java.util.Map;

public class SSDDrive implements Drive{
    private Map<String, File> files = new HashMap<>();
    @Override
    public void addFile(File file) {

        files.put(file.getName(),file);
    }

    @Override
    public void listFiles() {
        for (File file:files.values()
             ) {
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String name) {
        System.out.println("szukam pliku "+name);
        if (files.containsKey(name)){

            System.out.println("znaleziono");
            return files.get(name);
        }

        else{
            return null;
        }

    }
}
