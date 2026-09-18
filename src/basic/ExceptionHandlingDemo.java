package basic;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        // Example 1: try-catch
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        // Example 2: multiple catch blocks
        try {
            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");

        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        // Example 3: finally
        try {
            System.out.println("Trying something...");
        } catch (Exception e) {
            System.out.println("Exception occurred.");
        } finally {
            System.out.println("Finally always runs.");
        }

        // Example 4: throw
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Example 5: throws
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception from divide().");
        }
    }

    // throw: manually create an exception
    public static void checkAge(int age) {

        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }

        System.out.println("Age is valid.");
    }

    // throws: tells the caller that this method may throw an exception
    public static void divide(int a, int b) throws ArithmeticException {

        int result = a / b;

        System.out.println(result);
    }
}