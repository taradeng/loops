import java.util.Scanner;

class D6 { 
    
    public static void main(String[] args) {
        
        //variables 
        Scanner sc = new Scanner(System.in);
        int numdice = 0;
        int dieroll = 0;
        int total = 0;
        String ans = "Yes";
        
        while (ans.equals("y")) { 
            //reset total; 
            total = 0;
            //get input 
            System.out.println("How many D6's do you want to roll? ");
            numdice = sc.nextInt();
            
            //roll & add dice
            System.out.println("");
            System.out.print("You rolled: ");
            for (int i = 0; i < numdice; i++) {
               
                dieroll = (int) (Math.random()*6+1);
                total += dieroll;
                System.out.print(dieroll + " ");
            }
            System.out.println("");
            System.out.println("Total: " + total);
            System.out.println("");
            
            //ask to continue 
            System.out.print("Again? [Yes/No]" );
            ans = sc.next();
            System.out.println("");
            
        }
        
    }
}
        