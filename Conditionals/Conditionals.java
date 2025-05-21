import java.util.Scanner;

public class Conditionals{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age  > 18){
            System.out.println("You are an adult");
        }
        else if (age == 18){
            System.out.println("You just become an adult");
        }
        else{
            System.out.println("You are not an adult");
        }
    }
}