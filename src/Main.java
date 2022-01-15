
public class Main {
    public static void main(String args[]) {
        // 인스턴스 생성
        MyClass my1 = new MyClass();


        // 메소드 호출
        my1.method1();
        my1.method2(10);
    }
}
 class MyClass {
    public void method1() {
        System.out.println("method1이 실행됩니다.");
    }
    public void method2(int x) {
        System.out.println(x + " 를 이용하는 method2입니다.");
    }
}