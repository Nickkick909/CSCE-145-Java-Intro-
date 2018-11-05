/**
 * Written by Nicholas Knight and Kelsey Warf
 */
import java.util.Scanner;
import java.util.Random;

public class HeadsOrTails {
  
  public static final int UPPER_LIMIT=2;
  public static void main(String[] args) { 
    Random r=new Random();
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Are you ready to flip a coin?");
    System.out.println("Enter a number of flips");
    int numberOfFlips=keyboard.nextInt();
    
    int counter=0; //used to keep track of the number of flips
    int headCount=0; //tracks number of heads
    int tailsCount=0; //tracks number of tails
      
    while(counter<numberOfFlips) //runs loop while the counter is less than the number the user picked
    {
     int flip=r.nextInt(UPPER_LIMIT);
         if(flip == 0)
         {
           String headsOrTails=("heads");
           System.out.println(headsOrTails);
           headCount++;
         }
         else
         {
           String headsOrTails=("tails");
           System.out.println(headsOrTails);
           tailsCount++;
         }
     counter++;
    }
    System.out.println("The number of heads was " +headCount+ 
                       "\nThe number of tails was " +tailsCount);
    if(headCount>tailsCount)
    {
     System.out.println("Heads wins!"); 
    }
    else if(headCount<tailsCount)
    {
     System.out.println("Tails wins!"); 
    }
    else
    {
     System.out.println("Its a tie"); 
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
