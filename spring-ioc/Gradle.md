#Gradle 사용법

## gradle 설정 파일 자동 생성

## gralde init
이 명령을 실행하면 gradle 관련 폴더와 설정파일들이 자동으로 생성된다.

.gradle 폴더
  - gradle을 실행할 때 사용하는 관련 파일들을 모아둔 폴더이다.
gradle 폴더
  - gradle 실행 파일을 둔 폴더이다.
build.gradle
  - gradle 설정파일
gradlew(unix/linux용), gradlew.bat(windows 용)
  - 사용자 pc에 gradle을 자동으로 다운로드 받아 설치하고 실행한다.
  - 즉 사용자 PC에 gradle이 설치되어 있지 않아도 실행할 수 있다.
settings.gradle
  - gradle 실행할 때 참조하는 폴더가 들어있다.

## gradle init --type [프로젝트명]
지정한 유형의 프로젝트 폴더 및 기본 파일들을 자동으로 생성한다.

## gradle tasks --all
gradle로 사용할 수 있는 모든 작업목록을 출력한다.


## plugin
gradle로 실행할 수 있는 작업들을 모아둔 라이브러리 이다.

````
방법 1:
apply plugin: 'java'

방법2:
plugins {
  id'java'
  id 'application'
}
````

### 'java' 플러그인
```
> gradle compileJava
- build/classes/java/main 폴더 생성
- src/main/java 폴더의 모든 자바 소스 파일을 컴파일하여 위에서 생성한 폴더에 넣는다.
```

```
> gradle compilTestJava
```
- compileClasses 작업을 먼저 수행한다.
- build/classes/java/test 폴더를 생성한다.
- src/test/ava 폴더의 모든 자바 소스 파이릉ㄹ 컴파일하여 위에서 생성한 폴더

> gradle clean

> gradle processResources 작업 수행
- build/resources/main

> gradle processTestResources 

## application plugin
자바 프로그램을 실행할 수 있는 작업이 들어 이싿.

```
gradle run
```
- classes 작업을 먼저 수행한다.
- mainClassName에 지정된 자바 클래스를 실행한다.

## 'eclipse' 플러그인

```
> gradle eclipseClasspath
```
- .classpath 생성

```
> gradle eclipseProject
```
- .project 생성

```
> gradle eclipseJdt
```
- JDT(Java Developement Tool)관련 생성 파일 및 폴더 생성
- .settings 폴더 및 파일 생성


```
> gradle eclipse
```

```
> gradle cleanEclipseClasspath
```
- .class
- eclipseClasspath + eclipse
# 프로젝트 폴더 준비
gradle을 이용하여 프로젝트 폴더 및 gradle 설정 파일을 자동으로 생성할 수 있다.