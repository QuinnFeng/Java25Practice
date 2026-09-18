package moderate;

import java.util.ArrayList;
import java.util.List;

public class GenericWildcardDemo {

    public static void printList(List<?> list) {

        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ken");
        names.add("Alice");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        printList(names);
        printList(numbers);
    }
}