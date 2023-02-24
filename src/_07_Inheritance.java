class Mypoint{
    int x;
    int y;
}
class Circle extends Mypoint{ //상속
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
