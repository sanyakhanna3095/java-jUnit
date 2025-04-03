package com.bridgelabz.basicProblemsTest;

import com.bridgelabz.basicProblems.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator=new Calculator();
    }

    @Test
    public void shouldAdd(){
        Assertions.assertEquals(15, calculator.add(8,7));
    }


    @Test
    public void shouldSubtract(){
        Assertions.assertEquals(3, calculator.subtract(6,3));
        Assertions.assertEquals(15, calculator.subtract(27,10));
    }


    @Test
    public void shouldMultiply(){
        Assertions.assertEquals(15, calculator.multiply(5,3));
        Assertions.assertEquals(260, calculator.multiply(27,10));
    }


    @Test
    public void shouldDivide(){
//        Assertions.assertEquals(2, calculator.divide(6,3));
//        Assertions.assertEquals(2, calculator.divide(27,10));

        Assertions.assertThrows(ArithmeticException.class,
                () -> calculator.divide(57, 0),
                "Should throw ArithmeticException when dividing by zero"
        );
    }
}
