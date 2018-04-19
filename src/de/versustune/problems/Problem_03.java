package de.versustune.problems;

import de.versustune.Utils;

public class Problem_03 implements Problems{

    public void execute() {
        long number = 600851475143L;

        long highestPrime = 0; // init
        long i = 2;
        while (i <= number) {
            if (number % i == 0) {
                highestPrime = i;
                number /= i;
                --i;
            }
            ++i;
        }

        Utils.sumText(highestPrime, "Problem_03");
    }
}
