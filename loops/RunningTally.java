import java.util.Scanner;

class RunningTally {
     
    public static void main (String[] args) {
        //declare variable 
        Scanner sc = new Scanner(System.in);
        int input = 0; //stores uder input 
        int total = 0; // stores running sum of input 
        
        //intro 
        System.out.println("Addition Calculator- type a positive number:  ");
        System.out.println(" ");
        
        while (input >= 0) { 
            System.out.print("Add: ");
            input = sc.nextInt();
            if (input >= 0) {
                total = total + input; 
                
            }
        }
        
        System.out.println("");
        System.out.println("Your total is: " + total);
    }
}
                
            
            
            