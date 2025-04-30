public class Wrapper {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(100);
        Double d1 = Double.valueOf(3.14);
        Boolean b1 = Boolean.valueOf(true);

        int n1 = num1.intValue();
        double d2 = d1.doubleValue();
        boolean b2 = b1.booleanValue();

        Integer num2 = 200;
        Double d3 = 2.718;
        Boolean b3 = false;

        int n2 = num2;
        double d4 = d3;
        boolean b4 = b3;

        System.out.println("명시적 박싱 결과:");
        System.out.println("num1: " + num1);
        System.out.println("d1: " + d1);
        System.out.println("b1: " + b1);

        System.out.println("\n명시적 언박싱 결과:");
        System.out.println("n1: " + n1);
        System.out.println("d2: " + d2);
        System.out.println("b2: " + b2);

        System.out.println("\n오토박싱 결과:");
        System.out.println("num2: " + num2);
        System.out.println("d3: " + d3);
        System.out.println("b3: " + b3);

        System.out.println("\n언박싱 결과:");
        System.out.println("n2: " + n2);
        System.out.println("d4: " + d4);
        System.out.println("b4: " + b4);
    }
}   