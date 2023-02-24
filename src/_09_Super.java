class Parent {
    int x = 10;
}
class Child extends Parent {
    int x = 20;
    void method(){
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
        //super() - 조상의 생성자
        //조상의 생성자를 호출할 때 사용
        //조상의 멤버는 조상의 생성자를 호출해서 초기화
    }
}
public class _09_Super {
    public static void main(String[] args){
        Child c = new Child();
        c.method();
    }
}
