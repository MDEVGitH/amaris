package com.manuel.amaris.models;

import java.math.BigDecimal;

public class AnualSalaryEmployee {

    public static BigDecimal getAnualSalary(BigDecimal salary){
        return salary.multiply(BigDecimal.valueOf(12));
    }
}
