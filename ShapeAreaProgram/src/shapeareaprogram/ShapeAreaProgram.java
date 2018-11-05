/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeareaprogram;

/**
 *
 * @author nicho
 */
import java.util.Scanner;
public class ShapeAreaProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Welcome to the shape area program.");
        ShapeCollection collect=new ShapeCollection();
        boolean quit=false;
        while(quit==false)
        {
            System.out.println("press 1 to add a shape, 2 to remove a shape, and 3 to quit");
            int choice=keyboard.nextInt();
            keyboard.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.println("Is it a rectangle, triangle, or circle?");
                    String type=keyboard.nextLine();
                    if(type.equalsIgnoreCase("Rectangle"))
                    {
                        Rectangle aRectangle=new Rectangle();
                        System.out.println("Enter a length");
                        aRectangle.setLength(keyboard.nextDouble());
                        keyboard.nextLine();
                        System.out.println("Enter a width");
                        aRectangle.setWidth(keyboard.nextDouble());
                        keyboard.nextLine();
                        collect.addShape(aRectangle);
                    }
                    else if(type.equalsIgnoreCase("Triangle"))
                    {
                        Triangle aTriangle=new Triangle();
                        System.out.println("Enter a base");
                        aTriangle.setBase(keyboard.nextDouble());
                        keyboard.nextLine();
                        System.out.println("Enter a height");
                        aTriangle.setHeight(keyboard.nextDouble());
                        keyboard.nextLine();
                        collect.addShape(aTriangle);
                                            }
                    else if(type.equalsIgnoreCase("Circle"))
                    {
                        Circle aCircle=new Circle();
                        System.out.println("Enter a radius");
                        aCircle.setRadius(keyboard.nextDouble());
                        keyboard.nextLine();
                        collect.addShape(aCircle);
                    }
                    //System.out.println(collect.toString());
                    
                    
                    break;
                case 2:
                    System.out.println("Enter shape type.");
                    type=keyboard.nextLine();
                    System.out.println("Enter the area.");
                    double area=keyboard.nextDouble();
                    keyboard.nextLine();
                    collect.removeShapes(type, area);
                    //collect.printShapes();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    quit=true;
                    break;
                   
            }
            collect.printShapes(); 
        }
    }
    
}
