package baseball;

import utils.RandomUtils;
import utils.InputCheckUtils;

import static baseball.Config.*;
import static utils.TextResource.STATEMENT_NOT_VALID_INPUT;

public class BaseBallGameController {
    private Player currentPlayer;
    private BaseBallGame currentGame = null;

    public BaseBallGameController(Player player) {
        this.currentPlayer = player;
    }

    public void startGame() throws IllegalArgumentException {
        BaseBallGameNumber answer = new BaseBallGameNumber(makeRandomNumber());
        currentGame = new BaseBallGame(answer);
        while (true) {
            try {
                BaseBallGameNumber inputNumber = new BaseBallGameNumber(currentPlayer.inputNumber());
                boolean isAnswer = currentGame.checkInputNumber(inputNumber.getNumber());
                if (isAnswer) {
                    checkRestart(currentPlayer.askRestart());
                    break;
                }
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println(STATEMENT_NOT_VALID_INPUT);
            }
        }
    }

    private void checkRestart(boolean restart) {
        if (restart) {
            startGame();
        }
    }

    private String makeRandomNumber() {
        StringBuilder randomNumber = new StringBuilder();
        while (true) {
            String num = Integer.toString(RandomUtils.nextInt(START_INCLUSIVE_NUM, END_INCLUSIVE_NUM));
            if (randomNumber.toString().contains(num)) {
                continue;
            }
            randomNumber.append(num);
            if (randomNumber.length() == NUMBER_OF_DIGITS) {
                return randomNumber.toString();
            }
        }
    }
}
