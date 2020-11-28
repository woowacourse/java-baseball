package baseball.domain.game;

import baseball.domain.number.BaseballNumbers;

public class BaseballGameMachine {

    private final BaseballNumbers baseballNumbers;

    public BaseballGameMachine(BaseballNumbers baseballNumbers) {
        this.baseballNumbers = baseballNumbers;
    }

    public GameResult play(BaseballNumbers targetBaseballNumbers) {
        int ballCounts = this.baseballNumbers.calculateBallCounts(targetBaseballNumbers);
        int strikeCounts = this.baseballNumbers.calculateStrikeCounts(targetBaseballNumbers);
        return new GameResult(ballCounts, strikeCounts);
    }

    public BaseballGameMachine prepareNextTry(GameState gameState) {
        if (!gameState.isAbleToPlay()) {
            throw new IllegalArgumentException();
        }
        if (gameState.isRestart()) {
            return new BaseballGameMachine(BaseballNumbers.generateRandomBaseballNumbers());
        }
        return this;
    }
}
