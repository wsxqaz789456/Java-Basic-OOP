class Data_1 {
    int value;
    //생성자가 없기 때문에 컴파일러가 자동으로 생성자를 추가해줌
    //Data_1(){}
}

class Data_2 {
    int value;

    Data_2() {} //기본생성자를 추가하지 않을 경우 아래에 생성자가 존재하므로 컴파일러가 자동으로 기본 생성자를 추가하지 않음.
    Data_2(int x){
        value = x;
    }
}
class Car {
    String color;
    String gearType;
    int door;
    Car(){}
    Car(String c, String g, int d){
        //매개변수가 존재하는 생성자
        color = c;
        gearType = g;
        door = d;
    }
}
class Who {
    String name;
    int age;

    // 생성자 생성(클래명과 같게 한다)
    public Who(String name, int age) {
        this.name = name; // this는 클래스 Who를 가리키고 보통 입력인자와 클래스 변수가 같을 시 사용
        this.age = age;
    }

    public void present() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}
public class _06_Constructor {

    //생성자 : 인스턴스가 생성될 대마다 호출되는 '인스턴스 초기화 메서드'
    //iv 초기화 메서드
    //이름이 클래스 이름과 같아야한다.
    //리턴값이 없다.(void 안붙음)
    //모든 클래스는 반드시 1개 이상의 생성자를 가져야 한다.
    public static void main(String[] args){
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(); // 기본 생성자가 없기 때문에 에러가 발생함.
        Who man = new Who("정호",19);
        Who woman = new Who("유미",20);
        Car c = new Car("white", "auto", 4);
        man.present();
        woman.present();
    }


}
