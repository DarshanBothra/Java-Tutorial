import java.util.Scanner;

public class Q6{
    public static void main(String args[]){
        System.out.print("Enter a URL: ");
        Scanner input = new Scanner(System.in);

        String url = input.nextLine();

        if (url.endsWith(".com")){
            System.out.println("Commercial Website");
        }

        else if (url.endsWith(".in")){
            System.out.println("Indian Website");
        }

        else if (url.endsWith(".org")){
            System.out.println("Organization Website");
        }
    }
}