package view;

import domain.Score;

public class OutputView {
    private static final String STRIKE = "스트라이크";
    private static final String BALL = "볼";
    private static final String NOTHING = "낫싱";
    private static final String SPACE = " ";
    private static final int ZERO = 0;

    private OutputView() {
    }

    public static void printScore(Score score) {
        if (score.getStrike() == ZERO && score.getBall() == ZERO) {
            printMessage(NOTHING);
        }
        String message = getBallMessage(score) + getStrikeMessage(score);
        printMessageAndNewLine(message);
    }

    private static String getBallMessage(Score score) {
        String message = "";
        if (score.getBall() > 0) {
            message += score.getBall() + BALL + SPACE;
        }
        return message;
    }

    private static String getStrikeMessage(Score score) {
        String message = "";
        if (score.getStrike() > 0) {
            message += score.getStrike() + STRIKE;
        }
        return message;
    }

    public static void printMessage(String message) {
        System.out.print(message);
    }

    public static void printMessageAndNewLine(String message) {
        System.out.println(message);
    }
}
