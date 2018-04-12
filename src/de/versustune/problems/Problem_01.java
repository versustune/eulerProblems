package de.versustune.problems;

import de.versustune.Utils;

public class Problem_01 implements Problems{
    public static void execute() {
        Utils.startText("Multiple of 3 and 5 started...");
        int sum = 0;
        for (int temp = 0; temp < 1000; temp++) {
            if (temp % 3 == 0 || temp % 5 == 0) {
                sum += temp;
            }
        }

        Utils.sumText(sum);
    }
}
