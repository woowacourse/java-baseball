
public class Computer {
	
	public int[] target_num = new int[3];
	
	public void create_num() {
		
		while(true) {
			// ������ �� ���ڸ� �����Լ� �� ���� ���� (1 ~ 9)
			for(int i = 0; i < target_num.length; i++) {
				target_num[i] = (int) (Math.random() * 9 + 1);
			}
			
			// �� ���ڰ� �ߺ��� ���� ���� �� ���� �ݺ� �� ������ ��� ���� Ż��
			if ( target_num[0] != target_num[1] && target_num[1] != target_num[2] 
					&& target_num[2] != target_num[1]) {
				break;
			}
		}
	}
	
	// Ÿ�� �ѹ��� �޾� ��Ʈ����ũ Ƚ���� ī��Ʈ �մϴ�. 
	public int count_s(int[] input_num) {
		int s_cnt = 0;
		
		// �Է� ���ڿ� �� �ڸ��� ���Ͽ� ���� ���ڰ� ���� ��� ��Ʈ����ũ ī���͸� ������Ų��. 
		for(int i = 0; i < target_num.length; i++) {
			if( target_num[i] == input_num[i]) {
				s_cnt++;
			}
		}
		return s_cnt;
	}
}
