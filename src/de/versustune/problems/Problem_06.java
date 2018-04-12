package de.versustune.problems;

import de.versustune.Utils;

public class Problem_06 implements Problems{
    public static void execute() {
        Utils.startText("sum Square Difference started...", "=");
        long sum = 0;
        long square = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
            square += i;
        }
        square = square * square;

        long diff = square - sum;
        Utils.sumText(diff);
    }
}
