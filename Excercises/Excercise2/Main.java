import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        /*
         player_choice = 0, 1, 2 (Rock, Paper, Scissors)
         computer_choice = 0, 1, 2 (Rock, Paper, Scissors); generated randomly
         player_win = true/false
         */
        byte player_choice, comp_choice;
        boolean player_win = false;

        System.out.println("Computer's Move... \nComputer has chosen\n");
        comp_choice = (byte) (Math.random()*3);

        System.out.print("Enter your choice\n0 - Rock\n1 - Paper\n2 - Scissors\nYour Move: ");
        player_choice = input.nextByte();
        System.out.println("Player has chosen\n");
        System.out.println("========================================");
        if (comp_choice == 0){
            System.out.println("Computer's Choice: Rock");
        }
        else if (comp_choice == 1){
            System.out.println("Computer's Choice: Paper");
        }
        else if (comp_choice == 2){
            System.out.println("Computer's Choice: Scissors");
        }

        if (player_choice == 0){
            System.out.println("Your Choice: Rock");
        }
        else if (player_choice == 1){
            System.out.println("Your Choice: Paper");
        }
        else if (player_choice == 2){
            System.out.println("Your Choice: Scissors");
        }
        else{
            System.out.println("Invalid Chioce!");
            return;
        }
        System.out.println("========================================");
        System.out.println("-------- RESULT --------");
        if (comp_choice == player_choice){
            System.out.println("It is a Tie");
            return;
        }
        else if (player_choice == 0){
            if (comp_choice == 1){
                player_win = false;
            }
            else{
                player_win = true;
            }
        }
        else if (player_choice == 1){
            if (comp_choice == 2){
                player_win = false;
            }
            else{
                player_win = true;
            }
        }
        else if (player_choice == 2){
            if (comp_choice == 0){
                player_win = false;
            }
            else{
                player_win = true;
            }
        }

        if (player_win == true){
            System.out.println("You have won!");
        }
        else{
            System.out.println("You have lost!");
        }

    }
}