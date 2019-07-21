package com.example.domain;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ReadingFiles {
    private String nameOfFile;

    public ReadingFiles(){}

    public ReadingFiles(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    public String readFile() throws IOException {
        String path = nameOfFile;
        File file = new File(path);
        String str = FileUtils.readFileToString(file);
        return str;
    }

    public String getNameOfFile() {
        return nameOfFile;
    }

    public void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }
}


