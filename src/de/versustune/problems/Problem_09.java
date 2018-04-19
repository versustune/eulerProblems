package de.versustune.problems;

import de.versustune.Utils;

public class Problem_09 implements Problems {
    public void execute() {
        int sum = 1000;
        int product = 0;
        for (int a = 1; a < sum / 3; a++) {
            for (int b = a; b <= sum / 2; b++) {
                int c = sum - a - b;
                if (c > 0 && (a * a + b * b == c * c)) {
                    product = a * b * c;
                }
            }
        }
        Utils.sumText(product, "Problem_09");
    }
}
