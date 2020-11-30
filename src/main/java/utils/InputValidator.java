package utils;
import baseball.Numbers;
import baseball.PlayButton;

import java.util.Arrays;

public class InputValidator {
    private static final String INVALID_LENGTH_MSG = "잘못된 입력 길이입니다. ";
    private static final String INVALID_RANGE_MSG = "범위 외 입력입니다. ";
    private static final String INVALID_DUPLICATE_MSG = "중복이 포함된 입력입니다. ";

    private InputValidator(){}

    public static void checkValidPlayAgainBtn(String input) throws IllegalArgumentException {
        if(!isValidLength(input, PlayButton.LEN)){
            throw new IllegalArgumentException(INVALID_LENGTH_MSG);
        }

        if(!isInRange(input, PlayButton.MIN, PlayButton.MAX)){
            throw new IllegalArgumentException(INVALID_RANGE_MSG);
        }
    }

    public static void checkValidNumbers(String input, int len) throws IllegalArgumentException {
        if(!isValidLength(input, len)){
            throw new IllegalArgumentException(INVALID_LENGTH_MSG);
        }

        if(!isInRange(input, Numbers.MIN, Numbers.MAX)){
            throw new IllegalArgumentException(INVALID_RANGE_MSG);
        }

        if(!isAllDifferent(input)){
            throw new IllegalArgumentException(INVALID_DUPLICATE_MSG);
        }
    }

    private static boolean isInRange(String input, int min, int max){
        if(!isNumericString(input)){
            return false;
        }

        return Arrays.stream(input.split(""))
                .map(Integer::parseInt)
                .allMatch(x-> x >= min && x <= max);
    }

    private static boolean isValidLength(String input, int len){
        return input.length() == len;
    }

    private static boolean isNumericString(String input){
        try{
            Integer.parseInt(input);
        }catch (IllegalArgumentException IAE){
            return false;
        }
        return true;
    }

    private static boolean isAllDifferent(String input){
        return Arrays.stream(input.split(""))
                .distinct()
                .count() == input.length();
    }
}
