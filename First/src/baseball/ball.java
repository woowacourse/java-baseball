package baseball;

import java.util.Random;
import java.util.Scanner;

public class ball {

	static int compu = 0;
    static int number = 0;
    static int strike = 0, ball = 0;
    static int com[] = new int[3];
    static int me[] = new int[3];
    static Random ran = new Random();
    static boolean flag = true;
    static int i=0,j=0;
    
    //����
    //indent depth 1
    public static void main(String[] args) {
        
        Randommake();
        
        flag = true;
        
        while(flag!=false) {
            Putnumber();
            FindSB();
            Print();
        }
    }
    
    
    //��ǻ�Ͱ� 3�ڸ� �� ���ϱ�
    //indent depth 1
    static void Randommake(){
    
    	for(int k=0; k<3; k++) com[k] =0;
        // �������� �� ���� (��ġ�� �ʴ� �� �ڸ� ��)
        while (com[0] == 0)
            com[0] = ran.nextInt(10);
        while (com[0] == com[1] || com[1] == 0)
            com[1] = ran.nextInt(10);
        while (com[0] == com[2] || com[1] == com[2] || com[2] == 0)
            com[2] = ran.nextInt(10);

        compu = com[0] * 100 + com[1] * 10 + com[2];
        
    }
    
    //�� �ֱ�
    //indent depth 0
    static void Putnumber() {
        
        System.out.println("���ڸ� �Է����ּ��� : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        
        me[0] = number / 100;
        me[1] = (number % 100) / 10;
        me[2] = number % 10;
        
    }
    
    //��Ʈ����ũ & �� ���� ã��
    //indent depth 2
    static void FindSB() {
        
        strike = 0;
        ball = 0;
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                check();
            }
        }
    }
    
    //������ ��Ʈ����ũ & �� ���� ����
    //indent depth 1
    static void check() {
        if (i == j && com[i] == me[j])
            strike++;
        else if (i != j && com[i] == me[j])
            ball++;
    }
    
    //����ϱ�
    //indent depth 1
    static void Print() {
        
        if(strike == 0 && ball == 0) System.out.println("����");
        if(strike != 0)    System.out.println(strike + " ��Ʈ����ũ");
        if(ball != 0) System.out.println(ball + "��");
        if(compu == number)    Finish();
        
    }
    //�����ϱ� -> 1. ���� ���� ����, 2. ���� ����
    //indent depth 1
    static void Finish() {
        
        System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
        System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���.");
        
        Scanner sca = new Scanner(System.in);
        int play = sca.nextInt();
        
        if(play == 1) {
            Randommake();
            number = 0;
        }
        else if(play == 2) flag = false;
    }
	
}
