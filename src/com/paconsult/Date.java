package com.paconsult;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Date {
    private int day;
    private int month;
    private Integer year;

    public Date(int day, int month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int compareTo(Date date) {
        if (this.year < date.getYear()) {
            return -1;
        } else if (this.year > date.getYear()) {
            return 1;
        } else {
            if (this.month < date.getMonth()) {
                return -1;
            } else if (this.month > date.getMonth()) {
                return 1;
            } else {
                if(this.day < date.getDay()) {
                    return -1;
                } else if (this.day > date.getDay()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    public static List<Integer> getCurrentDate() {
        List<String> currentDateList = Arrays.asList(LocalDate.now().toString().split("-"));
        return Arrays.asList(
                Integer.parseInt(currentDateList.get(2)),
                Integer.parseInt(currentDateList.get(1)),
                Integer.parseInt(currentDateList.get(0))
        );
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
