package de.versustune.problems;

import de.versustune.Utils;

public class Problem_06 implements Problems{
    public void execute() {
        long sum = 0;
        long square = 0;
        int i = 1;
        while (i <= 100) {
            sum += i * i;
            square += i;
            i++;
        }
        square = square * square;

        long diff = square - sum;
        Utils.sumText(diff, "Problem_06");
    }
}
