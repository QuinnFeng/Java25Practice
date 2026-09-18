package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> names = new LinkedList<>();

        // Add elements
        names.add("Ken");
        names.add("Alice");
        names.add("Bob");

        System.out.println("Original list: " + names);

        // Add at a specific position
        names.add(1, "John");

        System.out.println("After adding John: " + names);

        // Get an element by index
        System.out.println("Element at index 2: " + names.get(2));

        // Change an element
        names.set(0, "Kevin");

        System.out.println("After changing first element: " + names);

        // Remove by index
        names.remove(1);

        System.out.println("After removing index 1: " + names);

        // Add to the beginning
        names.addFirst("David");

        // Add to the end
        names.addLast("Sarah");

        System.out.println("After addFirst/addLast: " + names);

        // Remove from the beginning
        names.removeFirst();

        // Remove from the end
        names.removeLast();

        System.out.println("After removeFirst/removeLast: " + names);

        // Check the first and last elements
        System.out.println("First: " + names.getFirst());
        System.out.println("Last: " + names.getLast());

        // Check whether an element exists
        System.out.println("Contains Bob: " + names.contains("Bob"));

        // Loop through the list
        for (String name : names) {
            System.out.println(name);
        }
    }
}