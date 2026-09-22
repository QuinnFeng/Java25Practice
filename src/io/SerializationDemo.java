package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

    static class Student implements Serializable {

        private static final long serialVersionUID = 1L;

        private String name;
        private int age;
        private String major;

        public Student(String name, int age, String major) {
            this.name = name;
            this.age = age;
            this.major = major;
        }

        @Override
        public String toString() {
            return "Student{name='" + name
                    + "', age=" + age
                    + ", major='" + major + "'}";
        }
    }

    public static void main(String[] args) {

        String fileName = "student.ser";

        Student student =
                new Student("Ken", 29, "Computer Science");

        // ========================================
        // 1. Serialization
        // ========================================

        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream(fileName);

            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(student);

            objectOutputStream.close();

            System.out.println("Object serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ========================================
        // 2. Deserialization
        // ========================================

        try {
            FileInputStream fileInputStream =
                    new FileInputStream(fileName);

            ObjectInputStream objectInputStream =
                    new ObjectInputStream(fileInputStream);

            Student restoredStudent =
                    (Student) objectInputStream.readObject();

            objectInputStream.close();

            System.out.println("Object deserialized.");
            System.out.println(restoredStudent);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // ========================================
        // 3. Cleanup
        // ========================================

//        java.io.File file = new java.io.File(fileName);
//        file.delete();
    }
}