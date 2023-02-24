class Time{
    private int hour;  //0~23사이의 값을 가져야함.
    private int minute; //0~60사이의 값을 가져야함.
    private int second; //0~60사이의 값을 가져야함.
    public void setHour(int hour){
        if(hour <0 || hour > 23) return;
        this.hour = hour;
    }
    public int getHour() {return hour;}

}

public class _11_Encapsulation {
    //캡슐화와 접근 제어자
    //변수에 직접 접근 하는 것을 막고, 메소드를 통해서 간접 접근을 허용.
    //외부에는 불필요한, 내부적으로만 사용되는, 부분을 감추기 위해서.
    public static void main(String[] args){
        Time t = new Time();
        t.setHour(21);
        System.out.println(t.getHour());

    }
}
