package baseball.precourse;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

   static Scanner sc = new Scanner(System.in);
   static ArrayList<Integer> answer;
   static Random rand = new Random();
   static int strike = 0, ball = 0;
   static int[] userNum = new int[3];
   
   public static void main(String args[]) {
      startGame();
   }

   // ���� ���� �Լ�
   public static void startGame() {

      int input;
      randomNumber();
      do {
            System.out.print("���ڸ� �Է����ּ��� : ");
            input = sc.nextInt();
            processInput(input);
      } while(true);
   }
   
   public static boolean isDone(int input) {
      if(input==2)
         return true;
      return false;
   }

   // ���� �Է� ������ �� ���� userNum�� ����
   public static void processInput(int number) {
      int count = 2;
      while (count > -1) {
         userNum[count--] = number % 10;
         number /= 10;
      }
      judge();
   }

   // ��Ʈ����ũ, �� ��� �Լ�
   public static void judge() {
      strike = ball = 0;
      for (int i = 0; i < 3; i++) {
         if (checkNumber(userNum[i])) {
            checkResult(i);
         }
      }
      printResult();
   }

   // ������,�ε��� ���� ���� ������ ��Ʈ����ũ �� �����ִ� �Լ�
   public static void checkResult(int userIndex) {

      if (answer.get(userIndex) == userNum[userIndex]) {
         strike++;
         return;
         }
      ball++;

   }

   // ��Ʈ����ũ ���� ���� ��� ���
   public static void printResult() {

      if (strike == 3) {
         allStrike();
         return;
      }
      
      if (strike != 0)
         System.out.printf("%d ��Ʈ����ũ", strike);
      if (ball != 0)
         System.out.printf("%d��  ", ball);
      if(strike== 0&& ball==0)
         System.out.print("����");

      System.out.println();

   }

   // ���� �ÿ� ���� ����,����� ���� ����
   public static void allStrike() {
      System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ��������");
      System.out.println("������ ���� �����Ϸ��� 1,�����Ϸ��� 2�� �Է��ϼ���");
      int input = sc.nextInt();

      if (input == 1) {
         startGame();
         return;
      }
      System.exit(0);

   }

   // ����(��ǻ��) ���� ���� �� �ߺ� �˻� �޼ҵ�
   public static void randomNumber() {
      answer = new ArrayList<Integer>();
      int number;
      while (answer.size() < 3) {
          number = rand.nextInt(9) + 1;
         if (!checkNumber(number)) {
            answer.add(number);
         }
      }

   }
   
   public static boolean checkNumber(int number) {
      if(answer.contains(number))
         return true;
      return false;
   }
   
}