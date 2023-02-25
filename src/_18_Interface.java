abstract class Unit2 {
    int x, y;
    abstract void move(int x, int y);
    void stop() { System.out.println(("멈춤"));}
}
interface Fightable {// 인터페이스의 모든 메서드는 public, abstract.
    void move(int x, int y);
    void attack(Fightable f);
}

class Fighter extends Unit2 implements Fightable {
    //오버라이딩 규칙 : 조상(public)보다 접근제어자의 범위가 좁으면 안된다.
    public void move(int x, int y) {
        System.out.println("["+x+","+y+"]로 이동");}

    public void attack(Fightable f) {
        System.out.println(f+"를 공격");
    }
}


public class _18_Interface {
    public static void main(String[] args) {
//      Fighter f = new Fighter();
        Fightable f = new Fighter();
        f.move(100, 200);
        f.attack(new Fighter());
    }

    //인터페이스란? 추상 메서드의 집합.
    //구현 된 것이 전혀 없는 설계도. 껍데기(모든 멤버가 public)
    //인터페이스와 추상메서드의 차이점은 인터페이스는 iv를 가질 수 없다.
    //인터페이스의 조상은 인터페이스만 가능(Object가 최고 조상 아님)
    //다중 상속이 가능함. (추상메서드는 충돌해도 문제 없음)
    //class 클래스 이름 implements 인터페이스 이름{
    //          인터페이스에 정의도니 추상메서드를 모두 구현해야함.
    //}
    //일부만 구현하는 겨우 클래스 앞에 abstract를 붙여야함
}
