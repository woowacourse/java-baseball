import java.util.Scanner;

/* 
 * 클래스 이름 : Baseball
 * 작성자 : Moonyoung Chae
 * 날짜 : 2019/03/28
 * Copyright (c) 2019 Moonyoung Chae
 */

public class Baseball {
	static int NUM_SIZE = 3;
	int[] computerNumbers = new int[NUM_SIZE];	// 컴퓨터 난수
	int [] userNumbers = new int[NUM_SIZE];		// 사용자 입력 숫자
	int strike = 0;
	int ball = 0;
	int userMessage = 0;						// 게임 진행 여부 (0: 게임 반복, 1: 게임 새로 시작, 2: 게임 종료)
	Scanner scanner = new Scanner(System.in);
	
	
	// 기능을 호출하는 함수
	public void run() {
		initComputerNumbers();
		while(userMessage != 2) {
			if(userMessage == 1) {
				initComputerNumbers();
			}
			getUserNumbers();
			makeResult();
			showResult();
			userMessage = manageGame();
		}
	}
	
	// 컴퓨터 난수를 생성하는 함수
	public void initComputerNumbers() {
		// 초기화
		for(int i = 0; i < NUM_SIZE; i++) {
			computerNumbers[i] = (int)(Math.random() * 10);
		}
		
		// 조건에 맞지 않을 경우, 다시 난수를 생성
		while(true) {
			if(computerNumbers[0] == 0) {
				computerNumbers[0] = (int)(Math.random()*10);
			}else {
				break;
			}
		}

		while(true) {
			if((computerNumbers[1] == 0) || (computerNumbers[1] == computerNumbers[0])) {
				computerNumbers[1] = (int)(Math.random()*10);
			}else {
				break;
			}
		}

		while(true) {
			if((computerNumbers[2] == 0) || (computerNumbers[2] == computerNumbers[0])
					|| (computerNumbers[2] == computerNumbers[1])) {
				computerNumbers[2] = (int)(Math.random()*10);
			}else {
				break;
			}
		}
	}
	
	// 사용자에게서 숫자를 입력받는 함수
	public void getUserNumbers() {
		do {
			System.out.print("숫자를 입력해주세요 : ");
			int input = scanner.nextInt();
			userNumbers[0] = input / 100;
			userNumbers[1] = (input / 10) % 10;
			userNumbers[2] = input % 10;
		}while(!checkUserNumbers());
	}
	
	// 사용자가 입력한 숫자를 확인하는 함수
	public boolean checkUserNumbers() {
		if(userNumbers[0] == 0 || userNumbers[0] > 9) {
			System.out.println("숫자는 3자리여야 합니다.");
			return false;
		}
		
		if((userNumbers[0] == userNumbers[1])
			|| (userNumbers[0] == userNumbers[2])
			|| (userNumbers[1] == userNumbers[2])) {
			System.out.println("숫자의 각 자리는 서로 달라야 합니다.");
			return false;
		}
		
		return true;
	}
	
	// Ball 개수를 검사하는 함수
	public void countBall(int index) {
		for(int i = 0; i < NUM_SIZE; i++){
			if(i == index) {
				continue;
			}
			if(computerNumbers[index] == userNumbers[i]) {
				ball++;
			}
		}
	}
	
	// Strike 개수를 검사하는 함수
	public void countStrike(int index) {
		if(computerNumbers[index] == userNumbers[index]) {
			strike++;
		}
	}
	
	// Ball 검사, Strike 검사 함수를 호출
	public void makeResult() {
		strike = 0;
		ball = 0;
		for(int i = 0; i < NUM_SIZE; i++) {
			countBall(i);
			countStrike(i);
		}
	}
	
	// 결과를 출력하는 함수
	public void showResult() {
		if(strike > 0) {
			System.out.print(strike+" 스트라이크 ");
		}
		if(ball > 0) {
			System.out.print(ball+" 볼 ");
		}
		if(strike == 0 && ball == 0) {
			System.out.print("낫싱");
		}
		System.out.print("\n");
	}
	
	// 게임을 진행하는 함수
	public int manageGame() {
		if(strike != 3) {
			return 0;
		}else {
			System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
			System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
			int exitCommand = scanner.nextInt();
			return exitCommand;
		}
	}
}
