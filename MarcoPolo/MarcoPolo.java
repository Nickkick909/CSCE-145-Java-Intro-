/**
 * Created by Nicholas Knight
 */
import java.util.Scanner;
import java.util.Random;
public class MarcoPolo {
  
  public static final int BOARD_SIZE=10;
  public static final int COLD_DIST=(BOARD_SIZE/2)*(BOARD_SIZE/2);
  public static final int WARM_DIST=(BOARD_SIZE/4)*(BOARD_SIZE/4);
  enum Space{Empty, Player, Walked_Path, Goal};
  public static void main(String[] args) { 
    Scanner keyboard= new Scanner(System.in);
    Random r= new Random();
    int pX=0;
    int pY=0;
    int gX=r.nextInt(BOARD_SIZE);
    int gY=r.nextInt(BOARD_SIZE);
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
                   case Player:
                     System.out.print("X");
                     break;
                   case Walked_Path:
                     System.out.print("#");
                     break;
                   case Goal:
                     System.out.print("_");
                     break;
                   default:
                     System.out.print("?");
                     
                     
                 }
                }
                System.out.println();
           }
           //keyboard.nextLine();
      
      int distance=(pX-gX)*(pX-gX)+(pY-gY)*(pY-gY);
      //indicates player's distance from the goal
      if(distance > COLD_DIST)
      {
       System.out.println("You are cold!"); 
      }
      else if(distance > WARM_DIST)
      {
       System.out.println("You are warm!");
      }
      else
      {
       System.out.println("You are hot!"); 
      }
      System.out.println("Enter 1 0 or -1 to move in x or 9 to quit");
      int dX=keyboard.nextInt();
      if(dX==9)
      {
       System.exit(0);//stops program 
      }
      System.out.println("Enter 1 0 or -1 to move in y");
      int dY= keyboard.nextInt();
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
      board[pY][pX] = Space.Walked_Path;
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
       gameOver=true;
      }
      //Set player's piece
      board[pY][pX] = Space.Player;
    }
  
  }
  /* ADD YOUR CODE HERE */
}







