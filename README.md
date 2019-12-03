# 숫자 야구 게임
> 우아한 테크코스 프리코스 1주차 미션입니다.

## 게임 방법
1. 상대방(컴퓨터)이 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 생각한다.

2. 나(플레이어)는 상대방의 3자리의 수를 예측한다.
    1. 예측에 성공하면 게임이 종료된다.
    2. 예측에 실패하면 상대방은 힌트를 준다.
        * 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 낫싱
        * [예] 상대방의 수가 425일 때, 123을 제시한 경우: 1 스트라이크, 456을 제시한 경우: 1 스트라이크 1볼, 789를 제시한 경우: 낫싱
    3. 예측에 성공할 때까지 2를 반복한다.
    
3. 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료한다.

## 구현할 기능 목록
* Player Class
    * 플레이어의 수를 입력받는 기능
        * 각 자릿수의 숫자가 1부터 9까지인지 체크하는 기능
        * 3자리의 수가 서로 다른 수인지 체크하는 기능
        * 입력 길이가 올바른지 체크하는 기능
        * 입력이 숫자인지 체크하는 기능 (~~문자열~~)
        * 잘못된 입력에 대해 에러 메시지를 출력하는 기능
    * 플레이어가 랜덤한 3자리 수를 만드는 기능
        * ~~각 자릿수의 숫자가 1부터 9까지인지 체크하는 기능~~(재사용)
        * ~~3자리의 수가 서로 다른 수인지 체크하는 기능~~(재사용)
    * 플레이어가 전달받는 수에 대해서 힌트를 주는 기능
    
* Game Class
    * 게임을 시작하는 기능
    * 힌트를 출력하는 기능
    * 게임 종료를 판단하는 기능
        * 게임 종료 메시지 출력 기능
    * 게임 재시작 or 완전 종료를 판단하는 기능
        * 재시작할지 종료할 지 입력받는 기능
            * 잘못된 입력에 대해 에러 메시지를 출력하는 기능
            
* BaseballMain Class
    * 메인 기능