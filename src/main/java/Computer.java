
public class Computer {
	public int targetnum = 0;
	
	public void create_num() {
		int num1, num2, num3;
		
		while(true) {
			// ������ �� ���ڸ� �����Լ� �� ���� ���� (1 ~ 9)
			num1 = (int) (Math.random() * 9 + 1);
			num2 = (int) (Math.random() * 9 + 1);
			num3 = (int) (Math.random() * 9 + 1);
			
			// �� ���ڰ� �ߺ��� ���� ���� �� ���� �ݺ� �� ������ ��� ���� Ż��
			if ( num1 != num2 && num2 != num3 && num3 != num1) {
				break;
			}
		}
		// �� ���ڸ� �� �ڸ����� �Ͽ� Ÿ�ٳѹ� ����
		this.targetnum = (num1 * 100) + (num2 * 10) + num3;
	}
}
