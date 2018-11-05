/**
 * Written by Nicholas Knight
 */
import java.util.Scanner;
public class MatrixSubtraction {
  
  
  public static void main(String[] args) { 
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to the matrix subtration program!");
    System.out.println("Please enter the length of the first matrix");
    int length1=keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Please enter the width of the first matrix");
    int width1= keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Please enter the length of the second matrix");
    int length2=keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Please enter the width of the second matrix");
    int width2= keyboard.nextInt();
    keyboard.nextLine();
    if((length1!=length2) || (width1 != width2))
    {
     System.out.println("Cannot subtract these! Dimension mismatch"); 
    }
    else
    {
      int[][] m1= new int[length1][width1];
      int[][] m2= new int[length2][width2];
      int[][] mF= new int[length1][width1];
      
      for(int i=0; i<length1; i++)//matrix 1
      {
           for(int j=0; j<width1; j++)
           {
            System.out.println("Please enter a value for matrix 1 space" +(i+1) +" " +(j+1));
            m1[i][j]= keyboard.nextInt();
            keyboard.nextLine();
           }
      }
      for(int i=0; i<length1; i++)//matrix 2
      {
           for(int j=0; j<width1; j++)
           {
            System.out.println("Please enter a value for matrix 2 space" +(i+1) +" " +(j+1));
            m2[i][j]= keyboard.nextInt();
            keyboard.nextLine();
           }
      }
      for(int i=0; i<length1; i++)//print m1
      {
           for(int j=0; j<width1; j++)
           {
            System.out.print(m1[i][j] +" ");
           }
           System.out.println();
      }
      System.out.println("-");//print m2
        for(int i=0; i<length1; i++)
      {
           for(int j=0; j<width1; j++)
           {
            System.out.print(m2[i][j] +" ");
           }
           System.out.println();
      }
        System.out.println("=");
          for(int i=0; i<length1; i++) //subtraction of m1 and m2
      {
           for(int j=0; j<width1; j++)
           {
             mF[i][j]=(m1[i][j]-m2[i][j]);
             System.out.print(mF[i][j]+ " ");
           }
           System.out.println();
           
      }
          System.out.println("Done!");
    }

    
    
    
    
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
