package domain.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThatCode;

class GameResultTest {

    private Map<String, Integer> gameResultMap;

    @BeforeEach
    public void setup() {
        gameResultMap = new HashMap<>();
    }

    @DisplayName("게임 결과(볼, 스트라이크)가 저장된 Map을 파라미터로 받아, GameResult 객체를 정상 생성함")
    @Test
    public void GameResult_객체_생성_정상() {
        gameResultMap.put("볼", 1);
        gameResultMap.put("스트라이크", 0);
        assertThatCode(() -> {
            new GameResult(gameResultMap);
        }).doesNotThrowAnyException();
    }

    @DisplayName("GameResult 객체 생성 시, 게임 결과(볼, 스트라이크) key가 하나라도 없는 경우 예외 발생")
    @ParameterizedTest
    @ValueSource(strings = {"볼", "스트라이크", "wrongKey"})
    public void GameReuslt_객체_생성_실패_KEY_오류(String key) {
        gameResultMap.put(key, 1);
        assertThatCode(() -> {
            new GameResult(gameResultMap);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("하나도 못 맞춘 경우 결과값으로 '낫싱'을 반환")
    @Test
    public void 하나도_못맞추면_낫씽_반환() {
        gameResultMap.put("볼", 0);
        gameResultMap.put("스트라이크", 0);
    }
}
