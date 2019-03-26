/*
 * @BaseballGame.java        1.00 2019/03/26
 * 
 * Copyright(c) 2019         Soojin Roh
 * All rights reserved.
 * 
 * 야구 게임을 구현한 프로그램.
 * 2명의 플레이어가 1~9까지의 서로 다른 정수 세 개를 선택해서 상대방의 숫자를 맞추는 게임입니다.
 * 컴퓨터의 숫자는 Random클래스를 사용해 임의로 생성하고 사용자의 숫자는 Scanner클래스로 입력 받아 각각 int[]에 담습니다.
 * 사용자가 선택한 숫자의 값과 컴퓨터의 값을 비교해 값이 같고 배열 내의 index도 같은 경우 strike로 처리합니다.
 * 사용자가 선택한 숫자의 값과 컴퓨터의 값을 비교해 값은 같지만 배열 내의 index는 다른 경우 ball로 처리합니다.
 * strike와 ball이 하나도 없는 경우 "낫싱"으로 처리합니다.
 * 3strike면 게임이 종료됩니다.
 * 게임 종료 후 재게임 여부를 물어 1을 입력하면 게임을 다시 시작하고 2를 입력하면 게임을 종료합니다. 
 */

package com.woowa.precourse;

import java.util.Random;

/**
 * 야구게임을 구현한 클래스입니다.
 * 
 * @version    1.00 2019년 3월 26일
 * @author     노수진
 */
public class BaseballGame implements Baseball {
    /** 상대방(컴퓨터)의 수 */
    protected int[] computerNums = new int[3]; 

    /**
     * 상대방(컴퓨터)의 1~9까지의 세 개의 정수를 생성하는 메서드
     *
     * @return 1~9까지의 서로 다른 세 개의 정수를 담은 int[] 
     */
    @Override
    public int[] makeThreeRandomNumbers() {
        Random random = new Random();
        boolean duplicate = true;

        /* 첫 번째 값 생성 */
        computerNums[0] = 1 + random.nextInt(9);

        /* 두 번째 값 생성 */
        while (duplicate) {
            computerNums[1] = 1 + random.nextInt(9);
            duplicate = checkDuplicate(computerNums, 1);
        }

        duplicate = true;

        /* 세 번째 값 생성 */
        while (duplicate) {
            computerNums[2] = 1 + random.nextInt(9);
            duplicate = checkDuplicate(computerNums, 2);
        }

        return computerNums;
    }

    @Override
    public int[] inputUserNumbers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean checkInputNumbers(String inputNumber) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean checkDuplicate(int[] intArray, int index) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int[] convertStringToIntArray(String inputNumber) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean checkNumberOrNot(String inputNumber) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean checkInputNumberLength(String inputNumber) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int[] checkStrikeOrBall(int[] comNumbers, int[] userNumbers) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void runGame() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void reGame() {
        // TODO Auto-generated method stub
        
    }
    
    public static void main(String[] args) {
        
    }

}