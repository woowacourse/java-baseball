# 우테코 Precourse 과제1: Java-Baseball by tiroriong09

## 0. 임시 메모
* 자바 개발환경구축에 실패하여 잠정적으로 파이썬으로 소스코드 구현. [해결]
* 한 메서드 안에서 다른 클래스의 메서드를 호출하는 법 익혀서 printOut메서드에 적용해야 함. [적용함]
* 메인 메서드에 전체 프로그램의 흐름, 메서드들 호출구조 정리. [정리]
* resource leak문제 해결법: 사용자입력받기위해 `Scanner`클래스를 import하고, 새 인스턴스를 만들어줬는데, 닫아줘야한다고 함.
* 사용자 입력받는 메서드 `newGameQuery`의 유효성검사 해줘야함. [기능추가]

## 1. 구현할 기능 목록
13. 스트라이크와 볼 갯수 처리 기능 관련한 클래스 `StrikeBall` 생성.
14. 사용자 입력 기능 관련한 클래스 `User` 생성.
15. 컴퓨터 출제 기능 관련한 클래스 `Cpu` 생성.
16. 사용자에게 결과값 출력 기능 관련한 클래스 `Result` 생성.
1. 사용자 입력과 컴퓨터 숫자를 배열형식으로 입력받아 스트라이크와 볼의 갯수를 배열로 반환하는 메서드 `StrikeBall.Count` 생성.
2. 사용자 입력을 받아 각자리를 배열형식으로 출력하는 메서드 `User.getAnswer` 생성.
3. 사용자 입력 유효성을 검사하는 `User.getValidAnswer` 생성.[정수인지 판별]
4. 사용자 입력 유효성을 검사하는 `User.getValidAnswer2` 생성. [1~9 사이 서로다른 세자리 수인지 판별]
5. 1~9 사이 정수를 랜덤으로 생성하는 메서드 `Cpu.getRandomNum` 생성.
6. 컴퓨터의 세자리 숫자를 생성하는 메서드 `Cpu.makeAnswer` 생성.
7. 스트라이크와 볼의 갯수에 따른 결과메세지를 출력하는 메서드 `Result.print` 생성.
8. `StrikeBall.Count`의 인덴트 뎁스2 제한조건 초과에 따라 if절 기능분리를 위해 메서드 `StrikeBall.existStrike`, `StrikeBall.existBall` 생성.
9. 답을 맞춘 경우, 새 게임을 시작할 지, 프로그램을 종료할 지 묻는 메서드 `Result.newGameQuery` 생성.
11. 사용자 입력받는 메서드 `newGameQuery`의 유효성 검사 기능 추가. [1과 2만 입력가능 조건]
10. 각 메서드들이 리턴할 결과값들을 저장할 클래스 변수들을 생성.
12. 각 메서드의 정상작동여부를 테스트하는 테스트 클래스를 따로 만든다.
17. 사용자가 시도한 횟수를 기록하는 기능 추가.
18. UI가독성 개선.

## 2. 까먹기 쉬운 코딩컨벤션들
* 인덴트 뎁스 2 이하 유지
* 각 줄 80자 이하
* 주석처리에 관한 사항.(문서주석, 구현주석)
* 명명규칙: 패키지, 클래스, 메서드, 변수
* 클래스 변수에 public 쓰지않는 간접호출 방식 사용.(메서드로 꺼내쓰기) 
* Wildcard imports are not used
* 들여쓰기는 space방식 & tab방식 둘 중 하나로 통일