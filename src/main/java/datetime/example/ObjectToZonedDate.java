package datetime.example;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class ObjectToZonedDate {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);

        ZonedDateTime zonedDateTime =ZonedDateTime.from(offsetDateTime);
        System.out.println(zonedDateTime);
    }
}
