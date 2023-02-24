class Card {
    String kind; //instance variable (개별속성)
    int number; //iv

    static int width = 100;  //Class variable (공통속성)
    static int height = 250; //cv
}

public class _03_Object_Array {
    public static void main(String args[]) {
        System.out.println("Card.width = " + Card.width);  //cv를 호출시에는 클래스명을 입력
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Space";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind +", " + c1.number + "이며 크기는 "+ c1.width +", "+ c1.height +"입니다.");
    }
}
