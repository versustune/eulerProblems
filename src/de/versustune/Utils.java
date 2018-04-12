package de.versustune;

public class Utils {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static String underlineFormat;

    static void setUnderlineFormat(String s) {
        Utils.underlineFormat = s;
    }

    public static boolean isPrime(long num) {
        if (num < 2) return false;
        else if (num == 2) return true;
        for (int i = 2; i < Math.pow(num, 0.5) + 1; i++)
            if (num % i == 0)
                return false;
        return true;
    }

    public static void startText(String s) {
        System.out.println(Utils.ANSI_GREEN + s + Utils.ANSI_RESET);
        StringBuilder underline = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            underline.append(Utils.underlineFormat);
        }
        System.out.println(Utils.ANSI_GREEN + underline + Utils.ANSI_RESET);
    }

    public static void infoText(String s) {
        System.out.println(Utils.ANSI_BLUE + s + Utils.ANSI_RESET);
    }

    public static void sumText(int s) {
        System.out.println(Utils.ANSI_PURPLE + "[Ergebnis] " + s + Utils.ANSI_RESET + "\n");
    }

    public static void sumText(long s) {
        System.out.println(Utils.ANSI_PURPLE + "[Ergebnis] " + s + Utils.ANSI_RESET + "\n");
    }

    static void errorText(String s) {
        System.out.println(Utils.ANSI_RED + "[Error] " + s + Utils.ANSI_RESET);
    }

    static void startLogo() {
        String s = "__Project Euler__";
        String underlineFormat = "==";
        StringBuilder underline = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            underline.append(underlineFormat);
        }
        int centerLength = (underline.length() - s.length()) / 2;

        StringBuilder prepareCenter = new StringBuilder();
        for (int i = 0; i < centerLength; i++) {
            prepareCenter.append(" ");
        }
        System.out.println(Utils.ANSI_GREEN + underline + Utils.ANSI_RESET);
        System.out.println(Utils.ANSI_RED + prepareCenter + s + prepareCenter + Utils.ANSI_RESET);
        System.out.println(Utils.ANSI_GREEN + underline + Utils.ANSI_RESET);
        System.out.println(prepareCenter.substring(0, 3) + "Copyright © VersusTune 2018!");
        System.out.println("\n");
    }
}

