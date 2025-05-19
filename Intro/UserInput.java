import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter Your age: ");
        // int age = input.nextInt();
        // System.out.printf("You are %d years old\n", age);

        // System.out.print("Enter your name: ");
        // String name = input.nextLine();
        // System.out.printf("Hello, %s!\n", name);
        
        System.out.print("Enter Your age: ");
        boolean b1 = input.hasNextInt();
        System.out.printf("%b\n", b1);
        
    }
}
