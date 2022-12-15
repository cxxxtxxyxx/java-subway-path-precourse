## 기능 요구 사항

- [ ] 프로그램 시작 시 역, 노선 구간 정보를 초기 설정 해야 한다.
- [ ] 출발역과 도착역을 입력받아 경로를 조회한다.
- [ ] 경로 조회 시 총 거리, 총 소요 시간도 함께 출력한다.
- [ ] 경로 조회 기준은 🔥최단 거리🔥, 🔥최소 시간🔥이 있다.
  - [ ] ERROR 처리 -> [ERROR]를 붙여서 출력한다.
    - [ ] 경로 조회 시 출발역과 도착역이 같으면 에러를 출력한다.
    - [ ] 경로 조회 시 출발역과 도착역이 연결되어 있지 않으면 에러를 출력한다.
      - [ ] 에러 발생 시 에러를 출력하고, 경로 기준을 설정하는 부분으로 돌아간다.
    - [ ] 그 외 정상적으로 프로그램이 수행되지 않은 경우 에러를 출력한다.


## 프로그래밍 요구사항

- [ ] 코드 컨벤션을 지키며 프로그래밍 한다.
- [ ] indent의 depth는 2까지만 허용한다.
- [ ] 3항 연산자를 사용하지 않는다.
- [ ] else 예약어를 사용하지 않는다.
- [ ] 메소드는 15라인이 넘지 않도록 구현한다.
---
- Application Class
  - [ ] Application의 패키지 구조를 변경하지 않는다.
  - [ ] Application 클래스에 있는 Scanner를 사용하고 별도의 Scanner 객체를 만들지 않는다.
- Station, Line Class
  - [ ] 기본 생성자를 추가할 수 없다.
  - [ ] name 인스턴스 변수의 접근 제어자를 변경할 수 없다
  - [ ] 가능하면 setter 메소드를 추가하지 않고 구현한다.
- StationRepository, LineRepository Class
  - [ ] Station과 Line의 상태를 저장할 수 있는 StationRepository, LineRepository를 제공한다.
  - [ ] 필요 시 StationRepository, LineRepository 이 외 추가로 Repository를 만들 수 있다.
  - [ ] 추가로 생성되는 객체에 대해서 XXXRepository 네이밍으로 저장 클래스를 추가한다.
  - [ ] 객체들의 상태를 관리하기 위해서 XXXRepository 클래스를 활용해 저장 로직을 구현해야 한다.
  - [ ] 작성된 메서드는 수정할 수 없고, 필요에 따라 메서드를 자유롭게 추가할 수 있다.
---
- 최단경로 라이브러리 jgrapht
  - jgrapht 라이브러리를 활용하면 간편하게 최단거리를 조회할 수 있음
  - 최단 거리 기준 조회 시 가중치를 거리로 설정
  - 최소 시간 기준 조회 시 가중치를 시간으로 