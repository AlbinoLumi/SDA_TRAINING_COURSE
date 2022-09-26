package ExamTopics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        String date = LocalDate.parse("2014-05-09").format(DateTimeFormatter.ISO_DATE);
        System.out.println(date);

    }
}
