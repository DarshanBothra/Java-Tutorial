import java.util.Scanner;

public class Q3{
    public static void main(String args[]){
        System.out.print("Enter your salary: ");
        Scanner input = new Scanner(System.in);
        /*
         Salary = Employee Salary
         l1 = Slab for salary between 2.5L to 5L: 0.05
         l2 = Slab for salary between 5L to 10L: 0.2
         l3 = Slab for salary above 10L: 0.3
         */

        float salary, l1, l2, l3, total_tax, temp; 
        salary = input.nextFloat();
        temp = salary;
        l1 = 0.05f;
        l2 = 0.2f;
        l3 = 0.3f;
        total_tax = 0.0f;

        // tax calculation
        if (temp > 1000000){
            total_tax += 0.3*(temp - 1000000);
            temp = 1000000;
        }
        if (temp > 500000){
            total_tax += 0.2*(temp - 500000);
            temp = 500000;
        }
        if (temp > 250000){
            total_tax += 0.05*(temp - 250000);
        }

        System.out.printf("==========\nSalary: %.2f\nTaxable Amount: %.2f\n==========\n", salary, total_tax);
    }
}