import java.util.Scanner;

/*
 * ���� �߱� ������ ������ Ŭ����
 * 
 * @version			1.00 2019�� 3�� 24��
 * @author 			Wonseok Choi
 */
public class baseballGame {

	/*
	 * ������ �� 3���� ���� 3�ڸ� ���� ����� �ִ� �޼ҵ�
	 * 
	 * @return 			������ ���ڸ��� 
	 */
	public static int getComNum() {
		int first = (int)(Math.random()*9 + 1);		// 100�� �ڸ���
    	int second = (int)(Math.random()*9 + 1);	// 10�� �ڸ���
    	int third = (int)(Math.random()*9 + 1);		// 1�� �ڸ���
    	
    	/* �ڸ������� �ߺ����� �ʵ��� �Ѵ�*/
    	while((second == first)) {
    		second = (int)(Math.random()*9 + 1);
    	}
    	while((third == first) 
	    	|| (third == second)) {
    		third = (int)(Math.random()*9 + 1);
	    }
    	
    	return (first*100 + second*10 + third);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
	    int gameMode = 1;							// ���� ���� ����
    	int comNum = getComNum();					// ������ ���ڸ� ��
    	
	    while(gameMode == 1) {
	    	
	    	System.out.print("���ڸ� �Է����ּ��� : ");
		    int myNum = sc.nextInt();				// ������� ���ڸ� ��
	    }
	}
}
