package basic;

public class OperatorsPractice {
	public static void main(String[] args) {

        // =========================
        // 1. Arithmetic Operators
        // =========================

        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3 (integer division)
        System.out.println("a % b = " + (a % b)); // 1 (remainder)

        double x = 10.0;
        double y = 3.0;

        System.out.println("x / y = " + (x / y)); // 3.3333333333333335


        // =========================
        // 2. Assignment Operators
        // =========================

        int number = 10;

        number += 5; // number = 15
        System.out.println("+= : " + number); // 15

        number -= 3; // number = 12
        System.out.println("-= : " + number); // 12

        number *= 2; // number = 24
        System.out.println("*= : " + number); // 24

        number /= 4; // number = 6
        System.out.println("/= : " + number); // 6

        number %= 3; // number = 0
        System.out.println("%= : " + number); // 0


        // =========================
        // 3. Relational Operators
        // =========================

        int c = 10;
        int d = 20;

        System.out.println("c == d: " + (c == d)); // false
        System.out.println("c != d: " + (c != d)); // true
        System.out.println("c > d: " + (c > d));   // false
        System.out.println("c < d: " + (c < d));   // true
        System.out.println("c >= d: " + (c >= d)); // false
        System.out.println("c <= d: " + (c <= d)); // true


        // =========================
        // 4. Logical Operators
        // =========================

        boolean isAdult = true;
        boolean hasLicense = false;

        System.out.println("AND: " + (isAdult && hasLicense));
        // false: both conditions must be true

        System.out.println("OR: " + (isAdult || hasLicense));
        // true: at least one condition is true

        System.out.println("NOT: " + (!isAdult));
        // false: ! reverses true to false


        // =========================
        // 5. Increment / Decrement
        // =========================

        int count = 5;

        count++;
        System.out.println("After ++: " + count); // 6

        count--;
        System.out.println("After --: " + count); // 5


        // =========================
        // 6. Prefix vs Postfix
        // =========================

        int value = 5;

        // Postfix: use the value first, then increment
        System.out.println("Postfix: " + value++); // 5
        System.out.println("Value: " + value);      // 6

        // Prefix: increment first, then use the value
        System.out.println("Prefix: " + ++value);   // 7
        System.out.println("Value: " + value);      // 7


        // =========================
        // 7. Ternary Operator
        // =========================

        int age = 20;

        // condition ? valueIfTrue : valueIfFalse
        String result = age >= 18 ? "Adult" : "Minor";

        System.out.println("Result: " + result); // Adult


        // =========================
        // 8. String Concatenation
        // =========================

        String firstName = "Ken";
        String lastName = "Feng";

        String fullName = firstName + " " + lastName;

        System.out.println("Full name: " + fullName); // Ken Feng


        // =========================
        // 9. Bitwise Operators
        // =========================

        int p = 5; // Binary: 0101
        int q = 3; // Binary: 0011

        System.out.println("p & q = " + (p & q));
        // 0101
        // 0011
        // ----
        // 0001 = 1

        System.out.println("p | q = " + (p | q));
        // 0101
        // 0011
        // ----
        // 0111 = 7
        
        //XOR
        System.out.println("p ^ q = " + (p ^ q));
        // 0101
        // 0011
        // ----
        // 0110 = 6

        System.out.println("~p = " + (~p));
        // ~5 = -6
        // Bitwise NOT inverts all bits


        // =========================
        // 10. Shift Operators
        // =========================

        int n = 9; // Binary: 1000

     // Left shift: moves all bits one position to the left.
     // A 0 is added on the right.
     // 00001000 << 1 → 00010010 → 18
     System.out.println("n << 1 = " + (n << 1)); // 18

     // Signed right shift: moves all bits one position to the right.
     // For a positive number, 0 is added on the left.
     // 00001001 >> 1 → 00000100 → 4
     System.out.println("n >> 1 = " + (n >> 1)); // 4

     // Unsigned right shift: moves all bits one position to the right.
     // 0 is always added on the left, regardless of the sign.
     // 00001001 >>> 1 → 00000100 → 4
     System.out.println("n >>> 1 = " + (n >>> 1)); // 4
    }
}
