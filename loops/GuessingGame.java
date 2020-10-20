import java.util.Scanner;

class GuessingGame { 
    public static void main (String[] args) {
        //declared variables
        Scanner sc = new Scanner(System.in); //read from terminal
        int answer = (int) (Math.random()*100+1); //generates answer, random number         
        int guess = 0;
        int tries = 0; 
        
        //instructions 
        
        System.out.println("I've picked a random number between 1 and 100. Try to guess it! ");
        
        // Guessing loop
        while (guess != answer) {
            System.out.print("What is your guess? ");
            guess = sc.nextInt();
            tries++;
            
            if (guess < answer) {
                System.out.println("Too low!");
            } else if (guess > answer) {
                System.out.println("Too high!");
            }
        }
        
        System.out.println("You've guessed my number! Good job!  It only took you " + tries + " tries.");
    }
}
    
    
