package de.versustune.problems;

import de.versustune.Utils;

public class Problem_02 implements Problems{
    public void execute() {
        int x = 0, y = 1, z = x + y, sumEven = 0;

        while (z < 4000000) {
            x = y;
            y = z;
            z = x + y;
            if (z % 2 == 0) {
                sumEven += z;
            }
        }

        Utils.sumText(sumEven, "Problem_02");
    }
}
