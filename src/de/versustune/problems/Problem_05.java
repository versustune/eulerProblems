package de.versustune.problems;

import de.versustune.Utils;

public class Problem_05 implements Problems{
    public static void execute() {
        Utils.startText("smallest Multiple started...");

        byte i;
        long s = 1, p;
        final byte P[] = new byte[]{2, 3, 5, 7, 11, 13, 17, 19}, N = 20;

        for (i = 0; i < P.length; i++) {
            p = 1;
            while (p * P[i] < N)
                p *= P[i];
            s *= p;
        }
        Utils.sumText(s);
    }
}
