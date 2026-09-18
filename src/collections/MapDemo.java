package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {

        // =========================
        // HashMap
        // =========================

        Map<String, Integer> scores = new HashMap<>();

        // Add key/value pairs
        scores.put("Ken", 90);
        scores.put("Alice", 85);
        scores.put("Bob", 95);

        System.out.println("Scores: " + scores);

        // Get a value using its key
        System.out.println("Ken's score: " + scores.get("Ken"));

        // Update an existing value
        scores.put("Ken", 100);

        System.out.println("Updated Ken's score: " + scores.get("Ken"));

        // Check whether a key exists
        System.out.println("Contains Alice: " + scores.containsKey("Alice"));

        // Check whether a value exists
        System.out.println("Contains score 95: " + scores.containsValue(95));

        // Get a value that may not exist
        System.out.println("John's score: " + scores.get("John"));

        // getOrDefault
        System.out.println(
            "John's score with default: " + scores.getOrDefault("John", 0)
        );

        // Remove by key
        scores.remove("Bob");

        System.out.println("After removing Bob: " + scores);

        // Number of key/value pairs
        System.out.println("Size: " + scores.size());


        // =========================
        // Iteration
        // =========================

        System.out.println("\nKeys:");

        for (String name : scores.keySet()) {
            System.out.println(name);
        }

        System.out.println("\nValues:");

        for (Integer score : scores.values()) {
            System.out.println(score);
        }

        System.out.println("\nKey/Value pairs:");

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        // =========================
        // LinkedHashMap
        // =========================

        Map<String, Integer> linkedMap = new LinkedHashMap<>();

        linkedMap.put("Ken", 90);
        linkedMap.put("Alice", 85);
        linkedMap.put("Bob", 95);

        System.out.println("\nLinkedHashMap: " + linkedMap);


        // =========================
        // TreeMap
        // =========================

        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Ken", 90);
        treeMap.put("Alice", 85);
        treeMap.put("Bob", 95);

        System.out.println("TreeMap: " + treeMap);
    }
}