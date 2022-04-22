package FileWriteTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileI_O {
    public static void main(String[] args){
        List<String> linesToWrite = new ArrayList<>();
        linesToWrite.add("Hello!");
        linesToWrite.add("This is a line");
        linesToWrite.add("Now read this");
       tryWriteFile(createFile(),linesToWrite);

        for (String lines:tryReadFile(createFile())) {
            System.out.println(lines);
        }
    }


    private static Path createFile(){
        String directory = "src/FileWriteTest";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (! Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }
            return dataFile;
        }catch (IOException ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static  void tryWriteFile(Path filePath, List<String> linesToWrite){
        try {
            Files.write(filePath,linesToWrite);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static List<String> tryReadFile(Path filepath) {
        try {
            return Files.readAllLines(filepath);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
