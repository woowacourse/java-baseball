package baseball.domain.number;

import java.util.HashMap;
import java.util.Map;

public class BaseballNumber {
    public static final int RANGE_MINIMUM = 1;
    public static final int RANGE_MAXIMUM = 9;
    private static final Map<Integer, BaseballNumber> CACHE = new HashMap<>();

    private final int baseballNumber;

    private BaseballNumber(int baseballNumber) {
        this.baseballNumber = baseballNumber;
    }

    public static BaseballNumber of(int baseballNumber) {
        validateBaseballNumberRange(baseballNumber);
        return CACHE.computeIfAbsent(baseballNumber, BaseballNumber::new);
    }

    private static void validateBaseballNumberRange(int baseballNumber) {
        if (baseballNumber < RANGE_MINIMUM || baseballNumber > RANGE_MAXIMUM) {
            throw new IllegalArgumentException();
        }
    }

    public int getBaseballNumber() {
        return this.baseballNumber;
    }
}
