/**
 * Written by Nicholas Knight
 */
import java.util.Scanner;
import java.util.Random;
public class MineWalker {
  
  public static final int BOARD_SIZE=10;
  public static final int MINES=(BOARD_SIZE*BOARD_SIZE)/10;
  enum Space{Empty, Player, Mine, Goal};
  public static void main(String[] args) {
    System.out.println("Welcome to Mine Walker. Get to the ice cream cone and avoid the hidden mines");
    String playAgain=("yes");
      while(playAgain.equalsIgnoreCase("yes"))
      {
    Scanner keyboard= new Scanner(System.in);
    Random r= new Random();
    int pX=0;
    int pY=0;
    int gX=r.nextInt(BOARD_SIZE);
    int gY=r.nextInt(BOARD_SIZE);
    //int[][] mineSpots=new int[BOARD_SIZE][BOARD_SIZE];
    
    Space[][] board = new Space[BOARD_SIZE][BOARD_SIZE];
     for(int y=0; y<board.length; y++)
    {
          for(int x=0; x<board.length; x++)
          {
           board[x][y]=Space.Empty;
          }
    }
      board[pY][pX]= Space.Player;
      board[gY][gX]= Space.Goal;
      for(int i=0; i<MINES;i++)
      {
       int mineX=r.nextInt(BOARD_SIZE);
       int mineY=r.nextInt(BOARD_SIZE);
       if(board[mineY][mineX]==board[0][0] || board[mineY][mineX]==board[gY][gX])
       {
        mineX=r.nextInt(BOARD_SIZE);
        mineY=r.nextInt(BOARD_SIZE);
       }
       else
       {
       board[mineY][mineX]=Space.Mine;
       }
      }
      
      
        boolean gameOver=false;
      while(gameOver==false)
      {
           for(int y=0; y<board.length; y++)
           {
                for(int x=0; x<board[y].length; x++)
                {
                 switch(board[y][x])
                 {
                   case Empty:
                     System.out.print("_");
                     break;
                  
                   case Mine:
                     System.out.print("_");
                     break;
                   case Player:
                     System.out.print("X");
                     break;
                   case Goal:
                     System.out.print("^");
                     break;
                   default:
                     System.out.print("?");
                     
                     
                 }
                }
                System.out.println();
           }
           //keyboard.nextLine();
      
      
      System.out.println("Enter 1 0 or -1 to move in x or 9 to quit");
      int dX=keyboard.nextInt();
      keyboard.nextLine();
      if(dX==9)
      {
       System.exit(0);//stops program 
      }
      System.out.println("Enter 1 0 or -1 to move in y");
      int dY= keyboard.nextInt();
      keyboard.nextLine();
      if(dX<-1 || dX>1)//check x value
      {
       System.out.println("Entered an invalid X"); 
       dX=0;
      }
      if(dY<-1 || dY>1)//check y value
      {
       System.out.println("Entered an invalid Y");
       dY=0;
      }
      //update the board
      board[pY][pX] = Space.Empty;
      pX += dX;
      pY += dY;
      //collision detection
      if(pX<0)
      {
       pX=0; 
      }
      else if(pX>BOARD_SIZE-1)
      {
       pX=BOARD_SIZE-1; 
      }
      if(pY<0)
      {
       pY=0;
      }
      else if(pY>BOARD_SIZE-1)
      {
       pY=BOARD_SIZE-1; 
      }
      //winning condition
      if(board[pY][pX]==Space.Goal)
      {
       System.out.println("You win");
       System.out.println("Play again?");
       playAgain=keyboard.nextLine();
       gameOver=true; 
      }
      if(board[pY][pX]==Space.Mine)
      {
        System.out.println("Boom! You're dead!");
        System.out.println("Play again?");
        playAgain=keyboard.nextLine();
        gameOver=true;
      }
      //Set player's piece
      board[pY][pX] = Space.Player;
    }
      }
  }
  
  
  /* ADD YOUR CODE HERE */
  
}
