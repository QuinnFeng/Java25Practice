package basic;

public class ConditionalPractice {
	public static void main(String[] args) {

        // =========================
        // 1. Basic if
        // =========================

        int age = 25;

        // The condition is true, so the code inside the if block executes.
        if (age >= 18) {
            System.out.println("Adult"); // Adult
        }


        // =========================
        // 2. if / else
        // =========================

        int temperature = 30;

        // If the condition is true, execute the if block.
        // Otherwise, execute the else block.
        if (temperature > 32) {
            System.out.println("Hot"); // Not executed
        } else {
            System.out.println("Not hot"); // Not hot
        }


        // =========================
        // 3. if / else if / else
        // =========================

        int score = 85;

        // Java checks the conditions from top to bottom.
        // The first true condition is executed.
        if (score >= 90) {
            System.out.println("Grade A"); // Not executed
        } else if (score >= 80) {
            System.out.println("Grade B"); // Grade B
        } else if (score >= 70) {
            System.out.println("Grade C"); // Not executed
        } else {
            System.out.println("Grade F"); // Not executed
        }


        // =========================
        // 4. Multiple conditions
        // =========================

        int userAge = 25;
        boolean hasLicense = true;

        // && means both conditions must be true.
        if (userAge >= 18 && hasLicense) {
            System.out.println("Allowed to drive"); // Allowed to drive
        }


        // || means at least one condition must be true.
        boolean isWeekend = false;
        boolean isHoliday = true;

        if (isWeekend || isHoliday) {
            System.out.println("Day off"); // Day off
        }


        // ! reverses a boolean value.
        boolean isLoggedIn = false;

        if (!isLoggedIn) {
            System.out.println("Please log in"); // Please log in
        }


        // =========================
        // 5. Nested if
        // =========================

        int accountAge = 25;
        boolean verified = true;

        // The inner if is checked only if the outer if is true.
        if (accountAge >= 18) {

            if (verified) {
                System.out.println("Account approved"); // Account approved
            }
        }


        // =========================
        // 6. Ternary as a short if/else
        // =========================

        int number = 10;

        // condition ? valueIfTrue : valueIfFalse
        String result = number % 2 == 0 ? "Even" : "Odd";

        System.out.println(result); // Even


        // =========================
        // 7. Basic switch
        // =========================

        int day = 3;

        // switch compares the value against each case.
        switch (day) {

            case 1:
                System.out.println("Monday"); // Not executed
                break;

            case 2:
                System.out.println("Tuesday"); // Not executed
                break;

            case 3:
                System.out.println("Wednesday"); // Wednesday
                break;

            case 4:
                System.out.println("Thursday"); // Not executed
                break;

            default:
                System.out.println("Other day"); // Not executed
        }


        // =========================
        // 8. switch with String
        // =========================

        String role = "admin";

        // switch can work with String values.
        switch (role) {

            case "admin":
                System.out.println("Full access"); // Full access
                break;

            case "user":
                System.out.println("Limited access"); // Not executed
                break;

            case "guest":
                System.out.println("Guest access"); // Not executed
                break;

            default:
                System.out.println("Unknown role"); // Not executed
        }


        // =========================
        // 9. switch fall-through
        // =========================

        int month = 12;

        // Without break, execution continues into the next case.
        switch (month) {

            case 12:
            case 1:
            case 2:
                System.out.println("Winter"); // Winter
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Spring"); // Not executed
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Summer"); // Not executed
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Fall"); // Not executed
                break;

            default:
                System.out.println("Invalid month"); // Not executed
        }


        // =========================
        // 10. switch without break
        // =========================

        int value = 1;

        // Because there is no break after case 1,
        // execution continues into case 2.
        switch (value) {

            case 1:
                System.out.println("One"); // One

            case 2:
                System.out.println("Two"); // Two

            case 3:
                System.out.println("Three"); // Three
                break;

            default:
                System.out.println("Other"); // Not executed
        }
    }

}
