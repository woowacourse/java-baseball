
public class Computer {
	private int answer=0;	//���ڸ� ������
	
	/*��ǻ�Ͱ� ������ ���ڸ� ���� ���ϴ� �Լ�*/
	public void random(){
		int n1, n2, n3;
		
		while( true ){			
			//1���� 9�����Ǽ�
			n1 = (int) (Math.random() * 9 + 1);
			n2 = (int) (Math.random() * 9 + 1);
			n3 = (int) (Math.random() * 9 + 1);
			
			//�� �ڸ� ���� ���� �ٸ��� Ȯ��. ���� ���ڰ� �ִٸ� n1~n3 �缳��
			if( n1!=n2 && n2!=n3 && n3!=n1 )
				break;
		}
		//answer = n1�� 100���ڸ�, n2�� 10���ڸ�, n3�� 1���ڸ��� �ʱ�ȭ
		this.answer =  (n1 * 100) + (n2 * 10) + n3 ;
	}
}
