package com.woowahan.baseball;

import java.util.ArrayList;

public abstract class AbstractBaseball {
    protected abstract Integer getRandomInteger(int min, int max);
    protected abstract String getLine();

    protected abstract ArrayList<Integer> initializeBallRange();
    protected abstract Integer getRandomBall(ArrayList<Integer> range);
    protected abstract ArrayList<Integer> getRandomBalls();
    protected abstract EarlyResults.EarlyResult evaluateBall(Integer ball, ArrayList<Integer> balls);
    protected abstract EarlyResults evaluateBalls(ArrayList<Integer> user, ArrayList<Integer> answer);

    public abstract void Process();
}
