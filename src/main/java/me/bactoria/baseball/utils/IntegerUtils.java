package me.bactoria.baseball.utils;

public class IntegerUtils {

    public static boolean containZero(int num) {
        boolean result = false;
        int[] numArray = toArray(num);

        for (int n : numArray) {
            if (n == 0) {
                result = true;
                break;
            }
        }

        return result;
    }

    public static int[] toArray(int num) {
        int numLength = getLength(num);
        int[] numbers = new int[numLength];

        for (int i = 0; i < numLength; i++) {
            numbers[i] = num % 10;
            num /= 10;
        }
        return numbers;
    }

    public static boolean isNthDigitsNumber(int num, int digit) {
        return getLength(num) == digit;
    }

    public static boolean isEachDigitUnique(int num) {
        boolean[] visited = new boolean[10];

        while (num > 0) {
            int n = num % 10;
            if (visited[n]) return false;
            else visited[n] = true;
            num /= 10;
        }
        return true;
    }

    private static int getLength(int num) {
        return (int) Math.log10(num) + 1;
    }
}
