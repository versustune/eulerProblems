package de.versustune;

public class Palindrome {
    public boolean is(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static int reverseNumber(int number) {

        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number = number / 10;
        }
        return reverse;
    }
}