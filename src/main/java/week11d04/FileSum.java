package week11d04;


import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class FileSum {
    public int sumNumbers() {
        int sum = 0;
        List<String> fileNames = new ArrayList<>();
        for ( int i = 0; i < 100; i++) {
            if ( i < 10) {
                fileNames.add(String.format("number0%d.txt", i));
            } else {
                fileNames.add(String.format("number%d.txt", i));
            }
        }
        for(String file : fileNames) {
            if(Files.isRegularFile(Path.of(file))) {
                String content;
                try {
                    content = Files.readString(Path.of(file));
                    sum += Integer.parseInt(content);
                } catch (IOException ioe) {
                    throw new IllegalStateException("Can not read file", ioe);
                }
            }
        }
        return sum;

    }


    public static void main(String[] args) {
        System.out.println(new FileSum().sumNumbers());
    }

}


