package com.paweldubel.samouczekprogramisty.objectProgramming.file.imagefile;

import com.paweldubel.samouczekprogramisty.objectProgramming.file.AbstractFile;
import com.paweldubel.samouczekprogramisty.objectProgramming.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
    super(name,size);
    }


    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
