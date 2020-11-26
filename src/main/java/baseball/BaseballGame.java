package baseball;

import utils.RandomUtils;

import java.util.*;

public class BaseballGame {
    private final Scanner scanner;

    public BaseballGame(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run(){
        while(true) {
            game();
        }
    }

    public void game() {
        List<String> ballNumberList = ballNumbers();
        int ballCounter = 0;
        int strikeCounter = 0;
        System.out.print("숫자를 입력해주세요 : ");
        String playerBallNumber = scanner.nextLine();

        List<String> playerBallSplitNumberList = playerBallNumber(playerBallNumber);

        strikeCounter = strikeCompare(ballNumberList, playerBallSplitNumberList);
        ballCounter = ballCompare(ballNumberList, playerBallSplitNumberList);

        resultPrint(ballCounter, strikeCounter);
    }

    public List<String> ballNumbers() {
        Set<String> set = new HashSet<>();
        while(set.size() < 3) {
            set.add(String.valueOf(RandomUtils.nextInt(1, 9)));
        }
        return new ArrayList<>(set);
    }

    public List<String> playerBallNumber(String playerBallNumber) {
        String[] playerBallSplitNumber = playerBallNumber.split("");
        List<String> playerBallSplitNumberList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            playerBallSplitNumberList.add(playerBallSplitNumber[i]);
        }
        return playerBallSplitNumberList;
    }

    public int strikeCompare(List<String> ballNumberList, List<String> playerBallSplitNumberList) {
        int strikeCounter = 0;

        for (int i = 0; i < ballNumberList.size(); i++) {
            if (ballNumberList.get(i).equals(playerBallSplitNumberList.get(i)))
                strikeCounter += 1;
        }
        return strikeCounter;
    }

    public int ballCompare(List<String> ballNumberList, List<String> playerBallSplitNumberList) {
        int ballCounter = 0;
        for (int answerIndex = 0; answerIndex < 3; answerIndex++) {
            for (int playerIndex = 0; playerIndex < 3; playerIndex++) {
                if (answerIndex == playerIndex)
                    continue;
                else {
                    if (ballNumberList.get(answerIndex).equals(playerBallSplitNumberList.get(playerIndex)))
                        ballCounter += 1;
                }
            }
        }
        return ballCounter;
    }

    public void resultPrint(int ballCounter, int strikeCounter) {
        if(1 <= ballCounter && 1 <= strikeCounter){
            System.out.println(String.format("%d볼 %d스트라이크 입니다.",ballCounter,strikeCounter));
        }else if(1 <= ballCounter && strikeCounter==0){
            System.out.println(ballCounter+"볼 입니다.");
        }else if(0 == ballCounter && strikeCounter==1) {
            System.out.println(strikeCounter+"스트라이크 입니다.");
        }else if(0 == ballCounter && strikeCounter==2) {
            System.out.println(strikeCounter+"스트라이크 입니다.");
        }else if(strikeCounter==3){
            System.out.println(strikeCounter + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }else{
            System.out.println("낫싱");
        }
    }
}
