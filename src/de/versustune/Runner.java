package de.versustune;

import de.versustune.problems.Problems;

public class Runner implements Runnable {

    private Problems[] problems;
    Runner(Problems[] threadRunner) {
        problems = threadRunner;
    }

    @Override
    public void run() {
        if(problems.length < 2) {
            problems[0].execute();
            return;
        }
        for (Problems problem : problems) {
            problem.execute();
        }
    }
}
