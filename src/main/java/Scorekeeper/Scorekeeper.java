package Scorekeeper;

/**
 * Created by gfaust on 24.07.2016.
 */
public class Scorekeeper {

    private Team selectedTeam = Team.NONE;
    private Score score = new Score(0, 0);

    public void teamAClicked() {
        selectedTeam = Team.A;
    }

    public void score1Clicked() {
        score(1);
    }

    public void score2Clicked() {
        score(2);
    }

    public void teamBClicked() {
        selectedTeam = Team.B;
    }

    private void score(int points) {
        score = selectedTeam.scorePointOn(points, score);
        selectedTeam = Team.NONE;
    }

    public Score getScore() {
        return score;
    }

    public void score3Clicked() {
        score(3);
    }
}
