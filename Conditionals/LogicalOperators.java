public class LogicalOperators {
    public static void main(String args[]){
        boolean a = true;
        boolean b = false;

        System.out.printf("a: %b\nb: %b\n", a, b);
        System.out.printf("==========\na AND b: %b\n", a && b);
        System.out.printf("a OR b: %b\n", a || b);
        System.out.printf("NOT a: %b\n==========\n", !a);
    }
}
