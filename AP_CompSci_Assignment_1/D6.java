import java.util.Scanner;

class D6 {
    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int diceCount = 0; //number of dice
        int diceSides = 0;  //sides on a dice
        int roll = 0;
        
        //get user input
        System.out.println("Dice Roll Generator");
        System.out.println("-------------------");
        System.out.println("");
        //System.out.print("Enter how many dice you'd like to roll (enter a whole number): ");
        //diceCount = sc.nextInt();
        //System.out.print("Enter how many sides the dice have (enter a whole number) : ");
        //diceSides = sc.nextInt();
        
        //Calculate and display answer
        diceCount = 10;
        diceSides = 6;
        
        roll = (int) (Math.random()*diceSides) + 1;
        System.out.println("Die roll 1: " + roll);
        
        roll = (int) (Math.random()*diceSides) + 1;
        System.out.println("Die roll 1: " + roll);
        
        roll = (int) (Math.random()*diceSides) + 1;
        System.out.println("Die roll 1: " + roll);
        
        
    }
}