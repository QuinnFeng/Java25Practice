package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TraditionalIODemo {

    public static void main(String[] args) {

        File file = new File("traditional-io.txt");

        try {
            // ========================================
            // 1. File
            // ========================================

            System.out.println("File path: " + file.getPath());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Exists: " + file.exists());

            // ========================================
            // 2. FileWriter + BufferedWriter
            // ========================================

            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Hello from Java I/O!");
            bufferedWriter.newLine();
            bufferedWriter.write("This is the second line.");

            bufferedWriter.close();

            System.out.println("\nAfter writing:");
            System.out.println("Exists: " + file.exists());

            // ========================================
            // 3. FileReader + BufferedReader
            // ========================================

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            System.out.println("\nReading line by line:");

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

            // ========================================
            // 4. FileOutputStream
            // ========================================

            File byteFile = new File("bytes.txt");

            FileOutputStream outputStream =
                    new FileOutputStream(byteFile);

            byte[] data = {65, 66, 67, 68, 69};

            outputStream.write(data);
            outputStream.close();

            System.out.println("\nBytes written to: "
                    + byteFile.getName());

            // ========================================
            // 5. FileInputStream
            // ========================================

            FileInputStream inputStream =
                    new FileInputStream(byteFile);

            System.out.println("Reading bytes:");

            int value;

            while ((value = inputStream.read()) != -1) {
                System.out.println(value + " -> "
                        + (char) value);
            }

            inputStream.close();

            // ========================================
            // 6. Cleanup
            // ========================================

            file.delete();
            byteFile.delete();

            System.out.println("\nFiles deleted.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}