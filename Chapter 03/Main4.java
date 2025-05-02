import java.util.*;
// Wrapper 클래스 optional = null인 값을 참조해도 NullPointerException이 발생하지 않도록 값을 래퍼로 감싸주는 타입 (호출 전에 null 체크를 자동으로 해줌)
class Test2{
    private Optional<String> a = Optional.empty(); //비어있는 optional 객체 생성
    void printLen() {
        System.out.println(a.map(str -> str.length()).orElse(0)); // map = Optional 객체 내부의 값을 변환하여 결과를 새로운 Optional 객체로 반환.
    }
    void printStr() {
        System.out.println(a.orElse("null").toString()); // orElse = Optional 객체가 비어있다면, 전달된 기본값 other를 반환.
    }
    boolean isA() {
        return a.map(val -> val.equals("A")).orElse(false);
    }
}


public class Main4 {
    public static void main(String[] args) {
        Test2 e = new Test2();
        e.printLen();
        e.printStr();
        System.out.println(e.isA());
        // 0
        //null
        //false
    }
}
