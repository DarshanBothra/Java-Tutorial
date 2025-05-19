import java.util.Scanner;
public class Q5{
    public static void main(String args[]){
        // Detect if the number entered by the user is an integer or not
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Something: ");
        boolean check = input.hasNextInt();
        System.out.printf("Is Integer: %b", check);

    }
}