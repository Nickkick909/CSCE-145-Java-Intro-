/**
 * Written by Nicholas Knight and Kelsey Warf
 */
import java.util.Scanner;
public class ValidDate {
  
  
  public static void main(String[] args) {
    Scanner keyboard= new Scanner(System.in);
    System.out.println("Enter a date (month day).");
    int month=keyboard.nextInt();
    int day=keyboard.nextInt();
    
    if((month==1 && day<=31) || (month==2 && day<=29) || (month==3 && day<=31) || (month==4 && day<= 30) || (month==5 && day<=31) ||
       (month==5 && day<= 31) || (month==6 && day<= 30) || (month==7 && day<=31) || (month==8 && day<=31) || (month==9 && day<=30)
         || (month==10 && day<=31) || (month==11 && day<=30) || (month==12 && day<=31))
    {
      System.out.println(+month+ " " +day+ " is a valid date.");
    }
    else
    {
     System.out.println(+month+ " " +day+ " is not a valid date."); 
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
