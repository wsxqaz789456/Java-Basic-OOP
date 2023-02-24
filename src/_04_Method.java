class MyMath{
    void printGugudan(int dan) {
        for(int i=1;i<=9;i++){
            System.out.printf("%d * %d = %d%n",dan, i, dan *i);
        }
    } // 구구단 메소드
    long add(long a, long b) {
        long result = a + b;
        return result;
    }
    long subtract(long a, long b) { return a-b; }
    long multiply(long a, long b) { return a * b;}
    double divide(double a, double b) { return a / b;}
}
public class _04_Method {
    public static void main(String args[]){
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        mm.printGugudan(3); // 구구단 3단 출력

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
