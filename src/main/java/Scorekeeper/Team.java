package Scorekeeper;

/**
 * Created by gfaust on 24.07.2016.
 */
enum Team {
    NONE, A, B;

    public Score scorePointOn(int points, Score score) {
        if (this == Team.A) {
            score.setA(score.getA() + points);
        }

        if (this == Team.B) {
            score.setB(score.getB() + points);
        }

        return score;
    }
}
