import java.util.Scanner;
import java.util.InputMismatchException;

/* 
 * Ŭ���� �̸� : Baseball
 * ��� : �������� ���Ӹ޴��� �����ϰ� ������ ū ������ �����Ѵ�.
 * �ۼ��� : HyukJin Kwon
 * ��¥ : 2019/03/28
 * ���� : 1.1
 * Copyright (c) 2019 HyukJin Kwon
 */
public class Baseball {
	public void start_game() {
		Computer com = new Computer();
		Player user = new Player();
		
		com.create_num();
		while(true) {
			System.out.println("�ߺ����� �ʴ� 1 ~ 9 ���ڸ� ���� �Է����ּ���");
			int input[] = user.user_num();
			com.count_s(input);
			com.count_b(input);
			com.result();
		}
	}
	// ������ �����ϱ� ���� �޴��� case�� ���� �����ϴ�.
	public void gameMenu() {
		System.out.println("Play!! Baseball");
		System.out.println("������ �Ϸ��� 1, �׸��Ϸ��� 2�� �Է��ϼ���!");
		Scanner sc = new Scanner(System.in);
		int gameinput = 0;
			
		try {
		   gameinput = sc.nextInt();
		   switch(gameinput) {
			  case 1:
				System.out.println("���ӽ���");
				start_game();
				break;
			  case 2: 
				System.out.println("��������");
				break;	
			  default: // 1, 2 ���� ���ڰ� ���� ��� �����
				System.out.println("�Էµ� ���� �߸��Ǿ����ϴ�. ���Է����ּ���");
				gameMenu();
				break;
			    }
			}
			// ���ڰ� �ƴѰ� ������ �����
			catch (InputMismatchException e) {
	            System.out.println("�Էµ� ���� �߸��Ǿ����ϴ�. ���Է����ּ���");
	            gameMenu();
	        }
	}
	public static void main(String[] args) {
		
		Baseball bs = new Baseball();
		bs.gameMenu();
	}
}
