package step11.ex09;

public class Exam04 {
    
    // Sedan과 Truck의 모델명과 cc를 출력하라!
    
    // 다형적 변수가 없다면?
    public static void printSedan(Sedan sedan) {
        System.out.printf("모델명 : %s\n", sedan.model);
        System.out.printf("cc : %d\n", sedan.cc);
        System.out.println("----------------------");
    }
    
    public static void printTruck(Truck truck) {
        System.out.printf("모델명 : %s\n", truck.model);
        System.out.printf("cc : %d\n", truck.cc);
        System.out.println("----------------------");
    }

    // 다형적 변수를 사용하게 되면 동일한 코드를 갖고 있는 위의 메서드를
    // 한 개의 메서드로 통합할 수 있다.
    // => 즉 Sedan 객체와 Truck 객체를 모두 가리킬 수 있는 레퍼런스를 선언하라!
    //    즉 두 클래스의 상위 클래스의 레퍼런스를 선언하면 된다.
    
    public static void printCar(Car car) {
        System.out.printf("모델명 : %s\n", car.model);
        System.out.printf("cc : %d\n", car.cc);
        System.out.println("----------------------");
    }
    
    public static void main(String[] args) {
        Sedan car1 = new Sedan();
        car1.model = "티코";
        car1.cc = 800;
        
        Truck car2 = new Truck();
        car2.model ="타이탄II";
        car2.cc = 10000;
        
        printSedan(car1);
        //printSedan(car2);
        
        printTruck(car2);
        
        printCar(car1);
        printCar(car2);

}
}
