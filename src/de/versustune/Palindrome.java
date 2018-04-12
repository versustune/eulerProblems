package de.versustune;

public class Palindrome {
    public boolean is(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
