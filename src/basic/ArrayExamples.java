package basic;

public class ArrayExamples {

    public static void main(String[] args) {

        // =========================
        // 1. Declare and initialize an array
        // =========================
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers[0]);
        System.out.println(numbers[2]);

        // Expected output:
        // 10
        // 30


        // =========================
        // 2. Modify an element
        // =========================
        numbers[1] = 25;

        System.out.println(numbers[1]);

        // Expected output:
        // 25


        // =========================
        // 3. Array length
        // =========================
        System.out.println("Length: " + numbers.length);

        // Expected output:
        // Length: 5


        // =========================
        // 4. Loop through an array
        // =========================
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Expected output:
        // 10
        // 25
        // 30
        // 40
        // 50


        // =========================
        // 5. Enhanced for loop
        // =========================
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Expected output:
        // Number: 10
        // Number: 25
        // Number: 30
        // Number: 40
        // Number: 50


        // =========================
        // 6. Create an array with a fixed size
        // =========================
        String[] names = new String[3];

        names[0] = "Ken";
        names[1] = "John";
        names[2] = "Mary";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // Expected output:
        // Ken
        // John
        // Mary


        // =========================
        // 7. Pass an array to a method
        // =========================
        int total = calculateTotal(numbers);

        System.out.println("Total: " + total);

        // Expected output:
        // Total: 145
    }


    // Method that accepts an array as a parameter
    static int calculateTotal(int[] numbers) {

        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }
}