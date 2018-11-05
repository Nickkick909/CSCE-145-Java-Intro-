/**
 * Written by Nicholas Knight.
 */
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
  
  public static final int UPPER_LIMIT=3;
  public static final int ROUND_NUMBER=3;
  
  public static void main(String[] args) { 
    System.out.println("hello");
    Scanner keyboard= new Scanner(System.in);
    Random r= new Random();
    
    String playAgain=("Yes");
    while(playAgain.equalsIgnoreCase("Yes")) //this loop allows the user to play again. its a large loop
    {
        System.out.println("Are you ready to play a super intense game of Rock, Paper, Scissors?!?!");
          int counter=0;     //used to keep track of the number of turns
          int playerScore=0;
          int computerScore=0;
          
    
          while(counter<ROUND_NUMBER) // this loop makes the game play 3 times at current round number, but that can be changed at top (constant)
            {
            System.out.println("Enter \"Rock\", \"Paper\", or \"Scissors\"");
            int computer=r.nextInt(UPPER_LIMIT);
            String computerChoiceName;
                if(computer==0)
                {
                  computerChoiceName=("Rock");
                }
                else if(computer==1)
                {
                  computerChoiceName=("Paper"); 
                }
                else
                {
                  computerChoiceName=("Scissors"); 
                }
                //System.out.println(computerChoiceName);  //temp to check the computer's choice
                //System.out.println(computer);            //^
                String userChoice=keyboard.nextLine();
                
                if(userChoice.equalsIgnoreCase("rock"))
                {
                      if(computer==0) //rock v rock
                      {
                        System.out.println(userChoice+ " vs. " +computerChoiceName+ "! "
                                             + "\nIts a tie!" 
                                             +"\nPlayer: " +playerScore+ " Computer: " +computerScore);
                        counter++;
                      }
                      else if(computer==1) //rock v paper
                      {
                        computerScore++;
                        System.out.println(userChoice+ " vs. " +computerChoiceName+ "! "
                                             + "\nPaper beats Rock!" 
                                             +"\nPlayer: " +playerScore+ " Computer: " +computerScore);
                        counter++;
                      }
                      else if(computer==2) //rock v scissors
                      {
                        playerScore++;
                        System.out.println(userChoice+ " vs. " +computerChoiceName+ "! "
                                             + "\nRock beats Scissors!" 
                                             +"\nPlayer: " +playerScore+ " Computer: " +computerScore);
                        counter++;
                      }
                }
                else if(userChoice.equalsIgnoreCase("Paper"))
                {
                  if(computer==0) //paper v rock
                      {
                        playerScore++;
                        System.out.println(userChoice+ " vs. " +computerChoiceName+ "! "
                                             + "\nPaper beats Rock!" 
                                             +"\nPlayer: " +playerScore+ " Computer: " +computerScore);
                        counter++;
                      }
                      else if(computer==1) //paper v paper
                      {
                        System.out.println(userChoice+ " vs. " +computerChoiceName+ "! "
                                             + "\nIts a tie!" 
                                             +"\nPlayer: " +playerScore+ " Computer: " +computerScore);
                        counter++;
                      }
                      else if(computer==2) //paper v scissors
                      {
                        computerScore++;
                        System.out.println(userChoice+ " vs. " +computerChoiceName+ "! "
                                             + "\nScissors beat Paper!" 
                                             +"\nPlayer: " +playerScore+ " Computer: " +computerScore);
                        counter++;
                      }
                }
                else if(userChoice.equalsIgnoreCase("Scissors"))
                {
                      if(computer==0) //Scissors v rock
                      {
                        computerScore++;
                        System.out.println(userChoice+ " vs. " +computerChoiceName+ "! "
                                             + "\nRock beats scissors!" 
                                             +"\nPlayer: " +playerScore+ " Computer: " +computerScore);
                        counter++;
                      }
                      else if(computer==1) //scissors v paper
                      {
                        playerScore++;
                        System.out.println(userChoice+ " vs. " +computerChoiceName+ "! "
                                             + "\nScissors beat paper!" 
                                             +"\nPlayer: " +playerScore+ " Computer: " +computerScore);
                        counter++;
                      }
                      else if(computer==2) //scissors v scissors
                      {
                        System.out.println(userChoice+ " vs. " +computerChoiceName+"!");
                        System.out.println("Its a tie!");
                        counter++;
                      }
                }
                else
                {
                  computerScore=3;
                  counter=3;
                  System.out.println("You lose cause you didn't enter a valid option.");
                }
                
                       
          }
          System.out.println(" "                      //used for style to give a space before endgame results
                               +"\nThe final score is..." 
                                     +"\nPlayer: " +playerScore+
                                   "\nComputer: " +computerScore);
                     if(playerScore>computerScore)
                     {
                      System.out.println("Player wins!"); 
                     }
                     else if(playerScore<computerScore)
                     {
                      System.out.println("Computer wins!"); 
                     }
                     else 
                     {
                      System.out.println("Its a tie!"); 
                     }
      System.out.println(" "                  //used for style to give it a space between the endgame results and the play again
                           +"\nDo you want to play again?");
      playAgain=keyboard.nextLine();
           
    }
    System.out.println("Goodbye");
  }
  /* ADD YOUR CODE HERE */
  
}
    