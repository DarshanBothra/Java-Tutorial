import java.util.Scanner;

public class Q5{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year <= 0){
            System.out.println("Invalid Year");
        }
        else{
            if (year%4 != 0){
                System.out.println("Not a leap year");
            }
            else{
                if (year%100 == 0 & year%400 != 0){
                    System.out.println("Not a leap year");
                }
                else{

                    System.out.println("Leap year");
                }

            }
        }
    }
}