/**
 * Written by Nicholas Knight
 */
import java.util.Scanner;
public class CollectingInformation {
  
  
  public static void main(String[] args) { 
    Scanner keyboard= new Scanner(System.in);
    System.out.println("Welcome to the information collector!");
    //Start collecting the info
    System.out.println("Enter your name.");
    String name=keyboard.nextLine();
    
    System.out.println("Enter your age.");
    int age= keyboard.nextInt();
    keyboard.nextLine();
    
    System.out.println("Enter your height (in meters).");
    Double height= keyboard.nextDouble();
    keyboard.nextLine();
    
    System.out.println("Enter your blood type.");
    String bloodType= keyboard.nextLine();
    
    System.out.println("Are you a cat person? True or False.");
    boolean catPerson= keyboard.nextBoolean();
    
    System.out.println("Are you a dog person? True or False.");
    boolean dogPerson= keyboard.nextBoolean();
    
    System.out.println("Are you a reptilain shape  shifter? True or False.");
    boolean lizardMan= keyboard.nextBoolean();
    
    System.out.println("How much gold do you have buried on your property (in kilograms)?");
    Double gold= keyboard.nextDouble();
    keyboard.nextLine();
    
    //Display all the info collected
    System.out.println("Name: " +name);
    System.out.println("Age: " +age+ " years old");
    System.out.println("Height: " +height+ " meters");
    System.out.println("Blood Type: " +bloodType);
    System.out.println("Cat Person: " +catPerson);
    System.out.println("Dog Person: " +dogPerson);
    System.out.println("Reptilian Shape Shifter: " +lizardMan);
    System.out.println("Amount of gold on your land: " +gold+ "kg");
    
    
  
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
