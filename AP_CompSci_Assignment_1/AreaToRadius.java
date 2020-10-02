import java.util.Scanner;

class AreaToRadius {
    
    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        double r = 0;
        double area = 0;
        
        //get user input
        System.out.println("Circle Radius Calculator");
        System.out.println("------------------------");
        System.out.println("");
        System.out.println("Enter the circle's area:");
        area = sc.nextDouble();
        
        //3. calculate and display radius
        r = Math.sqrt (area / Math.PI);
        System.out.println("The circle with area " + area + " units^2 has a radius of "+ r);
        
    }   
}