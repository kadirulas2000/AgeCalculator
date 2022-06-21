package com.example.agecalculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class Calculator {

    int year = 2021;
    int month = 11;
    int day = 30;

    LocalDate localDate1 = LocalDate.of(2021, 11, 30);
    LocalDate localDate2 = LocalDate.now();
    LocalDate localDateNow = LocalDate.now();

    Period period = Period.between(localDate1, localDateNow);

    long yearInYear = ChronoUnit.YEARS.between(localDate1, localDateNow);

    long monthsInYear = ChronoUnit.MONTHS.between(localDate1, localDateNow);

    long weeksInYear = ChronoUnit.WEEKS.between(localDate1, localDateNow);

    long daysInYear = ChronoUnit.DAYS.between(localDate1, localDateNow);


}

