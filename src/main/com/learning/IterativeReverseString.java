package com.learning;

public class IterativeReverseString {

    public String reverse(String stringToReverse) {
        // abcd = dcba
        // abcde = edcba

//        stringToReverse.ch

        return new StringBuilder(stringToReverse).reverse().toString();
    }
}
