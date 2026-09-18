package basic;

import java.util.Iterator;

public class IteratorIterableDemo implements Iterable<String> {

    private String[] names = {"Ken", "John", "Alice", "Bob"};

    // Iterable provides the iterator()
    @Override
    public Iterator<String> iterator() {

        return new Iterator<String>() {

            private int index = 0;

            // Checks if there is another element
            @Override
            public boolean hasNext() {
                return index < names.length;
            }

            // Returns the next element
            @Override
            public String next() {
                return names[index++];
            }
        };
    }

    public static void main(String[] args) {

        IteratorIterableDemo people = new IteratorIterableDemo();

        // ========================================
        // 1. Using Iterator directly
        // ========================================

        Iterator<String> iterator = people.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // ========================================
        // 2. Using for-each
        // ========================================

        System.out.println("For-each:");

        for (String name : people) {
            System.out.println(name);
        }
    }
}