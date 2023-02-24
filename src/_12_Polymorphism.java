class Car2 {
    String color;
    int door;

    void drive(){
        System.out.println("drive~");
    }
    void stop(){
        System.out.println("stop");
    }
}
class FireEngine extends Car2 {
    void water(){
        System.out.println("water~~~");
    }
}

public class _12_Polymorphism {
    //다형성
    //여러 가지 형태를 가질 수 있는 능력
    //조상 타입 참조 변수로 자손 타입 객체를 다루는 것
    //자손 타입의 참조변수로 조상 타입의 갱체를 가리킬 수 없다.
    //Tv      t = new SmartTv();   가능
    //SmartTv s = new Tv();        불가능
    public static void main(String[] args){
        Car2 car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
//      car.water(); // 에러. Car 타입의 참조변수

        fe2 = (FireEngine) car;
        fe2.water();
    }

}
