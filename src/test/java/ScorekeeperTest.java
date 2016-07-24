import Scorekeeper.Scorekeeper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gfaust on 24.07.2016.
 */
public class ScorekeeperTest {
    private Scorekeeper scorekeeper;

    @Before
    public void init() {
        scorekeeper = new Scorekeeper();
    }

    @Test
    public void initialScoreIs0To0() {
        int expectedScoreTeamA = 0;
        int expectedScoreTeamB = 0;
        assertScore(expectedScoreTeamA, expectedScoreTeamB);
    }

    @Test
    public void teamAScores1Point() {
        scorekeeper.teamAClicked();
        scorekeeper.score1Clicked();
        assertScore(1, 0);
    }

    @Test
    public void teamBScores1Point() {
        scorekeeper.teamBClicked();
        scorekeeper.score1Clicked();
        assertScore(0, 1);
    }

    @Test
    public void teamBScores2Points() {
        scorekeeper.teamBClicked();
        scorekeeper.score2Clicked();
        assertScore(0, 2);
    }

    @Test
    public void clickOnlyTeamButtonDoesNotRaiseScore() {
        scorekeeper.teamAClicked();
        assertScore(0, 0);
    }

    @Test
    public void teamBScoresAfterTeamA() {
        scorekeeper.teamAClicked();
        scorekeeper.score1Clicked();
        scorekeeper.teamBClicked();
        scorekeeper.score1Clicked();
        assertScore(1, 1);
    }

    @Test
    public void teamBScores3PointsAfterTeamAScores2Points() {
        scorekeeper.teamAClicked();
        scorekeeper.score2Clicked();
        scorekeeper.teamBClicked();
        scorekeeper.score3Clicked();
        assertScore(2, 3);
    }

    private void assertScore(int expectedScoreTeamA, int expectedScoreTeamB) {
        Assert.assertEquals("score team A", expectedScoreTeamA, scorekeeper.getScore().getA());
        Assert.assertEquals("score team B", expectedScoreTeamB, scorekeeper.getScore().getB());
    }
}
