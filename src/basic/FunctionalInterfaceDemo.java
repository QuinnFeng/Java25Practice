package basic;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        // Lambda with two parameters
        Calculator add = (a, b) -> a + b;

        System.out.println(add.calculate(10, 5));


        // Lambda with one parameter
        Greeting greeting = name -> "Hello, " + name;

        System.out.println(greeting.sayHello("Ken"));


        // Lambda with no parameters
        Message message = () -> "Java is fun.";

        System.out.println(message.getMessage());
        
        // ========================================
        // 1. Predicate<T>
        // ========================================
        // Takes a value and returns true or false.

        Predicate<Integer> isAdult = age -> age >= 18;

        System.out.println(isAdult.test(20));  // true
        System.out.println(isAdult.test(15));  // false


        // ========================================
        // 2. Consumer<T>
        // ========================================
        // Takes a value and returns nothing.

        Consumer<String> printName = name -> System.out.println("Name: " + name);

        printName.accept("Ken");
        printName.accept("John");


        // ========================================
        // 3. Function<T, R>
        // ========================================
        // Takes one value and returns another value.

        Function<String, Integer> getLength = text -> text.length();

        System.out.println(getLength.apply("Java"));    // 4
        System.out.println(getLength.apply("Hello"));   // 5


        // ========================================
        // 4. Supplier<T>
        // ========================================
        // Takes no input and supplies a value.

        Supplier<String> getMessage = () -> "Hello from Java!";

        System.out.println(getMessage.get());

        Supplier<Integer> getNumber = () -> 100;

        System.out.println(getNumber.get());
        
        Supplier<String> tokenGenerator =
                () -> UUID.randomUUID().toString();

        String token1 = tokenGenerator.get();
        String token2 = tokenGenerator.get();

        System.out.println(token1);
        System.out.println(token2);
    }
}


// Functional interface with two parameters
@FunctionalInterface
interface Calculator {

    int calculate(int a, int b);
}


// Functional interface with one parameter
@FunctionalInterface
interface Greeting {

    String sayHello(String name);
}


// Functional interface with no parameters
@FunctionalInterface
interface Message {

    String getMessage();
}