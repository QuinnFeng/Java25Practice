package moderate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

    public static void main(String[] args) {

        // ========================================
        // 1. LocalDate - Date only
        // ========================================

        LocalDate today = LocalDate.now();

        System.out.println("Today: " + today);

        LocalDate birthday = LocalDate.of(1997, 5, 20);

        System.out.println("Birthday: " + birthday);
        System.out.println("Year: " + birthday.getYear());
        System.out.println("Month: " + birthday.getMonth());
        System.out.println("Day: " + birthday.getDayOfMonth());


        // ========================================
        // 2. LocalTime - Time only
        // ========================================

        LocalTime currentTime = LocalTime.now();

        System.out.println("\nCurrent time: " + currentTime);

        LocalTime lunch = LocalTime.of(12, 30);

        System.out.println("Lunch time: " + lunch);
        System.out.println("Hour: " + lunch.getHour());
        System.out.println("Minute: " + lunch.getMinute());


        // ========================================
        // 3. LocalDateTime - Date + Time
        // ========================================

        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("\nCurrent date/time: " + currentDateTime);

        LocalDateTime meeting =
                LocalDateTime.of(2026, 9, 20, 14, 30);

        System.out.println("Meeting: " + meeting);


        // ========================================
        // 4. Adding and subtracting
        // ========================================

        LocalDate date = LocalDate.of(2026, 9, 17);

        LocalDate tomorrow = date.plusDays(1);
        LocalDate nextWeek = date.plusWeeks(1);
        LocalDate nextMonth = date.plusMonths(1);
        LocalDate yesterday = date.minusDays(1);

        System.out.println("\nOriginal date: " + date);
        System.out.println("Tomorrow: " + tomorrow);
        System.out.println("Next week: " + nextWeek);
        System.out.println("Next month: " + nextMonth);
        System.out.println("Yesterday: " + yesterday);


        // ========================================
        // 5. Comparing dates
        // ========================================

        LocalDate date1 = LocalDate.of(2026, 9, 17);
        LocalDate date2 = LocalDate.of(2026, 9, 20);

        System.out.println("\nDate comparison:");

        System.out.println("date1 before date2: "
                + date1.isBefore(date2));

        System.out.println("date1 after date2: "
                + date1.isAfter(date2));

        System.out.println("date1 equal date2: "
                + date1.isEqual(date2));

        System.out.println("date1 equals date2: "
                + date1.equals(date2));


        // ========================================
        // 6. DateTimeFormatter - Formatting
        // ========================================

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String formattedDate =
                date.format(formatter);

        System.out.println("\nFormatted date: " + formattedDate);

        DateTimeFormatter anotherFormatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println(
                "Another format: "
                + date.format(anotherFormatter)
        );


        // ========================================
        // 7. Parsing String into LocalDate
        // ========================================

        String text = "2026-09-17";

        LocalDate parsedDate =
                LocalDate.parse(text);

        System.out.println("\nParsed date: " + parsedDate);


        // Parsing using a custom format

        String customText = "09/17/2026";

        DateTimeFormatter customFormatter =
                DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate parsedCustomDate =
                LocalDate.parse(customText, customFormatter);

        System.out.println(
                "Parsed custom date: "
                + parsedCustomDate
        );


        // ========================================
        // 8. Period - Date-based difference
        // ========================================

        LocalDate startDate =
                LocalDate.of(2020, 9, 17);

        LocalDate endDate =
                LocalDate.of(2026, 9, 17);

        Period period =
                Period.between(startDate, endDate);

        System.out.println("\nPeriod:");

        System.out.println("Years: "
                + period.getYears());

        System.out.println("Months: "
                + period.getMonths());

        System.out.println("Days: "
                + period.getDays());


        // ========================================
        // 9. Duration - Time-based difference
        // ========================================

        LocalTime startTime =
                LocalTime.of(10, 0);

        LocalTime endTime =
                LocalTime.of(12, 30);

        Duration duration =
                Duration.between(startTime, endTime);

        System.out.println("\nDuration:");

        System.out.println("Minutes: "
                + duration.toMinutes());

        System.out.println("Hours: "
                + duration.toHours());


        // ========================================
        // 10. ZonedDateTime - Date + Time + Timezone
        // ========================================

        ZonedDateTime newYorkTime =
                ZonedDateTime.now(
                        ZoneId.of("America/New_York")
                );

        System.out.println("\nNew York time: "
                + newYorkTime);

        ZonedDateTime tokyoTime =
                newYorkTime.withZoneSameInstant(
                        ZoneId.of("Asia/Tokyo")
                );

        System.out.println("Tokyo time: "
                + tokyoTime);


        // ========================================
        // 11. Immutability
        // ========================================

        LocalDate original =
                LocalDate.of(2026, 9, 17);

        LocalDate changed =
                original.plusDays(10);

        System.out.println("\nImmutability:");

        System.out.println("Original: "
                + original);

        System.out.println("Changed: "
                + changed);


        // ========================================
        // Main mental model
        // ========================================

        System.out.println("\nMain DateTime classes:");

        System.out.println("LocalDate       -> date only");
        System.out.println("LocalTime       -> time only");
        System.out.println("LocalDateTime   -> date + time");
        System.out.println("ZonedDateTime   -> date + time + timezone");
        System.out.println("Period          -> years/months/days");
        System.out.println("Duration        -> hours/minutes/seconds");
        System.out.println("Formatter       -> format/parse");
    }
}