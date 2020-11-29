package baseball;

import utils.RandomUtils;
import java.util.*;

public class RandomBaseballNumbersGenerator {
    private final static int BASEBALL_NUMBER_LENGTH = 3;
    private final static int BASEBALL_NUMBER_MINIMUM = 1;
    private final static int BASEBALL_NUMBER_MAXIMUM = 9;

    public static BaseballNumbers generate() {
        return generateNewBaseballNumbers();
    }

    private static BaseballNumbers generateNewBaseballNumbers() {
        Set<Integer> baseballNumbers = getBaseballNumbers();
        BaseballNumbers newBaseballNumbers = BaseballNumbers.getEmptyBaseballNumbers();

        baseballNumbers.forEach(
                newBaseballNumbers::add
        );

        return newBaseballNumbers;
    }

    private static Set<Integer> getBaseballNumbers() {
        Set<Integer> baseballNumbers = new HashSet<>();

        while(baseballNumbers.size() < BASEBALL_NUMBER_LENGTH) {
            int randomNumber = RandomUtils.nextInt(BASEBALL_NUMBER_MINIMUM,
                    BASEBALL_NUMBER_MAXIMUM);

            baseballNumbers.add(randomNumber);
        }

        return baseballNumbers;
    }
}
