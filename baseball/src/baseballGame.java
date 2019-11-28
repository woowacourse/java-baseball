import java.util.Random;

/**
 * @author SMJin
 * baseballGame Class
 * */
public class baseballGame {

    public static void main(String[] args) {

        int answerNumA = 0;
        int answerNumB = 0;
        int answerNumC = 0;

        int[] answerNum = initBaseballNumber(answerNumA, answerNumB, answerNumC);

    }

    /*
    정답 숫자들을 랜덤으로 생성하여 int형 배열로 반환하여 주는 메소드이다.
     */
    static private int[] initBaseballNumber (int answerNumA, int answerNumB, int answerNumC) {
        Random random = new Random();
        answerNumA = random.nextInt(10)+1;
        answerNumB = random.nextInt(10)+1;
        answerNumC = random.nextInt(10)+1;

        int[] answerNum = {answerNumA, answerNumB, answerNumC};

        return answerNum;
    }

    /*
    int형 정답 배열과 int형 사용자가 입력한 배열을 인자로 넣으면, Strike 횟수를 반환해주는 메소드이다.
     */
    int isStrike(int answerNum[], int num[]) {
        int strikeNumber = 0;

        for (int i=0; i<3; i++) {
            if (isSame(answerNum[i], num[i])) {
                strikeNumber++;
            }
        }

        return strikeNumber;
    }

    /*
    int형 정답 배열과 int형 사용자가 입력한 배열을 인자로 넣으면, Ball 횟수를 반환해주는 메소드이다.
     */
    int isBall(int answerNum[], int num[]) {
        int ballNumber = 0;

        for (int i=0; i<3; i++) {
            if (isSame(answerNum[i], num[(i+1)%3])) {
                ballNumber++;
            }
            if (isSame(answerNum[i], num[(i+2)%3])) {
                ballNumber++;
            }
        }

        return ballNumber;
    }

    /*
    인자로 들어온 두 int 형 숫자가 같으면 TRUE 를 반환하는 메소드이다.
     */
    boolean isSame(int answerNum, int num) {
        return (answerNum == num);
    }


}
