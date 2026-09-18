package basic;

public class EnumDemo {

    // ========================================
    // 1. Basic enum
    // ========================================

    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }


    // ========================================
    // 2. Enum with fields and methods
    // ========================================

    enum Status {

        PENDING("Waiting"),
        APPROVED("Approved"),
        REJECTED("Rejected");

        private String description;

        Status(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }


    public static void main(String[] args) {

        // ========================================
        // 3. Using an enum
        // ========================================

        Day today = Day.MONDAY;

        System.out.println(today);


        // ========================================
        // 4. Comparing enum values
        // ========================================

        if (today == Day.MONDAY) {
            System.out.println("Today is Monday.");
        }


        // ========================================
        // 5. switch with enum
        // ========================================

        switch (today) {

            case MONDAY:
                System.out.println("Start of the week.");
                break;

            case FRIDAY:
                System.out.println("Almost weekend.");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend.");
                break;

            default:
                System.out.println("Regular weekday.");
        }


        // ========================================
        // 6. values()
        // ========================================

        for (Day day : Day.values()) {
            System.out.println(day);
        }


        // ========================================
        // 7. valueOf()
        // ========================================

        Day day = Day.valueOf("FRIDAY");

        System.out.println(day);


        // ========================================
        // 8. Enum with a field and method
        // ========================================

        Status status = Status.APPROVED;

        System.out.println(status);
        System.out.println(status.getDescription());
    }
}