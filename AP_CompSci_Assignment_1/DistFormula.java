import java.util.Scanner;

class DistFormula {
    public static void main (String[] args) {
        //Declare variables
        Scanner sc = new Scanner(System.in);
        double x1   = 0;
        double y1   = 0;
        double x2   = 0;
        double y2   = 0;
        double dist = 0;
        
        //get user input
        System.out.println("Distance Formula");
        System.out.println("----------------");
        System.out.println("");
        System.out.print("Enter the Coordinates of x1");
        x1 = sc.nextDouble();
        System.out.print("Enter the Coordinates of y1");
        y1 = sc.nextDouble();
        System.out.print("Enter the Coordinates of x2");
        x2 = sc.nextDouble();
        System.out.print("Enter the Coordinates of y2");
        y2 = sc.nextDouble();
        
        //calculate and display answer
        dist = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        System.out.println("The distance between the two points is " + dist);
    }
}