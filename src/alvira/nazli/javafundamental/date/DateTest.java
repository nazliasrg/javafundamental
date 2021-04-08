package alvira.nazli.javafundamental.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public DateTest() {
        LocalDate dateToday = LocalDate.now();
        LocalTime timeToday = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDate tomorrow = dateToday.plusDays(1);
        LocalDate threeDaysAgo = LocalDate.now().minusDays(3);

        // Date Formatter
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        String formattedDate = dateTime.format(myFormatObj);

        // Date - String
        String dateString = "19-Aug-2021";
        DateTimeFormatter dateStringFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDate dateStringConvert = LocalDate.parse(dateString, dateStringFormatter);
        String formattedDateString = dateStringConvert.format(myFormatObj);

        Integer hari = dateToday.getDayOfMonth();
        Integer hari2 = threeDaysAgo.getDayOfMonth();
        Integer interval = hari2 - hari;

        System.out.println("Tanggal hari ini         : " + dateToday);
        System.out.println("Waktu saat ini           : " + timeToday);
        System.out.println("Tanggal & Waktu saat ini : " + formattedDate);
        System.out.println("\nTanggal besok           : " + tomorrow);
        System.out.println("Tanggal 3 hari lalu      : " + threeDaysAgo);
        System.out.println("Hari ultah tahun ini     : " + dateStringConvert);
        System.out.println("Hari ultah tahun ini     : " + formattedDateString);
    }

    public static void main(String[] args) {
        new DateTest();
    }
}

