package basic;

public class MethodExamples {
	
	
	
    public static void main(String[] args) {

        // =========================
        // 1. Method with no parameters and no return value
        // =========================
        sayHello();

        // Expected output:
        // Hello!

        //Parameter = variable in the method definition.

        // =========================
        // 2. Method with parameters
        // =========================
        greet("Ken");

        // Expected output:
        // Hello, Ken!


        // =========================
        // 3. Method with a return value
        // =========================
        int result = add(10, 20);

        System.out.println("Result: " + result);

        // Expected output:
        // Result: 30

        //Argument = actual value passed when calling the method.
        // =========================
        // 4. Method with multiple parameters
        // =========================
        int product = multiply(5, 4);

        System.out.println("Product: " + product);

        // Expected output:
        // Product: 20


        // =========================
        // 5. Method returning a String
        // =========================
        String message = createMessage("Java");

        System.out.println(message);

        // Expected output:
        // Learning Java is fun!


        // =========================
        // 6. Method with a boolean return value
        // =========================
        boolean result2 = isAdult(29);

        System.out.println("Is adult: " + result2);

        // Expected output:
        // Is adult: true
    }


    // No parameters, no return value
    static void sayHello() {
        System.out.println("Hello!");
    }


    // Parameter, no return value
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }


    // Parameters + return value
    static int add(int a, int b) {
        return a + b;
    }


    // Multiple parameters + return value
    static int multiply(int a, int b) {
        return a * b;
    }


    // String return value
    static String createMessage(String subject) {
        return "Learning " + subject + " is fun!";
    }


    // Boolean return value
    static boolean isAdult(int age) {
        return age >= 18;
    }
}
