package de.versustune.problems;

import de.versustune.Utils;

public class Problem_01 implements Problems{
    public void execute() {
        int sum = 0;
        for (int temp = 0; temp < 1000; temp++) {
            if (temp % 3 == 0 || temp % 5 == 0) {
                sum += temp;
            }
        }

        Utils.sumText(sum, "Problem_01");
    }
}
