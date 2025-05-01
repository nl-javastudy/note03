// if문
class Test2{
    private String a;
    void printLen(){
        if (a != null)
            System.out.println(a.length());
    }
    void printStr(){
        if (a != null)
            System.out.println(a.toString());
    }
    boolean isA(){
        if (a != null)
            return a.equals("A") ? true : false;
        else
            return false;
    }
}


public class Main3 {
    public static void main(String[] args) {
        Test2 e = new Test2();
        e.printLen();
        e.printStr();
        e.isA();
    }
}