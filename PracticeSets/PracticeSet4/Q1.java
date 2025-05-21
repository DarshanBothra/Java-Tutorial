public class Q1{
    public static void main(String args[]){
        int a = 10;
        if (a = 11){ // this error was made delibrately 
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }
    }
}
// Output - Code generates error! at line 4 ('==': comparison != '=': assignment)