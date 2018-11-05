/*
 * Nicholas Knight
 */
package dresserfrontend;
import java.util.Scanner;
public class DresserFrontEnd {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard=new Scanner(System.in);
        Dresser dress=new Dresser();
        System.out.println("Welcome to the dresser!");
        boolean quit=false;
        while(quit==false)
        {
            System.out.println("");
            System.out.println("Enter 1 to add an item\n"
                            +"Enter 2 to remove an item\n"+
                            "Enter 3 to print the dresser\n"+
                            "Enter 9 to quit");
            int choice=keyboard.nextInt();
            keyboard.nextLine();
            switch(choice)
            {
                case 1:
                    
                    Clothing aClothing=new Clothing();
                    System.out.println("Enter a type.");
                    String userType=keyboard.nextLine();
                    if(userType.equalsIgnoreCase("Undergarments"))
                            {
                                aClothing.setClothingType(Type.Undergarments);
                            }
                    if(userType.equalsIgnoreCase("Socks"))
                            {
                                aClothing.setClothingType(Type.Socks);
                            }
                    if(userType.equalsIgnoreCase("Stockings"))
                            {
                                aClothing.setClothingType(Type.Stockings);
                            }
                    if(userType.equalsIgnoreCase("Top"))
                            {
                                aClothing.setClothingType(Type.Top);
                            }
                    if(userType.equalsIgnoreCase("Bottom"))
                            {
                                aClothing.setClothingType(Type.Bottom);
                            }
                    if(userType.equalsIgnoreCase("Cape"))
                            {
                                aClothing.setClothingType(Type.Cape);
                            }
                    //aClothing.setClothingType(keyboard.nextLine());
                    System.out.println("Enter a color.");
                    String userColor=keyboard.nextLine();
                    if(userColor.equalsIgnoreCase("Brown"))
                            {
                                aClothing.setClothingColor(Color.Brown);
                            }
                    if(userColor.equalsIgnoreCase("Red"))
                            {
                                aClothing.setClothingColor(Color.Red);
                            }
                    if(userColor.equalsIgnoreCase("Pink"))
                            {
                                aClothing.setClothingColor(Color.Pink);
                            }
                    if(userColor.equalsIgnoreCase("Orange"))
                            {
                                aClothing.setClothingColor(Color.Orange);
                            }
                    if(userColor.equalsIgnoreCase("Green"))
                            {
                                aClothing.setClothingColor(Color.Green);
                            }
                    if(userColor.equalsIgnoreCase("Blue"))
                            {
                                aClothing.setClothingColor(Color.Blue);
                            }
                    if(userColor.equalsIgnoreCase("Purple"))
                            {
                                aClothing.setClothingColor(Color.Purple);
                            }
                    if(userColor.equalsIgnoreCase("Grey"))
                            {
                                aClothing.setClothingColor(Color.Grey);
                            }
                    //aClothing.setClothingColor(keyboard.nextLine());
                    System.out.println(aClothing.toString());
                    dress.add(aClothing);
                    break;
                    
                case 2:
                    aClothing=new Clothing();
                    System.out.println("Enter a type.");
                    userType=keyboard.nextLine();
                    if(userType.equalsIgnoreCase("Undergarments"))
                            {
                                aClothing.setClothingType(Type.Undergarments);
                            }
                    if(userType.equalsIgnoreCase("Socks"))
                            {
                                aClothing.setClothingType(Type.Socks);
                            }
                    if(userType.equalsIgnoreCase("Stockings"))
                            {
                                aClothing.setClothingType(Type.Stockings);
                            }
                    if(userType.equalsIgnoreCase("Top"))
                            {
                                aClothing.setClothingType(Type.Top);
                            }
                    if(userType.equalsIgnoreCase("Bottom"))
                            {
                                aClothing.setClothingType(Type.Bottom);
                            }
                    if(userType.equalsIgnoreCase("Cape"))
                            {
                                aClothing.setClothingType(Type.Cape);
                            }
                    System.out.println("Enter a color.");
                     
                    userColor=keyboard.nextLine();
                    if(userColor.equalsIgnoreCase("Brown"))
                            {
                                aClothing.setClothingColor(Color.Brown);
                            }
                    if(userColor.equalsIgnoreCase("Red"))
                            {
                                aClothing.setClothingColor(Color.Red);
                            }
                    if(userColor.equalsIgnoreCase("Pink"))
                            {
                                aClothing.setClothingColor(Color.Pink);
                            }
                    if(userColor.equalsIgnoreCase("Orange"))
                            {
                                aClothing.setClothingColor(Color.Orange);
                            }
                    if(userColor.equalsIgnoreCase("Green"))
                            {
                                aClothing.setClothingColor(Color.Green);
                            }
                    if(userColor.equalsIgnoreCase("Blue"))
                            {
                                aClothing.setClothingColor(Color.Blue);
                            }
                    if(userColor.equalsIgnoreCase("Purple"))
                            {
                                aClothing.setClothingColor(Color.Purple);
                            }
                    if(userColor.equalsIgnoreCase("Grey"))
                            {
                                aClothing.setClothingColor(Color.Grey);
                            }
                    System.out.println(aClothing.toString());
                    dress.remove(aClothing);
                    break;
                    
                case 3:
                    System.out.println(dress.print());
                    break;
                    
                case 9:
                    System.out.println("Goodbye!");
                    quit=true;
            }
        }
    }
    
}
