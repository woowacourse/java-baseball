# 미션 - 숫자 야구 게임

<br>

## 🖥️ 구현 기능 목록

1. 사용자로부터 숫자를 입력받는 기능을 만든다.

1. 1 ~ 9의 서로 다른 세 자리 정수가 아닌 다른 모든 입력에 대해서는 IllegalArgumentException을 발생시킨다.

1. RandomUtils를 사용해 컴퓨터의 서로 다른 랜덤 3자리 정수를 만들어내는 기능을 만든다.

1. 사용자가 숫자를 입력했을 때, 컴퓨터의 숫자와 비교하여 결과(힌트)를 판단하는 기능을 만든다. <br>
(사용자가 컴퓨터의 숫자를 맞추지 못하는 동안 [과정 3번]을 무한 반복하도록 만든다.)

1. 3스트라이크의 결과가 나왔을 때, 새로 시작할지, 종료할지 물어본다. 입력이 1이면 새로 시작하고, 2이면 게임을 종료한다. <br>
(그 외의 입력에 대해서는 모두 IllegalArgumentException을 발생시킨다.)

1. 테스트 코드 작성

    - 사용자가 입력 조건 이외의 입력을 하면 IllegalArgumentException을 발생시키는지 테스트.
        - 사용자가 올바른 입력을 했을 때의 정상 작동 테스트.
    
    - 컴퓨터가 조건에 맞는 숫자들을 생성하는지 테스트.
    
    - 사용자가 입력한 숫자와 컴퓨터가 생성한 숫자에 대한 올바른 결과가 나오는지 테스트.
    
    - 사용자가 컴퓨터의 숫자를 맞추지 못하면 사용자에게 새로운 숫자의 입력을 받는지 테스트.
    
    - 사용자가 컴퓨터의 숫자를 맞추지 못해, 사용자에게 새로운 숫자의 입력을 받기 직전에, <br>
      직전 결과를 모두 리셋하는지 테스트.
    
    - 3스트라이크의 결과가 나왔을 때, 정답 메시지를 출력하는지 테스트.
    
    - 정답을 맞췄을 때, 사용자에게 재시작 또는 종료를 물어보는지 테스트.
    
    - 사용자의 재시작 또는 종료에 대한 입력이 1 또는 2가 아니면 IllegalArgumentException을 발생시키는지 테스트.
    
        - 입력이 1이면 컴퓨터가 새로운 숫자를 생성하는지 테스트.
    
        - 입력이 2이면 프로그램이 종료되는지 테스트.
    
1. 클린코드 리팩토링

    - 자바 코드 컨벤션을 지키면서 프로그래밍했는가?
    
    - 한 메서드에 오직 한 단계의 들여쓰기(indent)만 허용했는가?
    
    - else 예약어를 쓰지 않았는가?
    
    - 모든 원시값과 문자열을 포장했는가?
    
    - 콜렉션에 대해 일급 콜렉션을 적용했는가?
    
    - 3개 이상의 인스턴스 변수를 가진 클래스를 구현하지 않았는가?
    
    - DTO를 제외하고 getter/setter 없이 구현했는가?
    
    - 메소드의 인자 수를 3개까지 제한했는가?
    
    - 디미터(Demeter)의 법칙(“친구하고만 대화하라”)을 지켰는가?
    
    - 메소드가 한가지 일만 담당하도록 구현했는가?
    
    - 클래스를 작게 유지하기 위해 노력했는가?
<br>
