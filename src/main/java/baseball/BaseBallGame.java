package baseball;

import java.util.Scanner;

public class BaseBallGame {

    private static final String CONTINUE = "1";
    private static final String QUIT = "2";

    private final Scanner scanner;

    public BaseBallGame(Scanner scanner) {
        this.scanner = scanner;
    }

    public void play() {
        do {
            singleGame();
        } while (continueGame());
    }

    private void singleGame() {
        Balls botBalls;
        GameResult gameResult;
        botBalls = Balls.generateRandomBalls();                 // 랜덤 생성 수
        do {
            printInputMessage();
            gameResult = GameResult.judgeResult(
                    generateUserBalls(), botBalls);             // 사용자 수 입력 & 결과 계산
            printResult(gameResult);                            // 결과 출력
        } while (!gameResult.isAllStrikes());                   // 3스트라이크: 루프탈출
    }

    private Balls generateUserBalls() {
        Balls userBalls = null;
        while (userBalls == null) {
            try {
                userBalls = Balls.stringToBalls(getInputString());  // 사용자 생성 balls
            } catch (NumberFormatException e) {
                printFormatExceptionMessage();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return userBalls;
    }

    private Boolean continueGame() {
        String input = "";

        while (invalidInput(input)) {
            printChoiceRestartMessage();
            input = getInputString();
        }

        printChoiceRestartExceptionMessage();
        return input.equals(CONTINUE);
    }


    private void printResult(GameResult gameResult) {
        System.out.println(gameResult.getResultMessage());
    }

    private boolean invalidInput(String input) {
        return !input.equals(CONTINUE) && !input.equals(QUIT);
    }

    private void printInputMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    private void printFormatExceptionMessage() {
        System.out.printf("%d개의 1~9 사이의 수만 입력할 수 있습니다.%n", Balls.COUNT_OF_BALLS);
    }

    private void printChoiceRestartExceptionMessage() {
        System.out.println("1, 2만 입력 가능합니다. 다시 입력해주세요.");
    }

    private void printChoiceRestartMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    private String getInputString() {
        return scanner.nextLine();
    }
}