package com.ClassExercise;
//Write an application that will read from the user the date of your next SDA classes and
//calculate how many days are left to them.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Task17 {

    public static void main(String[] args) {
        System.out.println(" Enter in  following format : dd/MM/yyyy");
        Scanner input = new Scanner(System.in);
        String regDate=input.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
        LocalDate userDate = LocalDate.parse(regDate, dtf);
        LocalDate targetDate = userDate.withDayOfMonth(20).withMonth(8).plusYears(0);
        System.out.println("User's date: " + regDate);
        System.out.println("Target date: " + targetDate.format(dtf));
        Period period = Period.between( targetDate,userDate);
        System.out.printf("Days left: %d days %d months %d years%n", period.getDays(), period.getMonths(),
                period.getYears());
        System.out.println("The difference in terms of days: " + ChronoUnit.DAYS.between( targetDate,userDate));


    }
}
