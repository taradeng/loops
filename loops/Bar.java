import java.util.Scanner;

class Bar {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String symbol =  "";
        int x = 0;
        
        
        //get input
        System.out.print("Character: ");
        symbol = sc.next();
        System.out.print("Bar Length: ");
        x = sc.nextInt();
        
        //display 
        System.out.println("");
        System.out.println("Bar: ");
      
        
    
        for (int i = 0; i < x; i++) {
            
            System.out.print(symbol);
            
        }
    }
}        