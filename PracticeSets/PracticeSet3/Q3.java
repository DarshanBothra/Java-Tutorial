import java.util.Scanner;

public class Q3{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name to fill the template with: ");
        String name = input.nextLine();
        String template = """
                Dear %s,
                Thanks a lot
                """;
        System.out.printf(template, name);
    }
}