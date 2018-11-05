/**
 * Created by Nicholas Knight, Kelsey Warf, Alan Dugger
 */
import java.util.Scanner;
public class VowelCounter {
  
  public static final int NUM_VOWLES=5;
  public static void main(String[] args) { 
    Scanner keyboard= new Scanner(System.in);
    System.out.println("Welcome to the vowel counter and sorter!"
                         +"\nEnter a phrase!");
    String phrase= keyboard.nextLine();
    phrase=phrase.toLowerCase();
    char[] vowels= new char[]{'a', 'e', 'i', 'o', 'u'};
    int[] vowelCount= new int[phrase.length()];
    for(int i=0;i<phrase.length();i++)
    {
      if(phrase.charAt(i)==vowels[0])
      {
        vowelCount[0]++;
      }
      else if(phrase.charAt(i)==vowels[1])
      {
       vowelCount[1]++; 
      }
      else if(phrase.charAt(i)==vowels[2])
      {
       vowelCount[2]++; 
      }
      else if(phrase.charAt(i)==vowels[3])
      {
       vowelCount[3]++; 
      }
      else if(phrase.charAt(i)==vowels[4])
      {
       vowelCount[4]++; 
      }
    }
    //bubble sort
    boolean hasSwapped=true;
    while(hasSwapped==true)
    {
     hasSwapped=false;
         for(int i=0; i<vowels.length-1;i++)
         {
           
              if(vowelCount[i]>vowelCount[i+1])
              {
               int temp=vowelCount[i];
               vowelCount[i]=vowelCount[i+1];
               vowelCount[i+1]=temp;
               
               char temp1=vowels[i];
               vowels[i]=vowels[i+1];
               vowels[i+1]=temp1;
               hasSwapped=true;
              }
              
         }
    }
    
    for(int i =0; i<NUM_VOWLES; i++)
    {
      System.out.println(vowels[i]+ " " +vowelCount[i]);
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
