package com.bridgelabz.basicProblemsTest;

import com.bridgelabz.basicProblems.EvenNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;

public class EvenNumbersTest {
    EvenNumbers num;

    @BeforeEach
    void setUp(){
        num=new EvenNumbers();
    }

    @ParameterizedTest
    @ValueSource(ints= {2, 4, 8})
    public void shouldBeEven(int n){
        Assertions.assertTrue(num.isEven(n));
    }

    @ParameterizedTest
    @ValueSource(ints= {1, 15, 5})
    public void shouldNotBeEven(int n){
        Assertions.assertFalse(num.isEven(n));
    }

}
