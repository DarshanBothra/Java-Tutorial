public class Q2{
    public static void main(String args[]){
        // Calculate and display GPA of 3 subjects (out of 100)

        int sub1, sub2, sub3, total;

        sub1 = 99;
        sub2 = 89;
        sub3 = 95;

        total = sub1 + sub2 + sub3;
        float avg = total/30F;

        System.out.printf("The CGPA is: %f\n", avg);
    }
}
