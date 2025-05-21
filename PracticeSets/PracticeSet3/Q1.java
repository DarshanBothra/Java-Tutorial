import java.util.Scanner;

public class Q1{
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String st = input.nextLine();
        String lower = st.toLowerCase();

        System.out.printf("==========\nOriginal String: %s\nLower Case String: %s\n==========\n", st, lower);
    }
}