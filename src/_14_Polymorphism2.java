class Product {
    int price;
    int bonusPoint;
    Product(int price){
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}
class Tv1 extends Product {
    Tv1(){
        super(100);
    }
    //Object클래스의 toString()을 오버라이딩한다.
    public String toString() { return "Tv";};
}

class Computer extends Product {
    Computer(){ super(200);}
    //Object클래스의 toString()을 오버라이딩한다.
    public String toString() {return "Computer";}
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;              //가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;    // 제품의 보너스 점수를 추가한다.
        System.out.println(p.toString() + "을/를 구입하셨습니다.");
    }

}
public class _14_Polymorphism2 {
    public static void main(String[] args){
        Buyer b = new Buyer();

        Product p = new Tv1();
        b.buy(new Tv1());     // buy(Product p)
        b.buy(new Computer());// buy(Product p)

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는" + b.bonusPoint +"점입니다.");
    }
}
