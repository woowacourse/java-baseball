package her.example;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {

	int sc =0;
	
      Scanner scan = new Scanner(System.in);      // ���� �Է��� ���ڷ� Scanner ����  
      int score = scan.nextInt();            // Ű���� ���� �Է�
      
      if(90<= score && score <=100)  System.out.println('A');
      else if(80<= score && score <=89)  System.out.println('B');
      else if(70<= score && score <=79)  System.out.println('C');
      else if(60<= score && score <=69)  System.out.println('D');
      else System.out.println('F');
      //hello world
      
	}
}
