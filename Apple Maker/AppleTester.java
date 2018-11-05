/**
 * Written by Nicholas Knight
 */
public class AppleTester {
  
  
  public static void main(String[] args) { 
    Apple apple01= new Apple(); //Calls default constructor
    
    System.out.println(apple01.getAppleType());
    apple01.setAppleType("Gala");
    System.out.println(apple01.getAppleType());
    
    Apple apple02= new Apple("Granny Smith", 1.5, 2.50);
    System.out.println(apple02.getAppleType());
    System.out.println(apple01);
    System.out.println(apple02);
    
    Apple apple03=new Apple("Red one", 3.0, -0.99);
    System.out.println(apple03);//checks default 
  }
  
  /* ADD YOUR CODE HERE */
  
}
