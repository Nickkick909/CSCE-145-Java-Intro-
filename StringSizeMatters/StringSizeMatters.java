/**
 * Created by Nicholas Knight
 */
import java.util.Scanner;
public class StringSizeMatters {
  
  public static final int NUMBER_OF_WORDS=10;
  public static void main(String[] args) { 
    Scanner keyboard= new Scanner(System.in);
    String[] sort = new String[NUMBER_OF_WORDS];
    System.out.println("Enter 10 strings and I'll sort them by their length. Smallest to largest!");
    for(int i=0; i<NUMBER_OF_WORDS; i++)
    {
     sort[i]=keyboard.nextLine();
    }
    boolean hasSwapped=true;
    while(hasSwapped==true)
    {
     hasSwapped=false;
         for(int i=0; i<sort.length-1;i++)
         {
           
              if(sort[i].length()>sort[i+1].length())
              {
               String temp=sort[i];
               sort[i]=sort[i+1];
               sort[i+1]=temp;
               hasSwapped=true;
              }
         }
    }
    for(int i=0;i<sort.length;i++)
    {
     System.out.println(sort[i]); 
    }
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
