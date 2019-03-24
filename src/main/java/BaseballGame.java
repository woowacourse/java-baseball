import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class BaseballGame {
    static boolean isWin() {
        return true;
    }

    static int[] makeArray() {
        Random rand = new Random(System.currentTimeMillis());
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = rand.nextInt(8) + 1;
        }
        return arr;
    }

    static int[] inputArray(int val) {
        int[] arr = new int[3];
        for (int i = 2; i >= 0; i--) {
            arr[i] = val % 10;
            val /= 10;
        }
        return arr;
    }

    static int countStrike(int[] answer, int[] arr) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] == answer[i])
                count++;
        }
        return count;
    }

    static int countBall(int[] answer, int[] arr) {
        Arrays.sort(answer);
        int count = 0;
        for (int i : arr) {
            if (Arrays.binarySearch(answer, i) >= 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        while(true) {
            int[] answer = makeArray();
            boolean win = false;
            while(!win) {
                System.out.print("숫자를 입력해주세요 : ");
                int val = stdIn.nextInt();
                int[] arr = inputArray(val);

                int strike = countStrike(answer, arr);
                int ball = countBall(answer, arr);
                ball -= strike;


                win = isWin();
            }

            System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");
            int re = stdIn.nextInt();
            if (re == 2)
                break;
        }
    }
}
