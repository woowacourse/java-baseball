package baseball;

import utils.RandomUtils;
import java.util.Scanner;

public class Game {
    public static void play(Scanner scanner){

        Baseball userBall = new Baseball();
        Baseball opponentBall = new Baseball();
        allocateBallsToPlayer(opponentBall, generateOpponentInput(), scanner);
        Opponent opponent = new Opponent(opponentBall);

        while(true) {
            System.out.println(Constants.PROMPT_MESSAGE);
            User user = new User(userBall);
            allocateBallsToPlayer(userBall, getUserInput(scanner), scanner);
            System.out.println(opponent.getBaseballs());
            if(user.gameResult(opponent)){
                break;
            }
        }
        askMoreGame(scanner);
    }

    public static void askMoreGame(Scanner scanner){
        System.out.println(Constants.ASK_PLAY_MORE);
        try{
            int userAnswer = Integer.parseInt(getUserInput(scanner));
            if(userAnswer == 1){
                play(scanner);
            }
            if(userAnswer == 2){
                return;
            }
            throw new IllegalArgumentException(Constants.ERR_MSG_VALID_INPUT_PLAYMORE);
        }
        catch(IllegalArgumentException errorMessage){
            System.out.println(errorMessage);
            askMoreGame(scanner);
        }
    }

    public static void allocateBallsToPlayer(Baseball baseball, String input, Scanner scanner){
        if(baseball.parseBaseball(input)){
            return;
        }
        System.out.println("잘못된 입력입니다. 다시 입력하세요");
        allocateBallsToPlayer(baseball, getUserInput(scanner), scanner);
    }


    public static String getUserInput(Scanner scanner){
        return scanner.next();
    }

    public static String generateOpponentInput(){
        String baseball = "";
        while(baseball.length() != Constants.VALID_INPUT_LENGTH){
            String ball = Integer.toString(RandomUtils.nextInt(1,9));
            if(baseball.indexOf(ball) == -1){
                baseball+=ball;
            }
        }
        return baseball;
    }
}
