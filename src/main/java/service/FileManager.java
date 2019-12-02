package service;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileManager {

    public String getPath() {
        return System.getProperty("user.home") + "/data/in/";
    }

    public List<String> listFilesInAFolder() {
        String path = getPath();
        List<File> files = Arrays.asList(new File(path).listFiles());

        List<String> fileNames = new ArrayList<>();

        for (File file : files) {
            if (file.getName().endsWith("txt")) {
                fileNames.add(getPath() + file.getName());
            }
        }
        return fileNames;
    }
}
