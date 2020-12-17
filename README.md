#   미션 - 숫자 야구 게임 by 박병욱

## 🛠️ 구현할 기능 목록

- **1에서 9까지 서로 다른 임의의 수 3개를 정하는 기능** 
  - 사용자가 맞춰야할 3자리 컴퓨터 숫자를 랜덤으로 뽑는다.
  - 3자리 숫자는 양수고, 각 숫자는 중복되지 않는다. 
- **사용자로부터 3자리수를 입력받는 기능**
  - **[예외] 입력값이 숫자인지 체크**
  - **[예외] 입력값이 0이거나 음수인지 체크**
  - **[예외] 입력 숫자가 3자리 수인지 체크**
  - **[예외] 각 자리 숫자가 중복되지 않는지 체크**
  - **[예외] 각 자리 숫자의 범위가 1에서 9인지 체크**
- **입력받은 3자리 숫자가 정답인지 검사하는 기능**
  - 컴퓨터 숫자와 사용자 입력 숫자 비교 결과는 스트라이크, 볼, 낫싱으로 표현된다.
    - 볼 : 다른 자리에 같은 숫자가 있는 경우, 볼 + 1
    - 스트라이크 : 같은 자리에 같은 숫자가 있는 경우, 스트라이크 + 1
    - 낫싱 : 같은 숫자가 하나도 없는 경우
  - 볼 또는 스트라이크가 있다면 볼, 스트라이크 순으로 개수를 출력한다.
  - 볼과 스트라이크가 모두 없다면 "낫싱"을 출력한다.
- **사용자가 입력한 숫자가 정답일 경우 종료하고 새로운 입력을 받아 게임을 진행하는 기능**
  - 3 스트라이크일 경우 정답이고, 정답 메세지를 출력한다.
  - 정답을 맞추면 게임이 종료되고, 게임을 다시 시작할지 묻는 메세지를 출력한다.
  - 새로운 게임 시작에 대한 값 1(새로시작) 또는 2(종료)를 입력 받는다.
    - 입력이 1일경우 새로운 게임을 진행한다.
    - 입력이 2일경우 프로그램을 종료한다.
    - **[예외] 입력이 1 또는 2가 아닐 경우를 체크** 

