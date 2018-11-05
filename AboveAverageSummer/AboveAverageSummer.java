/**
 * Written by Nicholas Knight
 */
import java.util.Scanner;

public class AboveAverageSummer {
  
  public static final int NUMBER_OF_DAYS=10;
  public static void main(String[] args) { 
    Scanner keyboard= new Scanner(System.in);
    System.out.println("Welcome to the average temperature checker");
    // create a loop and an array to store and collect the times
    //find the average
    //if above average(loop to check all) do something with it
    double temp[] = new double[10];
    double averageTemp=0.0;
        for(int i=0; i<NUMBER_OF_DAYS; i++)
        {
          System.out.println("Please enter the temperature for day "+ (i+1));
          temp[i] = keyboard.nextDouble();
          keyboard.nextLine();
          averageTemp+= temp[i];
        }
    averageTemp/=NUMBER_OF_DAYS;
    System.out.println("The average temperature was " + averageTemp);
    
    System.out.println("The days that were above average were:");
         for(int i=0; i<NUMBER_OF_DAYS; i++)
         {
             if(temp[i]>averageTemp)
             {
               System.out.println("Day " +(i+1)+ " was " +temp[i]);
             }
         }
    System.out.println("Done");
    
    
  }
}
