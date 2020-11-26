package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import baseball.domain.ScoreBoard;

public class ScoreBoardTest {

    @Test
    @DisplayName("스트라이크가 0개일 경우 hasZeroStrike() true 반환 테스트")
    public void hasZeroStrikeTest() {
        ScoreBoard scoreBoard = new ScoreBoard();
        assertTrue(scoreBoard.hasZeroStrike());
    }

    @Test
    @DisplayName("스트라이크가 1개일 경우 hasZeroStrike() false 반환 테스트")
    public void hasOneStrikeTest() {
        ScoreBoard scoreBoard = new ScoreBoard(1, 0);
        assertFalse(scoreBoard.hasZeroStrike());
    }

    @Test
    @DisplayName("볼이 0개일 경우 hasZeroBall() true 반환 테스트")
    public void hasZeroBallTest() {
        ScoreBoard scoreBoard = new ScoreBoard();
        assertTrue(scoreBoard.hasZeroBall());
    }

    @Test
    @DisplayName("볼이 0개일 경우 hasZeroBall() false 반환 테스트")
    public void hasOneBallTest() {
        ScoreBoard scoreBoard = new ScoreBoard(0, 1);
        assertFalse(scoreBoard.hasZeroBall());
    }

    @Test
    @DisplayName("3스트라이크일 경우 isAnswer() true 반환 테스트")
    public void hasThreeStrikeAnswerTest() {
        ScoreBoard scoreBoard = new ScoreBoard(3, 0);
        assertTrue(scoreBoard.isAnswer());
    }

    @Test
    @DisplayName("2스트라이크일 경우 isAnswer() false 반환 테스트")
    public void hasTwoStrikeAnswerTest() {
        ScoreBoard scoreBoard = new ScoreBoard(2, 0);
        assertFalse(scoreBoard.isAnswer());
    }
}
