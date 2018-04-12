package de.versustune.problems;

import de.versustune.Utils;

public class Problem_10 implements Problems {
    public static void execute() {
        Utils.startText("Summation of primes started...");
        int under = 2000000;
        long sum = 0;
        for (int i = 0; i <= under; i++) {
            if(Utils.isPrime(i)) {
                sum += i;
            }
        }
        Utils.sumText(sum);
    }
}
