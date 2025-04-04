package com.bridgelabz.basicProblems;

public class Division {
    public int divide(int a, int b) {
        if(b==0){
            throw new ArithmeticException("Divisibility by zero not possible");
        }
        return a/b;

    }
}
