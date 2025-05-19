import java.util.Scanner;

public class Q3{
    public static void main(String args[]){
        // Take user input name from user and greet
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.printf("Hello %s, have a good day!\n", name);

    }
}