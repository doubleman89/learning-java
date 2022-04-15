package com.paweldubel.samouczekprogramisty.objectProgramming.drive;

import com.paweldubel.samouczekprogramisty.objectProgramming.file.File;

public interface Drive  {
    void addFile( File file);
    void listFiles();
    File findFile(String name);

}
