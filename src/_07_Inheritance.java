class MyPoint{ //조상이 없을 경우 컴파일러에 의해 자동으로 Object를 상속받음
    int x;
    int y;
}
class Circle extends MyPoint{ //상속
    int r;
}
public class _07_Inheritance {

    public static void main(String[] args) {
        Circle c= new Circle();
        c.x = 1;
        c.y = 2;
        c.r = 3;
        System.out.println("c.x=" +c.x); //1
        System.out.println("c.y=" +c.y); //2
        System.out.println("c.r=" +c.r); //3

    }
}
