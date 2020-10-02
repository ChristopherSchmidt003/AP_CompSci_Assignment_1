import java.util.Scanner;

class SimpleInterestFormula {
    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        double a = 0; //amount in account
        double p = 0; //principle
        double r = 0; //rate
        double n = 0; //years
        
        //get user input
        System.out.println("Simple Interest Calculator");
        System.out.println("--------------------------");
        System.out.println("");
        System.out.print("Enter the value of the principle");
        p = sc.nextDouble();
        System.out.print("Enter the value of the rate");
        r = sc.nextDouble();
        System.out.print("Enter the number of years");
        n = sc.nextDouble();
        
        //Calculate and display answer
        a = p*Math.pow((1+r),n);
        System.out.println("The amount in your account will be " + a + " after " + n + " number of years");
        
    }
}