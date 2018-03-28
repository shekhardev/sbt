package datetime.example;

import java.time.Period;

public class PeriodClass {
    public static void main(String[] args) {
        Period periodOfDays = Period.ofDays(12);
        System.out.println("Before Plus, periodOdDays= " + periodOfDays);

        periodOfDays = periodOfDays.plusDays(15);
        System.out.println("After Plus ,periodOfDays = " + periodOfDays);
    }
}
