package view;

public class OutputView {
    private static final int MIN_COUNT = 0;
    private static final String STRIKE_MESSAGE = "%d스트라이크\n";
    private static final String BALL_MESSAGE = "%d볼\n";
    private static final String STRIKE_BALL_MESSAGE = "%d스트라이크 %d볼\n";
    private static final String NOTHING_MESSAGE = "낫싱";
    private static final String CORRECT_ANSWER_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String RESTART_OR_END_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";

    public static void printStrikeBall(int strikeCount, int ballCount) {
        if(strikeCount > MIN_COUNT && ballCount == MIN_COUNT) {
            System.out.printf(STRIKE_MESSAGE, strikeCount);
        }
        if(strikeCount == MIN_COUNT && ballCount > MIN_COUNT) {
            System.out.printf(BALL_MESSAGE, ballCount);
        }
        if(strikeCount > MIN_COUNT && ballCount > MIN_COUNT) {
            System.out.printf(STRIKE_BALL_MESSAGE, strikeCount, ballCount);
        }
    }

    public static void printNothing() {
        System.out.println(NOTHING_MESSAGE);
    }

    public static void printCorrectAnswer() {
        System.out.println(CORRECT_ANSWER_MESSAGE);
    }

    public static void printRestartEnd() {
        System.out.println(RESTART_OR_END_MESSAGE);
    }

    public static void printInputMessage() {
        System.out.print(INPUT_NUMBER_MESSAGE);
    }

}
