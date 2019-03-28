
/* 
 * Ŭ���� �̸� : Computer
 * ��� : ������ ���ڸ� �����ϰ� ������ �Է� ���� �޾� ���Ͽ� ������ �����Ѵ�.
 * �ۼ��� : HyukJin Kwon
 * ��¥ : 2019/03/28
 * ���� : 1.1
 * Copyright (c) 2019 HyukJin Kwon
 */
public class Computer {
	int s_cnt = 0; // strike count;
	int b_cnt = 0; // ball count;
	Baseball bs = new Baseball();
	public int[] target_num = new int[3];
	
	public void create_num() {
		
		while (true) {
			// ������ �� ���ڸ� �����Լ� �� ���� ���� (1 ~ 9)
			for (int i = 0; i < target_num.length; i++) {
				target_num[i] = (int) (Math.random() * 9 + 1);
			}
			
			// �� ���ڰ� �ߺ��� ���� ���� �� ���� �ݺ� �� ������ ��� ���� Ż��
			if (target_num[0] != target_num[1] && target_num[1] != target_num[2] 
					&& target_num[2] != target_num[0]) {
				break;
			}
		}
	}
	
	// ���� �ѹ��� �޾� ��Ʈ����ũ Ƚ���� ī��Ʈ �մϴ�. 
	public void count_s(int[] input_num) {
		// �Է� ���ڿ� �� �ڸ��� ���Ͽ� ���� ���ڰ� ���� ��� ��Ʈ����ũ ī���͸� ������Ų��. 
		for (int i = 0; i < target_num.length; i++) {
			if (target_num[i] == input_num[i]) {
				s_cnt++;
			}
		}
	}
	// ���� �ѹ��� �޾� �� ī��Ʈ Ƚ���� ī��Ʈ �մϴ�.
	public void count_b(int[] input_num) {
		// �Է� ���ڸ� ���ڸ� ���� Ÿ�ٳѹ� ��ü�� ��ȯ�ϸ� ���ڸ� �� ���ϰ� ���� ��� �� ī���͸� ������Ų��.
		for (int i = 0; i < target_num.length; i++) {
			for (int j = 0; j < input_num.length; j++) {
				if (target_num[i] == input_num[j]) {
					b_cnt++;
				}
			}
		}
		// ��ü ��ȯ�ϴ� �������� ��Ʈ����ũ ���� ���� �� ī��Ʈ ���ǿ� �ش��ϹǷ� ��Ʈ����ũ ������ ������
		b_cnt -= s_cnt;
	}
	
	public void result() {
		// ��Ʈ����ũ�� �� ��� ���� ���
		if (s_cnt == 0 && b_cnt == 0) {
			System.out.println("����");
		} else {
			System.out.println(s_cnt + "��Ʈ����ũ " + b_cnt + "��");
			if (s_cnt == 3) {
				System.out.println("����! ���ڸ� ��� �����̽��ϴ�. ���� ��");
				bs.gameMenu();
			}
		}
		s_cnt = 0; // ��Ʈ����ũ ī��Ʈ �ʱ�ȭ
		b_cnt = 0; // �� ī��Ʈ �ʱ�ȭ
	}
}
