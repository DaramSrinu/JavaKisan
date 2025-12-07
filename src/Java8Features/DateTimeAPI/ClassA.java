package Java8Features.DateTimeAPI;
import java.time.*;

public class ClassA {
    void meth1(){
        for(String s : ZoneId.getAvailableZoneIds())
            System.out.println(s);
    }
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(LocalTime.now(ZoneId.of("US/Hawaii")));
        //new ClassA().meth1();
    }
}
