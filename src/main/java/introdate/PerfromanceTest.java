package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {
        Performance performance = new Performance("Kistehén" , LocalDate.of(2020,02), LocalTime.of(23,00)); LocalTime.of(20, 00));
        System.out.println(performance.getInfo());
    }
}
