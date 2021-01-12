package Dependency;

import com.google.common.io.Files;
import java.io.IOException;
import java.io.File;

public class Main {
    public void createFile() {
        String fileName = "newfile.txt";
        File file = new File(fileName);
        
        String content = "text content";
        try {
			Files.write(content.getBytes(), file);
		} catch (IOException exception) {
			return;
		}
    }

    public static void main(String[] args) {
        new Main().createFile();
    }
}
