
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
	
	/*��Ʈ����ũ ���� ��ȯ*/
	public int check_s(int input){
		int cnt=0;
		int temp = this.answer;
		 
		for(int i=0; i<3; ++i){
			if(temp % 10 == input % 10)	//�ڸ����� ���ڱ��� ������ cnt 1����
				cnt++;
			temp /= 10;
			input /= 10;
		}
		return cnt;
	}
	
	/*�� ���� ��ȯ*/
	public int check_b(int input){
		int cnt=0;
		int temp = this.answer;
		
		// in, ans �迭�� input�� answer�� �ڸ��� ����
		int in [] = new int[3];
		int ans [] = new int[3];
		for(int i=0; i<3; ++i){
			in[i] = input % 10;
			ans[i] = temp % 10;
			input /= 10;
			temp /= 10;
		}
		//���� ���� �����ϸ鼭 �ڸ����� �ٸ��� cnt 1�� �߰�
		if(in[0]==ans[1] || in[0]==ans[2])
			cnt++;
		if(in[1]==ans[0] || in[1]==ans[2])
			cnt++;
		if(in[2]==ans[0] || in[2]==ans[1])
			cnt++;
		
		return cnt;
	}
	
	/*��Ʈ����ũ�� �� ������ ���� ���*/
	public boolean print(int s, int b){
		if(s>0)	//��Ʈ����ũ�� ������ ��Ʈ����ũ ���
			System.out.print(s + "��Ʈ����ũ  ");
		if(b>0)	//���� �ִٸ� �� ���
			System.out.print(b + "��");
		if(s==0 && b==0)	//��Ʈ����ũ��, ���� ���ٸ� ����
			System.out.print("����");
		System.out.println();
		
		if(s==3){	//��Ʈ����ũ�� 3�̸� ����!, false�� return�� ���� ����.
			System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
			return false;
		}
		return true;	//3��Ʈ����ũ�� �ƴϹǷ� ��� ����
	}
}
