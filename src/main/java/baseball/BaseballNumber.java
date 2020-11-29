package baseball;

import utils.RandomUtils;

import java.util.*;

public class BaseballNumber {

    private List<String> numbers;

    public BaseballNumber(String playerBallNumber) {
        validateInput(playerBallNumber);
        String[] playerBallSplitNumber = playerBallNumber.split("");
        List<String> playerBallSplitNumberList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            playerBallSplitNumberList.add(playerBallSplitNumber[i]);
        }
        this.numbers = playerBallSplitNumberList;
    }

    public BaseballNumber() {
        Set<String> set = new HashSet<>();
        while (set.size() < 3) {
            set.add(String.valueOf(RandomUtils.nextInt(1, 9)));
        }
        this.numbers = new ArrayList<>(set);
    }

    public List<String> getNumbers() {
        return this.numbers;
    }

    private void validateInput(String playerBallNumber) {
        if (playerBallNumber.length() != 3) {
            throw new IllegalArgumentException("3자리 숫자를 입력해 주세요.");
        }
    }
}
