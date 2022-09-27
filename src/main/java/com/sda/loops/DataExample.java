package com.sda.loops;

import java.time.*;

    public class DataExample {
        public static void main(String[] args) {
            LocalTime localTime = LocalTime.now();
            System.out.println(localTime);
            LocalTime localTime2 = LocalTime.now().withHour(4).withMinute(4);
            System.out.println(localTime2);
            LocalTime localTime3 = LocalTime.now().minusHours(3).minusMinutes(15);
            System.out.println(localTime3);
            LocalTime localTime4 = LocalTime.now().plusHours(3);
            System.out.println(localTime4);
            LocalTime localTime5 = LocalTime.now();
            String formattedDate = localTime5.getHour() + "-" + localTime5.getMinute() + "-" + localTime5.getSecond();
            System.out.println(formattedDate);

            LocalDate localDate = LocalDate.now();
            System.out.println(localDate);
            LocalDate localDate1 = LocalDate.now().minusYears(2000).minusDays(24).minusMonths(7);
            System.out.println(localDate1);
            String formattedTime = localDate.getDayOfMonth() + "/" +localDate.getMonthValue() + "/" + localDate.getYear();
            System.out.println(formattedTime);

            LocalDateTime localDateTime = LocalDateTime.now();
            System.out.println(localDateTime);
            System.out.println(localDateTime.getYear());
            System.out.println(localDateTime.getMonthValue());
            System.out.println(localDateTime.getHour());
            localDateTime= localDateTime.withHour(3).withDayOfMonth(2).withYear(200);
            System.out.println(localDateTime);

            System.out.println(Duration.ofHours(2134).toMinutes());
            System.out.println(Duration.between(LocalDateTime.now(),LocalDateTime.now().minusMonths(12)).toDays());
            System.out.println(Duration.between(LocalDateTime.now(),LocalDateTime.now().minusMonths(12)));
            System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(-9)).getDays());
        }
    }

