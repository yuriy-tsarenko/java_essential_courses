package com.java_essential.someAdditionalTask.Task_1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class SimpleLogger {
    public static final String FILE_NAME = "simpleLog.log";
    public static final String FOLDER = "logs";

    public void logInfo(String message) {
        String filePath = getFilePath();
        String folderPath = getFolderPath();
        try {
            if (!checkDir(Path.of(folderPath))) {
                Files.createDirectories(Path.of(folderPath));
            }
            if (Files.isRegularFile(Path.of(filePath))) {
                String exitingData = "";
                FileReader reader = new FileReader(filePath);
                Scanner scanner = new Scanner(reader);
                while (scanner.hasNextLine()) {
                    exitingData = exitingData.concat(scanner.nextLine() + "\n");
                }
                message = exitingData + getTimeStamp() + " INFO: " + message;
                reader.close();
            } else {
                message = getTimeStamp() + " INFO: " + message;
            }
            FileWriter writer = new FileWriter(filePath);
            writer.write(message);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean checkDir(Path filePath) {
        return Files.isDirectory(filePath);
    }
    public String getAppRoot() {
        return System.getProperty("java.class.path").split(";")[0];
    }
    public String getFilePath() {
        return Path.of(getAppRoot(), File.separator, FOLDER, File.separator, FILE_NAME).toString();
    }
    private String getTimeStamp() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
        return formatter.format(date);
    }
    public String getFolderPath() {
        return Path.of(getAppRoot(), File.separator, FOLDER).toString();
    }
}
