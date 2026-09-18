package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Create an ArrayList
        List<String> names = new ArrayList<>();

        // Add elements
        names.add("Ken");
        names.add("Alice");
        names.add("Bob");

        // Get an element
        System.out.println("First name: " + names.get(0));

        // Change an element
        names.set(1, "John");

        // Remove an element
        names.remove("Bob");

        // Check size
        System.out.println("Size: " + names.size());

        // Check whether an element exists
        System.out.println("Contains Ken: " + names.contains("Ken"));

        // Loop through the list
        for (String name : names) {
            System.out.println(name);
        }
    }
}