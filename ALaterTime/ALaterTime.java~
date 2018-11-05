/**
 * Written by Nicholas Knight
 */
import java.util.Scanner;
public class ALaterTime {
  
  public static void main(String[] args) { 
    Scanner keyboard= new Scanner(System.in);
    
    
    System.out.println("Enter a time (hour:minute).");
    String inTime = keyboard.nextLine();
    String inTimeCopy=inTime;
    
    int workingIndex=inTimeCopy.indexOf(":");
    String sHour=inTimeCopy.substring(0,workingIndex);   
    inTimeCopy=inTimeCopy.substring(workingIndex+1);
    
    String sMinutes=inTimeCopy.substring(0);   //this number needs to be 0 because the minutes are at the beginning of the string now
                                                          
    
    int iMinutes=Integer.parseInt(sMinutes);
    int iHour=Integer.parseInt(sHour);
    
    //System.out.println(sMinutes);//temp to check the hours and min 
    
    System.out.println("Enter the a time in minutes to add to your time.");
      int addMin=keyboard.nextInt();    
      keyboard.nextLine();
     
    iMinutes+=addMin; 
    int iMinutesEnd= iMinutes%60;     // number 60 was chosen because that is the number of minutes in an hour
   
    
    int hourCarry=iMinutes/60;
    iHour+=hourCarry;
    iHour%=24;
    
    
    //System.out.println(hourCarry); //Temporary just to see the hour carry value
    
    System.out.println(+addMin+ " minutes after " + inTime + " will be " +iHour+ ":" +iMinutesEnd+ "."); //Min after input will be output 
    
    
    /*THIS PROBLEM HAS BEEN RESOLVED:
     * if the hour is 2 digits the the program messes up the minutes
     * when program extracts min from string (hours witwh 2 digits) it chops the tens place
     * (30->00)(35->05)
     * 
     * 10:59 + 60 min =11:9 says the program
    */
   
  }
  
  /* ADD YOUR CODE HERE */
  
}
