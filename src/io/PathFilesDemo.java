package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathFilesDemo {

    public static void main(String[] args) {

        try {
            // 1. Create a Path
            Path file = Paths.get("example.txt");

            System.out.println("Path: " + file);
            System.out.println("Absolute path: " + file.toAbsolutePath());

            // 2. Check whether the file exists
            System.out.println("Exists: " + Files.exists(file));

            // 3. Write text to the file
            Files.write(file, "Hello Java I/O!\nThis is a test file.".getBytes());

            // 4. Check again
            System.out.println("Exists after write: " + Files.exists(file));

            // 5. Read the entire file
            String content = new String(Files.readAllBytes(file));
            System.out.println("\nFile content:");
            System.out.println(content);

            // 6. Read the file as lines
            List<String> lines = Files.readAllLines(file);

            System.out.println("\nLines:");
            for (String line : lines) {
                System.out.println(line);
            }

            // 7. File information
            System.out.println("\nFile information:");
            System.out.println("File name: " + file.getFileName());
            System.out.println("Parent: " + file.getParent());
            System.out.println("Absolute: " + file.toAbsolutePath());

            // 8. Delete the file
            Files.delete(file);

            System.out.println("\nExists after delete: "
                    + Files.exists(file));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}