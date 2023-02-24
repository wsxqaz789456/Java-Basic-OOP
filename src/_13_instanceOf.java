class t {
    public void show() {
        System.out.println("T출력");
    }
}

class tt extends t {
    public void show2() {
        System.out.println("TT출력");
    }
}

class ttt extends tt {
    public void show3() {
        System.out.println("TTT출력");
    }
}
public class _13_instanceOf {

    //참조변수의 형변환 가능여부 확인에 사용. 가능하면 true 반환
    //형변환 전에 반드시 instanceof로 확인해야함.
    public static void main(String[] args) {
        t t1 = new t();
        tt t2 = new tt();
        ttt t3 = new ttt();

        showT(t1);
        showT(t2);
        showT(t3);
    }

    public static void showT(t var) { // 부모 거점으로 입력
        if (var instanceof ttt) { // 이 참조 변수가 참조하는 ttt가 t의 상속자이면 true반환
            ((ttt) var).show3(); // ttt로 강제 형변환
        } else if (var instanceof tt) {
            ((tt) var).show2();
        } else {
            var.show();
        }
    }
}
