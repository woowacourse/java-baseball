import java.util.Scanner;
import java.util.InputMismatchException;
public class Baseball {
	
	
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
