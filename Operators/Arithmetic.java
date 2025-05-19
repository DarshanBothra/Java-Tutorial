public class Arithmetic{
    public static void main(String args[]){
        // Arithmetic Operators
        int a, b;
        a = 10;
        b = 2;

        // Addition
        System.out.printf("%d + %d = %d\n", a, b, a+b);

        // Subtraction
        System.out.printf("%d - %d = %d\n", a, b, a-b);

        // Multiplication
        System.out.printf("%d x %d = %d\n", a, b, a*b);

        // Division 
        System.out.printf("%d ÷ %d = %f\n", a, b, (float)a/(float)b);

        // Modulus 
        System.out.printf("%d mod %d = %d\n", a, b, a%b);

        // Exponent
        System.out.printf("%d ^ %d = %d\n", a, b, (int)Math.pow(a, b));

        // Increment
        System.out.printf("%d ++ = %d (Updated in the next line)\n", a, a++);

        // Increment
        System.out.printf("++ %d = %d\n", a, ++a);

        // Decrement
        System.out.printf("%d -- = %d (Updated in the next line)\n", a, a--);

        // Decrement
        System.out.printf("-- %d  = %d\n", a, --a);

        

    }
}