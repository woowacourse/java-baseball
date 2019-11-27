# 1주차 미션 - 숫자 야구 게임



## 미션 개요

1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다. 컴퓨터가 먼저 3자리의 수를 임의로 정하고, 사용자는 3자리의 수를 입력하여 컴퓨터가 정한 숫자를 맞추는 순서로 진행된다. 컴퓨터가 정한 숫자와 사용자가 입력한 숫자를 비교할 때, 다음과 같은 규칙을 따른다.

- 같은 숫자가 같은 자리에 있으면 스트라이크이다.
- 같은 숫자가 있지만 다른 자리에 있으면 볼이다.
- 같은 수가 전혀 없으면 포볼(혹은 낫싱)이다.

컴퓨터가 정한 3자리 수를 사용자가 맞추면(컴퓨터가 정한 3자리수와 사용자가 입력한 3자리 수가 동일하면), 사용자는 승리하고 게임은 종료된다.

컴퓨터가 정한 3자리 수를 사용자가 맞추지 못하면(컴퓨터가 정한 3자리수와 사용자가 입력한 3자리 수가 다르면), 컴퓨터는 사용자에게 힌트를 준다. 사용자는 힌트를 이용해 다시 컴퓨터의 숫자를 맞추려고 하고(3자리 숫자를 다시 입력하고), 이 과정을 승리할 때까지(맞출 때까지) 반복한다.

사용자가 승리하여 게임이 종료되면, 사용자는 게임을 다시 시작하거나 완전히 종료한다.

## 핵심 개념

1. Baseball: 야구 게임을 의미하고, 게임을 진행하고 종료하는 기능을 한다.
2. Pitcher: 투수를 의미하고, 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 임의로 정하는 기능을 한다.
3. Hitter: 타자를 의미하고, 3자리의 수를 입력받아 컴퓨터가 정한 3자리의 수를 맞추는 기능을 한다.
4. Referee: 심판을 의미하고, 사용자가 입력한 숫자가 컴퓨터가 정한 숫자와 같은 지 판단한다. 또한, 판단한 결과(힌트)를 발표(출력)한다.

'기능정의서'에 명시된 컴퓨터(상대방)은 Pitcher와 Referee를 합친 개념이다. 컴퓨터(상대방)가 하는 일이 1에서 9까지 서로 다른 임의의 수 3개를 선택하고, 게임 플레이어가 입력한 숫자에 대한 결과를 출력하는 것인데, 그 기능들을 프로그램 안에서는 Pitcher와 Referee가 나눠서 하기 때문이다.

'기능정의서'에 명시된 게임 플레이어는 Hitter와 같은 개념이다. 

## 기능목록

1. 게임(Game)을 시작하는 기능.
2. 투수(Pitcher)가 3개의 공을 던지는 기능. 즉, 임의의 서로 다른 3자리 숫자를 정하는 기능.
3. 타자(Hitter)가 3번 방망이를 휘두르는 기능. 즉, 콘솔을 통하여 사용자의 입력을 받는 기능.
4. 심판(Referee)이 타자(Hitter)가 투수(Pitcher)의 공을 얼마나 쳤는 지 판단하는 기능. 즉, 투수(Pitcher)가 정한 3자리 숫자와 사용자가 입력한 3자리 숫자가 같은 지, 혹은 얼마나 유사한 지 판단하는 기능.
5. 심판(Referee)이 타자(Hitter)와 투수(Pitcher)의 경합 결과를 발표하는 기능. 즉, 결과를 출력하는 기능.
6. 타자(Hitter)가 승리하지(맞추지) 못할 경우, 승리할 때까지 반복하는 기능.
7. 타자(Hitter)가 승리할 경우, 게임을 다시 할 지, 완전히 종료할 지 정하는 기능.