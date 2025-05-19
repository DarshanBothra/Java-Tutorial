import java.util.Scanner;

public class Q4{
    public static void main(String args[]){
        // Convert kilometers into miles and display it!
        // 1km = 1/1.6 miles;

        Scanner input = new Scanner(System.in);

        float distance_km, distance_miles;
        System.out.print("Enter Distance (in km): ");
        distance_km = input.nextFloat();
        distance_miles = distance_km/1.6F;
        System.out.printf("The Distance in miles is: %f\n", distance_miles);
    }
}