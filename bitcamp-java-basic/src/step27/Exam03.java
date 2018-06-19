// 람다(lambda) - 익명 클래스 와 람다 표현식
package step27;

import step27.Exam01.Player;

public class Exam03 {

    static interface Player {
        void play();
    }
    
    static void testPlayer(Player player) {
        player.play();
    }
    public static void main(String[] args) {
        // 간단한 인터페이스 구현체 조차 다음과 같이 따로 정의하여 사용하면 매우 불편하다.
        /*
        Player player = new Player() {
            @Override
            public void play() {
                System.out.println("실행~~~~~");
            }
        };
        */
        // 다음과 같이 아규먼트 부분에 바로 익명 클래스를 정의하는 코드를 두면
        // 코드를 해석하기 편하다.
        testPlayer(new Player() {
            @Override
            public void play() {
                System.out.println("실행~~~~~");
            }
        });
        
        // lambda 표현식도 아규먼트 자리에 바로 넣으면 편하다.
        testPlayer(() -> System.out.println("실행~~~~~"));
    }
}
