/**
 * Written by Nicholas Knight
 */
import java.util.Scanner;
public class TriangleMaker9000 {
  
  
  public static void main(String[] args) { 
    Scanner keyboard=new Scanner(System.in);
    System.out.println("This is the Triangle maker 9001!!"
                         +"\nEnter the size of the triangle you want and we will make it just for you!");
    int triangleSize = keyboard.nextInt();
    //System.out.println(triangleSize); //used to check the triangle size variable
    int tHeight=triangleSize;
    int tBase= triangleSize;   //this is what i found that holds true for the base of the triangles (base is the height twice but the middle point is shared so minus 1)
    //System.out.println(tHeight+ " height");
    //System.out.println(tBase+ " base");
  if(triangleSize>0)  //checks for positive values
  {
    int tHeightPerLevel=1;  //Height will always start at 1
    
    for(int i=0; i<tBase-1; i++)
    {
    
         for(int j=0; j<tHeightPerLevel; j++)
         {
           System.out.print("*");
           //System.out.println(j);
           //System.out.println(i);   
         }
         
         tHeightPerLevel++;

         //System.out.print(tHeightPerLevel);
     System.out.println(" ");
    
    }
    
    for(int i=0; i<tBase; i++)
    {
      
      
         for(int j=0; j<tHeightPerLevel; j++)
         {
           System.out.print("*");
           //System.out.println(j);
           //System.out.println(i);   
         }
         
         tHeightPerLevel--;
         

         
         //System.out.print(tHeightPerLevel);
     System.out.println(" ");
    
    }
  }
  
  else 
  {
    System.out.println("You did not enter a valid size!");
  }
  }
  /* ADD YOUR CODE HERE */
  
}
