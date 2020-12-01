# 미션 - 숫자 야구 게임

## 구현 기능 목록

- 유저
    - 3자리수를 입력 받는다.
        - IllegalArgumentException 예외조건
            - 3자리 숫자가 아닌 경우.
            - 3자리 숫자에 중복이 있을 경우.
            - 각 입력 값이 1~9의 숫자가 아닌 경우.
    - 게임 종료 시 재시작/종료를 구분하는 1과 2중 하나의 수 입력.
        - IllegalArgumentException 예외조건
            - 종료시 1 또는 2가 아닌 경우.
- 컴퓨터
    - 1에서 9까지 **서로 다른** 임의의 수 3개를 정한다.
        - IllegalArgumentException 예외조건
            - 3자리 숫자가 아닌 경우.
            - 3자리 숫자에 중복이 있을 경우.
            - 각 입력 값이 1~9의 숫자가 아닌 경우.
- 게임
    - 유저의 입력과 컴퓨터의 숫자를 비교한다.
        - 같은 자리에 같은 숫자가 있는 경우 그 갯수와 함께 *스트라이크* 출력.
        - 자리는 다르지만 같은 숫자가 있는 경우 그 갯수와 함께 *볼* 출력. 
        - 같은 숫자가 하나도 없는 경우 *낫싱* 출력.
        - *볼* 과 *스트라이크* 동시 출력의 경우 *볼* -> *스트라이크* 순으로 출력.
    - 3자리 숫자가 정답과 같은 경우 게임이 종료.
        - System.exit을 사용하지 않는다.

- 예외 발생 시 처리방식을 명시하지 않았음으로 Exception 종료.

## 📝 License

This project is [MIT](https://github.com/woowacourse/java-baseball-precourse/blob/master/LICENSE) licensed.   