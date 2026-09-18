package basic;

public class LoopExamples {

    public static void main(String[] args) {

        // =========================
        // 1. for loop
        // =========================
        // Best when you generally know how many times to repeat.
        for (int i = 1; i <= 5; i++) {
            System.out.println("for: " + i);
        }

        // Expected output:
        // for: 1
        // for: 2
        // for: 3
        // for: 4
        // for: 5


        // =========================
        // 2. while loop
        // =========================
        // Condition is checked BEFORE the loop body.
        int j = 1;

        while (j <= 5) {
            System.out.println("while: " + j);
            j++;
        }

        // Expected output:
        // while: 1
        // while: 2
        // while: 3
        // while: 4
        // while: 5


        // =========================
        // 3. do-while loop
        // =========================
        // Condition is checked AFTER the loop body.
        // Therefore, the body runs at least once.
        int k = 10;

        do {
            System.out.println("do-while: " + k);
            k++;
        } while (k < 5);

        // Expected output:
        // do-while: 10
    }
}
