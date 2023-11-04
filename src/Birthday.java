/* Спроектуйте та розробте метод, який визначає, скільки часу пройшло із заданої дати.
 За допомогою цього методи виведіть у консоль,
 скільки часу пройшло з вашого дня народження у зручному для сприйняття вигляді,
наприклад: «Вам виповнилося 20 років, 3 місяці, 18 днів, 4 години, 5 хвилин та 10 секунд».
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Birthday {
    public static void main(String[] args) {
        printBirthday(LocalDate.of(999, 9, 9));
    }

    public static void printBirthday(LocalDate startDate) {
        LocalDateTime startDateTime = startDate.atStartOfDay();
        LocalDateTime now = LocalDateTime.now();

        long years = ChronoUnit.YEARS.between(startDateTime, now);
        startDateTime = startDateTime.plusYears(years);

        long months = ChronoUnit.MONTHS.between(startDateTime, now);
        startDateTime = startDateTime.plusMonths(months);

        long days = ChronoUnit.DAYS.between(startDateTime, now);
        startDateTime = startDateTime.plusDays(days);

        long hours = ChronoUnit.HOURS.between(startDateTime, now);
        startDateTime = startDateTime.plusHours(hours);

        long minutes = ChronoUnit.MINUTES.between(startDateTime, now);
        startDateTime = startDateTime.plusMinutes(minutes);

        long seconds = ChronoUnit.SECONDS.between(startDateTime, now);

        System.out.println(years + "роки, " + months + "місяць, " + days + " днів, "
                + hours + " годин, " + minutes + " хвилин " + seconds + " секунд");

    }
}

