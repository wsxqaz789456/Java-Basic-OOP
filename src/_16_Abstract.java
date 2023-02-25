abstract class Player { //추상클래스
    abstract void play(int pos); //추상메서드
    abstract void stop();        //구현부(몸통, {})가 없는 메서드
}                                //꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우 사용.
class AudioPlayer extends Player {
    void play(int pos) { System.out.println(pos + "위치부터 play합니다.");} //상속받은 추상메서드에 기능 구현
    void stop() { System.out.println("재생을 멈춥니다.");}
}
public class _16_Abstract {
    //추상 클래스
    //추상 메서드({}가 없는)를 가지고 있는 클래스
    //다른 클래스 작성에 도움을 주기 위한 것이므로 인스턴스 생성이 불가능.
    public static void main(String[] args) {
        //player p - new Player(); // 에러.
        //상속을 통해 추상 메서드를 완성해야 인스턴스 생성가능
//      AudioPlayer ap = new AudioPlayer();
        Player ap = new AudioPlayer(); //다형성
        ap.play(100);
        ap.stop();
    }


}
