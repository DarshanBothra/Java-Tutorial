public class Comparison {
    public static void main(String args[]){
        int a = 10;
        int b = 2;

        // Equality
        System.out.printf("%d == %d: %b\n", a, b, a==b);
        
        // Greater than
        System.out.printf("%d > %d: %b\n", a, b, a>b);

        // Greather than equal to 
        System.out.printf("%d >= %d: %b\n", a, b, a>=b);

        // Greater than
        System.out.printf("%d < %d: %b\n", a, b, a<b);

        // Greather than equal to 
        System.out.printf("%d <= %d: %b\n", a, b, a<=b);

        // Not equal to 
        System.out.printf("%d != %d: %b\n", a, b, a!=b);
    }
}
