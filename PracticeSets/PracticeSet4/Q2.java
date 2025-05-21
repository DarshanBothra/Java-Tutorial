import java.util.Scanner;

public class Q2{
    public static void main(String args[]){
        int sub1, sub2, sub3, total;
        float avg;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Marks (/100): ");
        sub1 = input.nextInt();
        System.out.print("Enter Marks (/100): ");
        sub2 = input.nextInt();
        System.out.print("Enter Marks (/100): ");
        sub3 = input.nextInt();

        total = (sub1 + sub2 + sub3);
        avg = (float)total/3f;

        if (
            (avg >= 40) &&
            (sub1 >= 33) &&
            (sub2 >= 33) &&
            (sub3 >= 33)
        ){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }
}