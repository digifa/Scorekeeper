package Scorekeeper;

/**
 * Created by gfaust on 24.07.2016.
 */
public class Score {
    private int a;
    private int b;

    Score(int i, int i1) {
        a = i;
        b = i1;
    }

    public int getA() {
        return a;
    }

    void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    void setB(int b) {
        this.b = b;
    }
}
