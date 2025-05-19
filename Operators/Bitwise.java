public class Bitwise {
    public static void main(String args[]){
        int a = 10;
        int b = 5; 

        // bitwise operators convert the numbers to binary and then perform the operations on every bit then return the combined result

        // Bitwise AND
        System.out.printf("%d * %d: %d\n", a, b, a &b);

        // Bitwise OR
        System.out.printf("%d + %d: %d\n", a, b, a | b);
    }
}
