package datetime.example;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class ZondedDateTime {

    public static void main(String[] args) {
        ZonedDateTime zondedDateTime = ZonedDateTime.now();

        System.out.println(zondedDateTime);

        int dayOfMonth1 = zondedDateTime.get(ChronoField.DAY_OF_MONTH);
        System.out.println(dayOfMonth1);

        int monthOfYear = zondedDateTime.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(monthOfYear);

        DateTimeFormatter formatTodayWithZoneId= DateTimeFormatter.ofPattern("MM/dd/yy hh:mm:ss VV");

        LocalDateTime today=LocalDateTime.now();
        ZoneId timeZone=ZoneId.of("America/New_York");
        ZonedDateTime todayWithTimeZone=ZonedDateTime.of(today, timeZone);
        System.out.format("Formatted date time with zone ID of New York is %s\n", todayWithTimeZone.format(formatTodayWithZoneId));
    }
}
