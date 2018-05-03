// 메서드
package ex3

int plus(int a, int b) {
    return a + b;
}

def plus2(a, b) {
    a + b
}

println plus (100, 200)
println plus2 (100, 200)

// 메서드를 호출할 떄 갈호 없이 파라미터 값을 전달 할 수 있다.
sum = plus 100, 200
println sum

sum = plus2 100, 200
println sum