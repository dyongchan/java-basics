Java의 Data type(자료형)
: 데이터의 종류와 크기를 지정
- 숫자 or 문자 / 범위의 지정을 고민 후 선언
- 변수나 상수는 자료형을 먼저 선언

Variable(변수)
: 값의 저장공간, 필요시 값 변경
- 자료형 선언 후 변수 이름 선언 시 java프로그램이 자동으로 인지

Constant(상수)
: 값의 저장공간, 저장된 값을 변경할 수 없으며 고정 데이터 유지
- ex) PI 값이 3.14 와 같이 고정값 유지가 필요할 경우 사용

Literal(리터럴)
: 변수나 상수를 저장하는 값 그 자체를 의마한다 (ex 'A',123)

Data type의 유형
1. Primitive Type (기본 자료형) : 실제 값의 저장
2. Reference Type (참조 자료형) : Primitive 이외의 모든 데이터 타입
- Reference Variable 은 객체에 대한 "handle"(메모리 주소)을 갖고 있다.

1. Primitive Type
- Integral : byte / short / int(기본타입) / long
- Boolean
- Floating-point : float / double(기본타입)

2. Reference Type : 
- String : 문자열
- Array : 배열 (동일 또는 다른 타입들을 모아놓을 수 있음)
- etc...

Data 저장 범위
java는 Data type 마다 다른 bit수를 가진다.
- bit : (-2^-1 ~ 2^-1 -1)의 범위를 가짐 (0의 표현)
- 가장 왼편의 bit는 sign bit로 예약 되어 있다.