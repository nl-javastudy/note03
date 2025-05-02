// NullPointerException은 주소가 없는 null인 객체를 참조하려고 할 때 발생하는 에러이다.
class Test{
    private String a;
    void printLen(){
        System.out.println(a.length());
    }
    void printStr(){
        System.out.println(a.toString());
    }
    boolean isA(){
        return a.equals("A") ? true : false;
    }
}


public class Main {
    public static void main(String[] args) {
        Test e = new Test();
        e.printLen();
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "this.a" is null
        e.printStr();
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "this.str" is null
        e.isA();
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "this.a" is null
    }
}
