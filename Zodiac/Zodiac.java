/**
 * Written by Nicholas Knight and London Thompson
 */
import java.util.Scanner;
public class Zodiac {
  
  
  public static void main(String[] args) { 
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Enter your birthday (month day) and we will tell you your Zodiac sign!");
    int month= keyboard.nextInt();
    int day=keyboard.nextInt();
    //System.out.println(+month+ " " +day); used to check the month and day inputs
    
    // this begins checking for the month and day combo as well as checking for a valid date
    if((month==1 && day>=20 && day<32) || (month==2 && day<=18 && day<29))
    {
    System.out.println("You're Aquarius");
    }  
    else if((month==2 && day>=19 && day< 29) || (month==3 && day<=20 && day<32))
    {
     System.out.println("You're Pisces"); 
    }
    else if((month==3 && day>=21 && day<32) || (month==4 && day<=19 && day<31))
    {
     System.out.println("You're Aries");
    }
    else if((month==4 && day>=20 && day<31) || (month==5 && day<=20 && day<32))
    {
     System.out.println("You're Taurus"); 
    }
    else if((month==5 && day>=21 && day<32) || (month==6 && day<=20 && day<31))
    {
     System.out.println("You're Gemini"); 
    }
    else if((month==6 && day>=21 && day<31) || (month==7 && day<=22 && day<32))
    {
     System.out.println("You're Cancer");
    }
    else if((month==7 && day>=23 && day<32) || (month==8 && day<=22 && day<32))
    {
     System.out.println("You're Leo"); 
    }
    else if((month==8 && day>=23 && day<32) || (month==9 && day<=22 && day<31))
    {
     System.out.println("You're Virgo"); 
    }
    else if((month==9 && day>=23 && day<31) || (month==10 && day<=22 && day<32))
    {
     System.out.println("You're Libra"); 
    }
    else if((month==10 && day>=23 && day<32) || (month==11 && day<=21 && day<31))
    {
     System.out.println("You're Scorpio"); 
    }
    else if((month==11 && day>=22 && day<31) || (month==12 && day<=21 && day<32))
    {
     System.out.println("You're Sagittarius");
    }
    else if((month==12 && day>=22 && day<32) || (month==1 && day<=19 && day<32))
    {
     System.out.println("You're Capricorn");
    }
    else
    {
      System.out.println("You failed to enter a valid date");
    }

  }
  
  /* ADD YOUR CODE HERE */
  
}
