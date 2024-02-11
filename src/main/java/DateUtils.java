import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        LocalDate date = LocalDate.now();
        return isDateBetween(date, endingDate, startingDate);
    }

    private static boolean isDateBetween(LocalDate date, LocalDate endingDate, LocalDate startingDate) {
        return date.isAfter(startingDate) &&
                date.isBefore(endingDate);
    }

    public static boolean isDateOutside(LocalDate date, LocalDate startingDate,
                                        LocalDate endingDate) {
        return !isDateBetween(date, startingDate, endingDate);
    }
}