/**
 * Created by Nicholas Knight
 */
import java.util.Scanner;
public class TacoSorter {
  
  public static final int NUMBER_OF_TACOS=10;
  public static void main(String[] args) { 
    Scanner keyboard =new Scanner(System.in);
    System.out.println("Welcome to the taco price sorter!"
                         +"\nEnter 10 taco names and their prices.");
    double tacoPrices[]=new double[NUMBER_OF_TACOS];
    String tacoNames[]=new String[NUMBER_OF_TACOS];
    
    for(int i=0; i<NUMBER_OF_TACOS; i++)
    {
     System.out.println("Enter the name of taco " +(i+1));
     tacoNames[i]=keyboard.nextLine();
     //System.out.println(tacoNames[i]);
     System.out.println("Enter the price of the taco");
     tacoPrices[i]=keyboard.nextDouble();
     keyboard.nextLine();
     //System.out.println(tacoPrices[i]);
    }
    
    for(int i=0; i<tacoPrices.length;i++)
    {
     int smallest=i;
         for(int j=i; j<tacoPrices.length;j++)
         {
             if(tacoPrices[j]<tacoPrices[smallest])
             {
              smallest=j; 
             }
             
         }
    
         if(tacoPrices[smallest]!=i)
         {
           double temp=tacoPrices[i];
           tacoPrices[i]=tacoPrices[smallest];
           tacoPrices[smallest]=temp;
           
         }
         if(smallest!=i)
         {
           String temp=tacoNames[i];
           tacoNames[i]=tacoNames[smallest];
           tacoNames[smallest]=temp;
           
         }
    }
    System.out.println("The tacos from cheapest to most expensive:");
         for(int i=0;i<tacoPrices.length; i++)
         {
           System.out.println(tacoNames[i]+ " " +tacoPrices[i]);
         }

  }
  
  /* ADD YOUR CODE HERE */
  
}
