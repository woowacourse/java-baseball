import java.util.Scanner;

public class Player {
	public int[] Player_num = new int[3];
	
	public int[] input_num() {
		while(true) {
			int input_num = 0;
			Scanner sc = new Scanner(System.in);
		
			input_num = sc.nextInt();
			// �Է� �� ���� ���̸� ������ ���� �����̸� ����ڿ��� ���Է��� �䱸�Ѵ�.
			if(input_vaild(input_num) == true) {
			// �Ķ���ͷ� ����ϱ����� �� �ڸ� �� ���� �迭�� ����
				Player_num[0] = input_num / 100;
				Player_num[1] = (input_num / 10) % 10;
				Player_num[2] = input_num % 10;	
				return Player_num;
			}
			else {
				System.out.println("���ο� ���ڸ� �Է����ּ���");
			}
		}
		
	}
	
	
	
	public boolean input_vaild(int input_num) {
		
		return true;
	}
}
