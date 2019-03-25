/*
 * class : Main
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

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Computer cmp = new Computer();
		User user = new User();
		
		boolean re = true;
		while( re ){
			System.out.println("���ӽ���!!");
			cmp.random();	//���� 3�ڸ� ����
			boolean quit = true;
			while( quit ){
				int input;	//���ڸ� ���� �Է�
				input = in.nextInt();
				int s = cmp.check_s(input);	//��Ʈ����ũ ��
				int b = cmp.check_b(input);	//�� ��
				quit = cmp.print(s, b);	//�� �� ���
			}
			re = user.reOrQuit();	//����� ���� �׸����� ���� �Լ�
		}
	}
}
