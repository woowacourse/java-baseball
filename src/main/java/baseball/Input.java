package baseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Input {
    private static final String ABNORMAL_INPUT = "비정상적인 입력입니다.";
    private static final int NUMBER_INPUT_LENGTH = 3;
    private static final int ZERO = 0;
    private static final int DIVIDING_NUMBER = 10;

    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public Balls enterNumberInput() {
        int input = ZERO;

        try {
            input = scanner.nextInt();
        } catch (Exception e) {
            throw new IllegalArgumentException(ABNORMAL_INPUT);
        }

        validateLength(input, NUMBER_INPUT_LENGTH);

        return makeBallsFrom(input);
    }

    private Balls makeBallsFrom(int input) {
        List<BallNumber> balls = divideOneIntoThree(input).stream()
            .map(BallNumber::new)
            .collect(Collectors.toList());

        return new Balls(balls);
    }

    private List<Integer> divideOneIntoThree(int input) {
        List<Integer> numbers = new ArrayList<>();
        while (input != ZERO) {
            numbers.add(input % DIVIDING_NUMBER);
            input /= DIVIDING_NUMBER;
        }
        Collections.reverse(numbers);
        return numbers;
    }

    private void validateLength(int input, int length) {
        if (getNumberInputLength(input) != length) {
            throw new IllegalArgumentException(ABNORMAL_INPUT);
        }
    }

    private int getNumberInputLength(int input) {
        return (int) (Math.log10(input) + 1);
    }
}
