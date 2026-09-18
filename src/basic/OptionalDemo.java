package basic;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        // ========================================
        // 1. Creating Optional
        // ========================================

        Optional<String> name = Optional.of("Ken");

        Optional<String> emptyName = Optional.empty();

        Optional<String> possibleName =
                Optional.ofNullable(null);


        // ========================================
        // 2. isPresent()
        // ========================================

        System.out.println(name.isPresent());       // true
        System.out.println(emptyName.isPresent());  // false
        System.out.println(possibleName.isPresent());  

        // ========================================
        // 3. get()
        // ========================================

        System.out.println(name.get());             // Ken

        // Do NOT call get() when the Optional is empty.
        // emptyName.get();  // NoSuchElementException


        // ========================================
        // 4. orElse()
        // ========================================

        String result1 = emptyName.orElse("Unknown");

        System.out.println(result1);                // Unknown


        // ========================================
        // 5. orElseGet()
        // ========================================

        String result2 = emptyName.orElseGet(
            () -> "Default Name"
        );

        System.out.println(result2);                // Default Name


        // ========================================
        // 6. ifPresent()
        // ========================================

        name.ifPresent(
            value -> System.out.println("Name: " + value)
        );


        // ========================================
        // 7. map()
        // ========================================

        Optional<String> upperName =
            name.map(value -> value.toUpperCase());

        System.out.println(upperName.get());        // KEN


        // ========================================
        // 8. filter()
        // ========================================

        Optional<String> filteredName =
            name.filter(value -> value.length() > 2);

        System.out.println(filteredName.isPresent()); // true
    }
}