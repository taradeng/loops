import java.util.Scanner;

public class Triangle {
    
    public static void main (String[] args) {
        // Declare Variables
        Scanner sc = new Scanner(System.in); //read from terminal
        String  ch = ""; //the character to make the triangle with
        int num    = 0;  //how tall the triangle should be

        // Get input
        System.out.print("Symbol: ");
        ch  = sc.next();
        System.out.print("Height: ");
        num = sc.nextInt();
        System.out.println("");
        System.out.println("Triangle: ");
        
        
        //print 
        for (int i = 1; i <= num; i++) { //levels 
            for (int j = 1; j <= i; j++) { //length: equal to level
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
}