package baseball;

import static baseball.Balls.COUNT_OF_BALLS;

/**
 * 게임의 결과에 대한 정보를 가진 객체: 결과를 계산, 출력
 */
public class GameResult {

    private static final String STRIKE = "스트라이크";
    private static final String BALL = "볼";
    private static final String NOTHING = "낫싱";

    private final Integer strike;
    private final Integer ball;

    public GameResult(Integer strike, Integer ball) {
        validateMaximum(strike, ball);
        validateRange(strike);
        validateRange(ball);
        this.strike = strike;
        this.ball = ball;
    }

    public static GameResult judgeResult(Balls balls1, Balls balls2) {
        int STRIKE = 0;
        int BALL = 0;

        for (int i = 0; i < COUNT_OF_BALLS; i++) {
            Ball myBall = balls1.get(i);

            if (myBall.equals(balls2.get(i))) {
                STRIKE++;
            } else if (balls2.contains(myBall)) {
                BALL++;
            }
        }
        return new GameResult(STRIKE, BALL);
    }

    public String getResultMessage() {
        if (isNothing()) {
            return NOTHING;
        }
        if (isOnlyStrike()) {
            return strikeMessage();
        }
        if (isOnlyBall()) {
            return ballMessage();
        }
        return ballStrikeMessage();
    }

    public boolean isAllStrikes() {
        if (strike == COUNT_OF_BALLS) {
            printGameFinishMessage();
            return true;
        }
        return false;
    }


    @Override
    public boolean equals(Object obj) {
        GameResult gameResult;
        if (obj instanceof GameResult) {
            gameResult = (GameResult) obj;
        } else {
            throw new ClassCastException(this.getClass().getName() + " 객체 끼리만 비교가 가능합니다.");
        }

        return compareStrikeAndBall(gameResult);
    }

    private void validateMaximum(Integer strike, Integer ball) {
        if (strike + ball > COUNT_OF_BALLS) {
            throw new IllegalArgumentException();
        }
    }

    private void validateRange(Integer i) {
        if (i < 0 || COUNT_OF_BALLS < i) {
            String msg = String.format("strike/ball은 0~%d 사이의 수여야 합니다.", COUNT_OF_BALLS);
            throw new IllegalArgumentException(msg);
        }
    }

    private boolean compareStrikeAndBall(GameResult gameResult) {
        return this.strike.equals(gameResult.strike) && this.ball.equals(gameResult.ball);
    }

    private String ballMessage() {
        return String.format("%d%s", ball, BALL);
    }

    private String strikeMessage() {
        return String.format("%d%s", strike, STRIKE);
    }

    private String ballStrikeMessage() {
        return String.format("%d%s %d%s", ball, BALL, strike, STRIKE);
    }

    private boolean isOnlyBall() {
        return strike == 0 && 0 < ball;
    }

    private boolean isOnlyStrike() {
        return ball == 0 && 0 < strike;
    }

    private boolean isNothing() {
        return strike == 0 && ball == 0;
    }

    private void printGameFinishMessage() {
        System.out.printf("%d개의 숫자를 모두 맞히셨습니다! 게임 종료%n", COUNT_OF_BALLS);
    }
}