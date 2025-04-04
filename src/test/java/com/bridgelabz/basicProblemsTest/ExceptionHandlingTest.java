package com.bridgelabz.basicProblemsTest;

import com.bridgelabz.basicProblems.Calculator;
import com.bridgelabz.basicProblems.Division;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {
    private Division div;

    @BeforeEach
    void setUp(){
        div=new Division();
    }

    @Test
    public void shouldThrowExceptionOnDivisionByZero(){
        Assertions.assertEquals(8, div.divide(24, 3));
        Assertions.assertThrows(ArithmeticException.class, ()-> div.divide(5,0), "Arithmetic Exception when divided by 0");
    }
}
