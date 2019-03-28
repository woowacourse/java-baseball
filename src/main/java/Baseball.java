import java.util.Scanner;

/* 
 * Ŭ���� �̸� : Baseball
 * �ۼ��� : Moonyoung Chae
 * ��¥ : 2019/03/28
 * Copyright (c) 2019 Moonyoung Chae
 */

public class Baseball {
	static int NUM_SIZE = 3;
	int[] computerNumbers = new int[NUM_SIZE];	// ��ǻ�� ����
	int [] userNumbers = new int[NUM_SIZE];		// ����� �Է� ����
	int strike = 0;
	int ball = 0;
	Scanner scanner = new Scanner(System.in);
	
	
	// ��ǻ�� ������ �����ϴ� �Լ�
	public void initComputerNumbers() {
		// �ʱ�ȭ
		for(int i = 0; i < NUM_SIZE; i++) {
			computerNumbers[i] = (int)(Math.random() * 10);
		}
		
		// ���ǿ� ���� ���� ���, �ٽ� ������ ����
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
	
	// ����ڿ��Լ� ���ڸ� �Է¹޴� �Լ�
	public void getUserNumbers() {
		do {
			System.out.print("���ڸ� �Է����ּ��� : ");
			int input = scanner.nextInt();
			userNumbers[0] = input / 100;
			userNumbers[1] = (input / 10) % 10;
			userNumbers[2] = input % 10;
		}while(!checkUserNumbers());
	}
	
	// ����ڰ� �Է��� ���ڸ� Ȯ���ϴ� �Լ�
	public boolean checkUserNumbers() {
		if(userNumbers[0] == 0 || userNumbers[0] > 9) {
			System.out.println("���ڴ� 3�ڸ����� �մϴ�.");
			return false;
		}
		
		if((userNumbers[0] == userNumbers[1])
			|| (userNumbers[0] == userNumbers[2])
			|| (userNumbers[1] == userNumbers[2])) {
			System.out.println("������ �� �ڸ��� ���� �޶�� �մϴ�.");
			return false;
		}
		
		return true;
	}
	
	// Ball ������ �˻��ϴ� �Լ�
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
	
	// Strike ������ �˻��ϴ� �Լ�
	public void countStrike(int index) {
		if(computerNumbers[index] == userNumbers[index]) {
			strike++;
		}
	}
	
	// Ball �˻�, Strike �˻� �Լ��� ȣ��
	public void makeResult() {
		strike = 0;
		ball = 0;
		for(int i = 0; i < NUM_SIZE; i++) {
			countBall(i);
			countStrike(i);
		}
	}
}
