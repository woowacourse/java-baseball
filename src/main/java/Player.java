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
		
		boolean vaild_num = true; // �Ǻ� ���� �Լ�
		int one = input_num / 100; // 100���ڸ�
		int two = (input_num / 10) % 10; // 10�� �ڸ�
		int three = input_num % 10;	 //1�� �ڸ�
		// ���ڰ� 3�ڸ� ���� ����
		if (input_num > 99 && input_num < 1000 ) {
			System.out.println("�Է°��� 3�ڸ� ���� �ƴմϴ�. �Է°��� Ȯ�����ּ���");
			vaild_num = false;
		}
		// ���� �ٸ� �������� ����
		if (one == two && two == three && three == one) {
			System.out.println("�ߺ� �Ǵ� ���ڰ� �ԷµǾ����ϴ�. �Է°��� Ȯ�����ּ���");
			vaild_num = false;
		}
		// ���ڰ� 0 �� ���ԵǾ� �ִ��� ����
		if (one == 0 && two == 0 && three == 0) {
			System.out.println("�Է� ���� 0�� ���� �Ǿ� �ֽ��ϴ�. �Է°��� Ȯ�����ּ���");
			vaild_num = false;
		}
		return vaild_num;
	}
}
