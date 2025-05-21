import java.util.Scanner;

public class Q2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inp = input.nextLine();
        String op = inp.replace(" ", "_");
        System.out.printf("==========\nInput: %s\nOutput: %s\n==========\n", inp, op);
    }
}