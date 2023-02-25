abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {}
}
class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x="+x+",y="+y+"]");
    }
    void stimPack(){}
}
class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank[x="+x+",y="+y+"]");
    }
    void changeMode(){}
}
class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship[x="+x+",y="+y+"]");
    }
    void load(){}
    void unload(){}
}

public class _17_Abstract2 {
    //여러 클래스에 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나
    //공통 부분을 뽑아서 추상클래스를 만든다.
    public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new Dropship()};
        for (int i = 0 ; i < group.length; i++)
            group[i].move(100, 200);
    }
}
