package utils;

import java.util.HashSet;
import java.util.Set;

public class InputValidator {
    private static final int FIRST_INDEX = 0;
    private static final int NUMBERS_LENGTH = 3;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;

    private static final String NUMBER_LENGTH_ERROR = "3자리 숫자를 입력해주세요.";
    private static final String NUMBER_RANGE_ERROR = "1~9의 숫자를 입력해주세요.";
    private static final String NUMBER_DUPLICATE_ERROR = "서로 다른 숫자를 입력해주세요.";


    private static Set<Character> duplicateCheckSet;

    private InputValidator() {
    }


    public static void validateNumbers(String numbers) {
        validateLength(numbers);
        validateRange(numbers);
        duplicateCheckNumbers(numbers);
    }


    private static void validateLength(String numbers) {
        if(numbers.length() > NUMBERS_LENGTH) {
            throw new IllegalArgumentException(NUMBER_LENGTH_ERROR);
        }

    }

    private static void validateRange(String numbers) {
        for(int i=FIRST_INDEX; i < NUMBERS_LENGTH; i++) {
            int number = Character.getNumericValue(numbers.charAt(i));
            if(number < MIN_NUMBER || number > MAX_NUMBER) {
                throw new IllegalArgumentException(NUMBER_RANGE_ERROR);
            }
        }
    }

    private static void duplicateCheckNumbers(String numbers) {
        duplicateCheckSet = new HashSet<>();
        for(int i=FIRST_INDEX; i < NUMBERS_LENGTH; i++) {
            duplicateCheckSet.add(numbers.charAt(i));
        }
        if(duplicateCheckSet.size() != NUMBERS_LENGTH) {
            throw new IllegalArgumentException(NUMBER_DUPLICATE_ERROR);
        }
    }


}
