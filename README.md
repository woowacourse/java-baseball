# 숫자야구 게임
## 기능구현 리스트

### 0. 숫자설정
- 프로그램이 시작하고 서로 다른 3개의 수를 Random으로 정한다.
    - RandomUtils클래스를 활용하여 구현한다.
- 숫자는 1~9 사이의 이다.


### 1. 입력
- 사용자로부터 숫자 3개 입력받는다.
    - 입력받는 숫자는 1~9의 숫자이다.
    - 세개의 수는 서로 다르다.
- 숫자가 아닌 입력이나 중복된 입력에 대해서는 IllegalArgumentException을 발생시킨다.


### 2. 힌트 출력
- 사용자의 입력을 받을 때 마다, 아래 세가지중 하나의 힌트를 받는다.  
    - 숫자는 존재하는데 순서가 틀린 경우 - 볼
    - 숫자가 존재하고 순서도 올바른 경우 - 스트라이크
    - 입력받은 숫자가 정답에 존재하지 않음 - 낫싱
- 볼의 갯수를 센다.
- 스트라이크의 갯수를 센다.
- 1볼 2스트라이크 의 형식으로 힌트를 출력한다.
    - 스트라이크와 볼이 둘 다 존재하면 볼을 먼저 출력한다.
    - 둘 다 해당사항이 없다면 낫싱을 출력한다.
    
    
### 3. 게임진행
- 3스트라이크가 될 때 까지 사용자에게 입력을 받고 힌트를 출력하는 과정을 반복한다.


### 4. 게임 종료
- 입력받은 숫자 3자리가 정답과 같은 경우 게임을 종료한다.
- 게임이 끝나면 1, 2의 숫자중 하나를 입력받는다.
    - 1 : 게임 재시작
    - 2 : 프로그램 종료


  
---
#### 구현 조건
- 자바 컨벤션을 준수한다.
    - 단, 들여쓰기는 4spaces로 한다.
- Indent depth는 최대 2까지 허용한다.
- 3항연산자를 쓰지 않는다.
- 하나의 함수가 하나의 역할을 하도록 최대한 작게 구현한다.
- System.exit 메소드를 사용하지 않는다.