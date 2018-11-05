/**
 * Written by Nicholas Knight
 */
import java.util.Random;
public class LabTest1 {
  
  public static final int SIZE= 100;
  public static void main(String[] args) { 
    int[] randomA=new int[SIZE];
    int[] even= new int[SIZE];
    int[] odd= new int[SIZE];
    Random r=new Random();
    for(int i=0; i<SIZE;i++) //assigns random values to the random array
    {
      randomA[i]=r.nextInt(SIZE); 
    }
    System.out.println("Creating array and populating it with values");
    System.out.println("The unsorted array");
    for(int i=0; i<SIZE; i++)//assign sentinal values
    {
     even[i]=-1;
     odd[i]=-1;
    }
    for(int i=0; i<SIZE;i ++)
    {
     System.out.println(randomA[i]); 
    }
      
    for(int i=0; i<SIZE; i++)
    {
     if(randomA[i]%2==0 || randomA[i]==0) //if even
     {
       even[i]=randomA[i];
     }
     else if(randomA[i]%2==1) //else odd
     {
       odd[i]=randomA[i]; 
     }
     else//error check
     {
      System.out.println("oops"); 
     }
    }
    boolean hasSwapped=true;//sort the even
    while(hasSwapped==true)
    {
     hasSwapped=false;
         for(int i=0; i<SIZE-1;i++)
         {
           
              if(even[i]>even[i+1])
              {
               int temp=even[i];
               even[i]=even[i+1];
               even[i+1]=temp;
               hasSwapped=true;
              }
         }
    }
    hasSwapped=true;
    while(hasSwapped==true) //sort the odd
    {
     hasSwapped=false;
         for(int i=0; i<SIZE-1;i++)
         {
           
              if(odd[i]>odd[i+1])
              {
               int temp=odd[i];
               odd[i]=odd[i+1];
               odd[i+1]=temp;
               hasSwapped=true;
              }
         }
    }
    System.out.println("The sorted odd array");
    for(int i =0; i<SIZE; i++)
    {
      if(odd[i]==-1)
      {
       i++; 
      }
      else
      {
        System.out.println(odd[i]);
      }
    }
    System.out.println("The sorted even array");
    for(int i =0; i<SIZE; i++)
    {
      if(even[i]==-1)
      {
       i++; 
      }
      else
      {
        System.out.println(even[i]);
      }
    }
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
