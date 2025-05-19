import java.util.Scanner;
public class Q3{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int my_number = 19;
        System.out.print("Enter an integer: ");
        int user_number = input.nextInt();

        System.out.printf("Given Number > User Number: %b\n", my_number > user_number);
    }
}