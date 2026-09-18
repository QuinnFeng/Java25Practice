package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        // =========================
        // HashSet
        // =========================

        Set<String> hashSet = new HashSet<>();

        hashSet.add("Ken");
        hashSet.add("Alice");
        hashSet.add("Bob");
        hashSet.add("Ken");       // Duplicate - ignored

        System.out.println("HashSet: " + hashSet);
        System.out.println("Size: " + hashSet.size());

        System.out.println("Contains Alice: " + hashSet.contains("Alice"));

        hashSet.remove("Bob");

        System.out.println("After removing Bob: " + hashSet);


        // =========================
        // LinkedHashSet
        // =========================

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Ken");
        linkedHashSet.add("Alice");
        linkedHashSet.add("Bob");
        linkedHashSet.add("Ken");       // Duplicate - ignored

        System.out.println("LinkedHashSet: " + linkedHashSet);


        // =========================
        // TreeSet
        // =========================

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Ken");
        treeSet.add("Alice");
        treeSet.add("Bob");
        treeSet.add("David");

        System.out.println("TreeSet: " + treeSet);

        // Loop through a Set
        for (String name : treeSet) {
            System.out.println(name);
        }
    }
}