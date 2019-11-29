package baseball.precourse;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> answer;
	static Random rand = new Random();
	static int strike = 0, ball = 0;
	static int[] userNum = new int[3];

	public static void main(String args[]) {
		GameStart();
	}

	// ���� ���� �Լ�
	public static void GameStart() {

		AnswerNumber();
		while (true) {
			System.out.print("���ڸ� �Է����ּ��� : ");
			int user = sc.nextInt();
			sc.nextLine();
			classification(user);
		}

	}

	// ���� �Է� ������ �� ���� userNum�� ����
	public static void classification(int user) {
		int cnt = 2;
		while (cnt >= 0) {
			userNum[cnt--] = user % 10;
			user /= 10;
		}
		judgement();
	}

	// ��Ʈ����ũ, �� ��� �Լ�
	public static void judgement() {
		strike = ball = 0;
		for (int i = 0; i < 3; i++) {
			if (answer.contains(userNum[i])) {
				CheckResult(i);
			}
		}
		Result();
	}

	// ������,�ε��� ���� ���� ������ ��Ʈ����ũ �� �����ִ� �Լ�
	public static void CheckResult(int userIndex) {

		if (answer.get(userIndex) == userNum[userIndex])
			strike++;
		else
			ball++;

	}

	// ��Ʈ����ũ ���� ���� ��� ���
	public static void Result() {

		if (strike == 3) {
			AllStrike();
			return;
		}
		
		if (ball != 0)
			System.out.printf("%d��  ", ball);
		if (strike != 0)
			System.out.printf("%d ��Ʈ����ũ", strike);
		if(strike== 0&& ball==0)
			System.out.print("����");

		System.out.println();

	}

	// ���� �ÿ� ���� ����,����� ���� ����
	public static void AllStrike() {
		System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ��������");
		System.out.println("������ ���� �����Ϸ��� 1,�����Ϸ��� 2�� �Է��ϼ���");
		int user = sc.nextInt();

		if (user == 1)
			GameStart();
		else
			System.exit(0);

	}

	// ����(��ǻ��) ���� ���� �� �ߺ� �˻� �޼ҵ�
	public static void AnswerNumber() {
		answer = new ArrayList<Integer>();
		int n;
		while (answer.size() < 3) {
			 n= rand.nextInt(9) + 1;
			if (!answer.contains(n)) {
				answer.add(n);
			}
		}

	}
}
