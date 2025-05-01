// NullPointerException은 주소가 없는 null을 참조하였을 때 발생하는 에러이다.
class ErrorTest{
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
        ErrorTest e = new ErrorTest();
        e.printLen();
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "this.a" is null
        e.printStr();
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "this.str" is null
        e.isA();
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "this.a" is null
    }
}