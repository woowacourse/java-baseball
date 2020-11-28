package baseball.domain;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import baseball.BaseballGame;

public final class Validator {

    public static final String INPUT_NULL_MESSAGE = "null 값을 입력하셨습니다!";

    public static final String INPUT_EMPTY_MESSAGE = "빈 값을 입력하셨습니다!";

    public static final String INVALID_VALUE_MESSAGE = "잘못된 값을 입력하셨습니다!";

    public static final String DUPLICATE_NUMBER_MESSAGE = "중복된 값이 입력되었습니다!";

    public static final String EMPTY = "";

    public static final Pattern NUMBERS_PATTERN =
            Pattern.compile(String.format("[1-9]{%d}", BaseballGame.BALLS_LENGTH));

    public static final Pattern RETRY_PATTERN = Pattern.compile("^1$|^2$");

    public void validateNumbers(final Pattern pattern, final String input) {
        checkNull(input);
        checkBlank(input);
        checkRegularExpression(pattern, input);
        checkDuplicateNumber(input);
    }

    private void checkNull(final String input) {
        if (Objects.isNull(input)) {
            throw new IllegalArgumentException(INPUT_NULL_MESSAGE);
        }
    }

    private void checkBlank(final String input) {
        if (input.trim().equals(EMPTY)) {
            throw new IllegalArgumentException(INPUT_EMPTY_MESSAGE);
        }
    }

    private void checkRegularExpression(final Pattern pattern, final String input) {
        final Matcher matcher = pattern.matcher(input);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(INVALID_VALUE_MESSAGE);
        }
    }

    private void checkDuplicateNumber(final String input) {
        final int deduplicatedNumbersLength = (int) input.chars().distinct().count();
        if (deduplicatedNumbersLength != BaseballGame.BALLS_LENGTH) {
            throw new IllegalArgumentException(DUPLICATE_NUMBER_MESSAGE);
        }
    }
}
