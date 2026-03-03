package com.ironhack.demo.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class EarlyBirdDiscountService {

    public static String discountcalculator(LocalDate eventDate, LocalDate bookingDate){
        long daysBetween = ChronoUnit.DAYS.between(bookingDate, eventDate);
        if (daysBetween>=30) {return"15% discount applied";
        }

return "no discount applied";
    }
}
