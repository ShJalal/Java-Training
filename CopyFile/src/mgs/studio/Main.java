package mgs.studio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Path sourceFile = Paths.get("files" , "target.txt");
        Path targetFile = Paths.get("files" , "get.txt");

        try {
            Files.copy(sourceFile,targetFile , StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
