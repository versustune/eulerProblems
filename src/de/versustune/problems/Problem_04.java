package de.versustune.problems;

import de.versustune.Palindrome;
import de.versustune.Utils;

public class Problem_04 implements Problems{
    public static void execute() {
        Utils.startText("largest Palindrome Product started...", "=");
        Palindrome palindrome = new Palindrome();
        long biggestPalindrom = 0;
        int factorA = 0;
        int factorB = 0;
        int a = 999, b = 999;
        for (int bb = b; bb > 0; bb--) {
            for (int aa = a; aa > 0; aa--) {
                if (palindrome.is(Long.toString(aa * bb))) {
                    if (aa * bb > biggestPalindrom) {
                        biggestPalindrom = aa * bb;
                        factorA = aa;
                        factorB = bb;
                        break;
                    }
                }
            }
        }
        Utils.infoText("Faktor A => " + factorA);
        Utils.infoText("Faktor B => " + factorB);
        Utils.sumText(biggestPalindrom);
    }
}
