package com.java_essential.tsarenko.lesson10.memory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AppContext {

    public static final String FILE_NAME = "duke1.png";
    public static final String FOLDER = "images";

    public String getFilePath() throws IOException {
        String folderPath = getFolderPath();
        if (!checkDir(Path.of(folderPath))) {
            Files.createDirectories(Path.of(folderPath));
        }
        return Path.of(getAppRoot(), File.separator, FOLDER, File.separator, FILE_NAME).toString();
    }

    public String getAppRoot() {
        return System.getProperty("java.class.path").split(";")[0];
    }

    private boolean checkDir(Path filePath) {
        return Files.isDirectory(filePath);
    }

    private String getFolderPath() {
        return Path.of(getAppRoot(), File.separator, FOLDER).toString();
    }
}
