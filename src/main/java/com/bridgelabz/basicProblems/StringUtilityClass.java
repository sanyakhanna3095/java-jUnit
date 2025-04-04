package com.bridgelabz.basicProblems;



public class StringUtilityClass {

    public String reverseString(String s) {
        if(s==null){
            return null;
        }

        return new StringBuilder(s).reverse().toString();
    }

    public boolean isPalindrome(String s) {
        if(s==null){
            return false;
        }
        String rev = reverseString(s);
        return s.equalsIgnoreCase(rev);
    }

    public String toUpperCase(String s) {
        if (s == null) {
            return null;
        }
        return s.toUpperCase();
    }
}
