package de.versustune;

import de.versustune.problems.*;


public class Main {

    public static void main(String[] args) {
        Utils.setUnderlineFormat("-");
        Utils.startLogo();

        Problems[] threadRunner = new Problems[4];
        threadRunner[0] = new Problem_01();
        threadRunner[1] = new Problem_02();
        threadRunner[2] = new Problem_03();
        threadRunner[3] = new Problem_04();
        new Thread(new Runner(threadRunner)).start();
        threadRunner = new Problems[4];
        threadRunner[0] = new Problem_05();
        threadRunner[1] = new Problem_06();
        threadRunner[2] = new Problem_07();
        threadRunner[3] = new Problem_08();
        new Thread(new Runner(threadRunner)).start();
        threadRunner = new Problems[2];
        threadRunner[0] = new Problem_09();
        threadRunner[1] = new Problem_10();
        new Thread(new Runner(threadRunner)).start();
    }
}
