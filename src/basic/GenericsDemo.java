package basic;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {

        // Generic List that can only store Strings
        List<String> names = new ArrayList<>();

        names.add("Ken");
        names.add("John");
        names.add("Alice");

        System.out.println(names.get(0));

        // Generic List that can only store Integers
        List<Integer> scores = new ArrayList<>();

        scores.add(90);
        scores.add(85);
        scores.add(95);

        System.out.println(scores.get(0));

        // Generic class
        Box<String> stringBox = new Box<>("Hello");
        System.out.println(stringBox.getValue());

        Box<Integer> numberBox = new Box<>(100);
        System.out.println(numberBox.getValue());

        // Generic method
        printValue("Java");
        printValue(123);
        printValue(3.14);
    }

    // Generic method
    public static <T> void printValue(T value) {
        System.out.println(value);
    }
}


// Generic class
class Box<T> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}