/*
 * class : User
 * 
 * Ver : 1.0.0 
 * 
 * 2019-03-22
 * 
 * Copyright : Jeongho Park
 * 
 * url : https://github.com/qkrjh0904/java-baseball
 * 
 */

import java.util.Scanner;

public class User {
	/*���� ����� re or quit�� ���� �Լ�*/
	public boolean reOrQuit(){
		Scanner in = new Scanner(System.in);
		System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���.");
		int input;
		input = in.nextInt();
		if( input == 2 )	//2�� �Է��ߴٸ� ����
			return false;
		return true;
	}
}
