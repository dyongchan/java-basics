Programing language : Java
JAVA의 특징
1. JDK (Java Development Kit) : 자바 개발 도구
- JVM, API, Complier, Tools, API document가 포함 됨

JRE (Java RunTime Enviroment) : 자바 실행 환경
- 자바 애플리케이션의 실행을 위한 최소한의 환경(.clss 파일이 동작)

JVM (Java Virtual Machine) : 자바 애플리케이션을 해석 및 로드,실행하는 가상머신

JDK >> JRE >> JVM
- oracle jdk 설치시 JRE JVM 모두 포함

2. 플랫폼 독립적 : OS마다 별도의 실행환경 제공
- ex) C language : 각각의 OS 마다 C언어의 컴파일러가 존재 : 모든 OS간 연동 불가능 (종속적)
- Java : JVM을 통해서만 통신을 하여 JVM이 OS와 통신하는 구조이다.
OS별로 JVM이 존재하여 설치되면 한 번 작성된 JAVA 애플리케이션은 OS 관계없이 실행가능하다.

3. Application / Applets
- Application : OS의 JVM을 통해 실행
- Applets : Browser bulit-in JVM을 통해 실행
(Browser 내애서의 Java 파일을 실행시키고 싶을 때, Applets을 개발)

4. 객체지향 언어(OOP : Object-Oriented Programing)
- 상속(Inheritance)
- 다형성(Ploymorphism)
- 캡슐화(Encapsulation)

5. 멀티쓰레드(Multi-thread)
- OS와 관계없이 구현가능하도록 API 제공

6. 네트워크와 분산처리를 지원
- 풍부하고 다양한 API를 지원하여 쉽고 빠르게 개발가능
- 네트워크를 통해 객체를 전송

7. 동적 클래스 로딩(Dynamic Class Loading)
- RunTime에 모든 프로그램(클래스)를 로딩하지 않고, 필요한 시점에 로드하여 사용가능
- 일부가 변경되어도 전체 프로그램을 컴파일 하지 않아도 됨

8. 풍부한 API(Application Programing Interface) 지원

9. 자동 메모리 관리(GC - Garbage Collection)
- 시스템 레벨에서 Garbage Collector Thread가 자동적으로 미사용 데이터를 메모리로 반환하여 메모리 관리 해준다. 
- 별도의 코드가 필요없어 메모리로 인한 System이 Crash되는 빈도가 감소

10. 프로그램 변환 과정
타언어 : Source code -> complier -> platform-Specific-executable binary code Program
Java : Source code(.java file) -> complier -> generic executable bytecode file(.class file) -> JVM

Java 개발환경 구축
1. oracle jdk 설치 (java11) / DMG install 및 설치
- SE : Standard Edition

2. jetbrain : intellij IDE

3. Java API Document
- java API (클래스 라이브러리) 의 설명 및 기능 사용법 확인 가능
- 지원하는 API의 범위 및 사용법 숙지를 통해 효율적인 코드작성이 가능