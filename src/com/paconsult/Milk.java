package com.paconsult;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Milk extends Product {
    private boolean isLongLasting;
    private Date date;

    public Milk(String name, int quantity, Date date) {
        super(name, quantity);
        this.date = date;
        this.isLongLasting = isLongLasting();
    }

    private boolean isLongLasting() {
        return this.date.getYear() != null;
    }

    @Override
    public boolean isExpired() {
        List<Integer> currentDate = Date.getCurrentDate();
        int result = this.date.compareTo(new Date(
                currentDate.get(2),
                currentDate.get(1),
                currentDate.get(0)
        ));
        return result == -1;
    }
}
