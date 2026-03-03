package com.ironhack.demo.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ironhack.demo.service.EarlyBirdDiscountService;

import java.time.LocalDate;

@RestController
public class DiscountController {
    private final EarlyBirdDiscountService earlyBirdDiscountService;

    public DiscountController(EarlyBirdDiscountService earlyBirdDiscountService) {
        this.earlyBirdDiscountService = earlyBirdDiscountService;
    }

    @GetMapping("/api/discount")
    public ResponseEntity<String> getDiscount(
            @RequestParam LocalDate eventDate,
            @RequestParam LocalDate bookingDate
    ) {if (bookingDate.isAfter(eventDate)) {
        return ResponseEntity
                .badRequest()
                .body("OOPS its wronfg ");
    }
        return ResponseEntity.ok("every thing is ok");
    }
}