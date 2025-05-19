public class Logical {
    public static void main(String args[]){
        boolean b1 = true;
        boolean b2 = false;

        // Logical And
        System.out.printf("%b AND %b = %b\n", b1, b2, b1 && b2);

        // Logical Or
        System.out.printf("%b OR %b = %b\n", b1, b2, b1 || b2);

        // Logical Not
        System.out.printf("Not %b = %b\n", b1, !b1);
    }
}
