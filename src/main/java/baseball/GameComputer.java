package baseball;

import java.util.Scanner;
import java.util.Arrays;
import utils.RandomUtils;

public class GameComputer {
    final Scanner scanner = new Scanner(System.in);
    static String computerChoice;
    int strike;
    int ball;

    static String chooseComputerChoice(){
        int[] answer = new int[3];

        answer[0] = RandomUtils.nextInt(1,9);
        do {
            answer[1] = RandomUtils.nextInt(1,9);
        } while (answer[0] == answer[1]);
        do {
            answer[2] = RandomUtils.nextInt(1,9);
        } while (answer[0] == answer[2] || answer[1] == answer[2]);
        computerChoice = Arrays.toString(answer).replaceAll("[^0-9]","");
        return computerChoice;
    }

    static void startGame(String computerChoice) {
        int strike;
        String userChoice = GamePlayer.chooseUserChoice();
        strike = umpirePitch(computerChoice, userChoice);
        if (strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return;
        } else {
            startGame(computerChoice);
        }
    }

    static int umpirePitch(String computerChoice, String userChoice) {
        int strike = 0;
        int ball = 0;
        
        for (int i = 0; i < computerChoice.length(); i++) {
            if (computerChoice.charAt(i) == userChoice.charAt(i)) {
                strike += 1;
            }
        }

        for (int i = 0; i < userChoice.length(); i++) {
            if (calculateBall(computerChoice, userChoice.charAt(i))) {
                ball += 1;
            }
        }

        ball -= strike;
        callUmpire(strike,ball);
        return strike;
    }

    static boolean calculateBall(String computerChoice, int pitch) {
        boolean ball = false;

        for (int i = 0; i<computerChoice.length(); i++) {
            if (computerChoice.charAt(i) == pitch) {
                ball = true;
            }
        }
        return ball;
    }

    static void callUmpire(int strike, int ball) {
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        }else if (strike == 0 && ball != 0) {
            System.out.println(ball+"볼");
        }else if (strike !=0 && ball == 0) {
            System.out.println(strike+"스트라이크");
        }else {
            System.out.println(ball+"볼 "+strike+"스트라이크");
        }
    }
}
