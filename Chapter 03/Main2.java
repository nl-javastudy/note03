// try catch
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


public class Main2 {
    public static void main(String[] args) {
        try{
            Test e = new Test();
            e.printLen();
            e.printStr();
            e.isA();
        } catch (NullPointerException e){
            System.out.println("NullPointerException!!");
        }
        // NullPointerException!!
    }
}