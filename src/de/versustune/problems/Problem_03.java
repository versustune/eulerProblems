package de.versustune.problems;

import de.versustune.Utils;

public class Problem_03 implements Problems{

    public static void execute() {
        Utils.startText("largest Prime Number started...");
        long number = 600851475143L;

        long highestPrime = -1;
        for (long i = 2; i <= number; ++i) {
            if (number % i == 0) {
                highestPrime = i;
                number /= i;
                --i;
            }
        }

        Utils.sumText(highestPrime);
    }
}
