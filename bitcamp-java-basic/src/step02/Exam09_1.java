// 배열 - 배열 선언과 사용
package step02;

public class Exam09_1 {
    public static void main(String[] args) {
        // 배열 사용 전
        int i1, i2, i3, i4, i5;

        // 배열선언
        int[] arr1 = new int[5];
        int arr2[] = new int[5]; // c-style
    
        // 배열 메모리에 접근
        arr1[0] = 100;
        arr1[1] = 200;
        arr1[2] = 300;
        arr1[3] = 400;
        arr1[4] = 500;

        // 유효하지 않는 인덱스
        arr1[5] = 600; // 컴파일 할 때는 인덱스가 유효한지 알 수 없다.
                       // 실행할 때 오류가 발생한다.
    }
}

// 배열?
// - 같은 종류의 메모리를 쉽게 만드는 방법
// - 문법
//   data_type[] 변수명 = new data_type[개수];
//   ex) int[] arr = new int[5];
// 배열 메모리에 접근
// - 문법
//   배열변수[인덱스] = 값;
//   ex) arr[0] = 100;
// - 배열의 인덱스는 0부터 시작한다.
// - 따라서 인덱스의 범위는 0 ~ (배열개수-1)이다.
