package com.example.lab1patterns;

import org.springframework.stereotype.Component;

@Component
public class RaisePowerAction {

    public int calculate(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
