package baseball;

import java.util.Scanner;

public class Application {
    final static int TARGET_LENGTH = 3;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행

        int[] target = setTarget();
        int[] inputNumber = new int[TARGET_LENGTH];
        int[] result = new int[2];
        boolean loop = false;
        boolean noError = false;

        System.out.print(target[0]);
        System.out.print(target[1]);
        System.out.println(target[2]);

        while (!loop) {
            try {
                inputNumber = getInputNumber(scanner);
                noError = true;
            } catch (IllegalArgumentException e) {
                System.out.println("오류 : 0을 제외한 서로 다른 3자리 숫자만 입력 가능!");
                noError = false;
            }

            if (noError) {
                result = compare(target, inputNumber);
                loop = outputResult(result);
            }
        }

    }

    public static int[] setTarget() {
        int[] target = new int[TARGET_LENGTH];
        int i = 0;
        while (i < TARGET_LENGTH) {
            int temp = utils.RandomUtils.nextInt(1, 9);
            int sameNumber = isThereNumber(target, temp);
            if (sameNumber == 0) {
                target[i] = temp;
                i++;
            }
        }

        return target;
    }

    public static int[] getInputNumber(Scanner scanner) throws IllegalArgumentException {
        int[] inputNumber = new int[TARGET_LENGTH];
        System.out.print("숫자를 입력해주세요 : ");
        String input = scanner.next();

        if (input.length() != TARGET_LENGTH) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < TARGET_LENGTH; i++) {
            String temp = input.substring(i, i + 1);
            inputNumber[i] = Integer.parseInt(temp);
            if (inputNumber[i] == 0) {
                throw new IllegalArgumentException();
            }
        }

        for (int i = 0; i < TARGET_LENGTH; i++) {
            int temp = isThereNumber(inputNumber, inputNumber[i]);
            if (temp > 1) {
                throw new IllegalArgumentException();
            }
        }

        return inputNumber;
    }

    public static int[] compare(int[] target, int[] inputNumber) {
        int[] compareResult = new int[2];
        int ballAndStrike = 0;
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < TARGET_LENGTH; i++) {
            int temp = isThereNumber(target, inputNumber[i]);
            ballAndStrike = ballAndStrike + temp;
        }

        for (int i = 0; i < TARGET_LENGTH; i++) {
            if (target[i] == inputNumber[i]) {
                strike++;
            }
        }

        ball = ballAndStrike - strike;

        compareResult[0] = ball;
        compareResult[1] = strike;

        return compareResult;
    }

    public static int isThereNumber(int[] target, int anInputNumber) {
        int result = 0;
        for (int i = 0; i < TARGET_LENGTH; i++) {
            if (target[i] == anInputNumber) {
                result++;
            }
        }
        return result;
    }

    public static boolean outputResult(int[] result) {
        boolean endGame = false;

        if(result[0] != 0){
            System.out.print(result[0] + "볼 ");
        }

        if(result[1] != 0){
            System.out.print(result[1] + "스트라이크");
        }

        if(result[0] == 0 && result[1] == 0){
            System.out.print("낫싱");
        }

        System.out.println();

        if (result[1] == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            endGame = true;
        }
        return endGame;
    }
}
