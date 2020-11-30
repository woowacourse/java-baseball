package baseball;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class BaseballResult {
    private static final int ANSWER_COUNT = 3;
    private static final int ZERO = 0;
    private static final String NOTHING = "낫싱";
    private Map<BallType, Integer> result;

    public BaseballResult() {
        initResult();
    }

    private void initResult() {
        Map<BallType, Integer> result = new HashMap<>();
        this.result = result;
    }

    public void accumulateBallType(BallType ballType) {
        result.put(ballType, result.getOrDefault(ballType, 0) + 1);
    }

    public String getResult() {
        if (isNothing()) {
            return NOTHING;
        }
        return ballAndStrike();
    }

    private boolean isNothing() {
        return result.isEmpty();
    }

    private String ballAndStrike() {
        Set<BallType> ballTypes = result.keySet();
        return ballTypes.stream()
                .map(ballType -> ballType.getNameWith(countFor(ballType)))
                .sorted(Comparator.reverseOrder())  //볼이 먼저 나와야 됨
                .collect(Collectors.joining(" "));
    }

    //test에도 사용되어 public으로 선언
    public int countFor(BallType ballType) {
        if (!result.containsKey(ballType)) {
            return ZERO;
        }
        return result.get(ballType);
    }

    public boolean isAnswer() {
        return result.containsKey(BallType.STRIKE) && result.get(BallType.STRIKE) == ANSWER_COUNT;
    }

}
