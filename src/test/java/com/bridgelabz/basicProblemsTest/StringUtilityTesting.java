package com.bridgelabz.basicProblemsTest;

import com.bridgelabz.basicProblems.StringUtilityClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilityTesting {
    StringUtilityClass str;

    @BeforeEach
    void setUp(){
        str=new StringUtilityClass();
    }

    @Test
    public void shouldReverseString(){
        Assertions.assertEquals("olleH", str.reverseString("Hello"));
        Assertions.assertEquals("", str.reverseString(""));
        Assertions.assertEquals("race", str.reverseString("cear"));
    }


    @Test
    public void shouldcheckPalindrome(){
        Assertions.assertEquals("racecar", str.isPalindrome("racecar"));
        Assertions.assertEquals("aynas", str.isPalindrome("sanya"));
    }

    @Test
    public void shouldConvertToUppercase(){
        Assertions.assertEquals("SANYA", str.toUpperCase("sanya"));
        Assertions.assertEquals("", str.toUpperCase(""));
    }
}
