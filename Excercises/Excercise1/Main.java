import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        // Excercise 1: CBSE Board Percentage Calculation

        Scanner input = new Scanner(System.in);

        byte mark1, mark2, mark3, mark4, mark5;
        int total;

        System.out.print("Enter marks of Subject 1 (?/100): ");
        mark1 = input.nextByte();

        System.out.print("Enter marks of Subject 2 (?/100): ");
        mark2 = input.nextByte();

        System.out.print("Enter marks of Subject 3 (?/100): ");
        mark3 = input.nextByte();

        System.out.print("Enter marks of Subject 4 (?/100): ");
        mark4 = input.nextByte();

        System.out.print("Enter marks of Subject 5 (?/100): ");
        mark5 = input.nextByte();

        total = mark1 + mark2 + mark3 + mark4 + mark5;

        float avg = (float)total/5;
        System.out.print("You have scored: ");
        System.out.println(avg);
    }
}