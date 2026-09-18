package JavaEight;

public class LambdaDemo {

    public static void main(String[] args) {

        // Traditional approach
        Runnable traditional = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from traditional code.");
            }
        };

        traditional.run();


        // Lambda expression
        Runnable lambda = () -> {
            System.out.println("Hello from lambda.");
        };

        lambda.run();


        // Lambda with one parameter
        Calculator add = (a, b) -> {
            return a + b;
        };

        System.out.println(add.calculate(10, 5));


        // Lambda with a shorter syntax
        Calculator multiply = (a, b) -> a * b;

        System.out.println(multiply.calculate(10, 5));
    }
}


// Functional interface
interface Calculator {

    int calculate(int a, int b);
}