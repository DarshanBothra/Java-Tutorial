import java.util.Scanner;

public class SwitchCase{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (1-3): ");
        int var = input.nextInt();
        //the program will be excecuted until all the further cases are completed (default case is executed) or the break is encountered in the case/ some leading case
        switch (var) {
            case 1:
            System.out.println("Case 1");
                break;
        
            case 2:
                
            System.out.println("Case 2");
                break;
        
            case 3:
                System.out.println("Case 3");
                break;
        
            default:
                System.out.println("Invalid Case!");
                break;
        }
    }
}