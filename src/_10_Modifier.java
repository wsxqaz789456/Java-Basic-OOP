class MyParent {
    private int prv;  // 같은 클래스
    int dft;          // 같은 패키지
    protected int prt;// 같은 패키지 + 자손(다른패키지)
    public int pub;   // 접근제한 없음.
    public void printMembers() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}
public class _10_Modifier {
    //접근 제어자 public, protected, (default), private
    //그      외 static, final, abstract, native, transient, synchronized, volatile, strictfp
    //하나의 대상에 여러 제어자를 같이 사용하나 접근 제어자는 하나만, 작성시 접근 제어자를 가장 먼저 작성.
    //private 같은 클래스 내에서만 접근이 가능하다.
    //(default) 같은 패키지 내에서만 접근이 가능하다.
    //protected 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근 가능하다.
    //public 접근 제한이 전혀 없다.
    public static void main(String[] args) {
        MyParent p = new MyParent();
        //System.out.println(p.prv); //에러. 다른 클래스이기 때문에.
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);
    }
}
