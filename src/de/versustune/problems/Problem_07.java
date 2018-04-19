package de.versustune.problems;

import de.versustune.Utils;

public class Problem_07 implements Problems{
    public void execute() {
        long iterator = 0;
        long prime = 0;

        while (prime < (long) 10001) {
            iterator++;
            if (Utils.isPrime(iterator)) {
                prime++;
            }
        }
        Utils.sumText(iterator, "Problem_07");
    }
}
