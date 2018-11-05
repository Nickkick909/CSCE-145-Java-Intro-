/**
 *Written by Nicholas Knight
 */
public class Apple {
  //attributes
  private String appleType="Gala";
  private double weight=0.0;
  private double price=0.0;
  
  //constructors
  public Apple()
  {
   this.appleType= "Gala";
   this.weight= 0.0;
   this.price= 0.0; 
  }
  
  //param constructors
  public Apple(String aAppleType, double aWeight, double aPrice)
  {
   this.setAppleType(aAppleType);
   this.setWeight(aWeight);
   this.setPrice(aPrice);
  }
  
  //Accessors
  public String getAppleType()
  {
    return this.appleType;
  }
  public double getWeight()
  {
   return this.weight;
  }
  public double getPrice()
  {
   return this.price; 
  }
  
  //mutators
  public void setAppleType(String aAppleType)
  {
    if(aAppleType.equalsIgnoreCase("Red Delicious") || aAppleType.equalsIgnoreCase("Golden Delicious")
      || aAppleType.equalsIgnoreCase("Gala") || aAppleType.equalsIgnoreCase("Granny Smith"))
    {
     this.appleType=aAppleType; 
    }
  }
  public void setWeight(Double aWeight)
  {
    if(aWeight>0.0 && aWeight<2.0)
    {
     this.weight=aWeight; 
    }
  }
  public void setPrice(Double aPrice)
  {
    if(aPrice>0.0)
    {
     this.price=aPrice; 
    }
  }
  
  //Other Methods
  public String toString()
  {
   return "Apple Type: " +this.appleType+" Weight: " +this.weight+ " Price: " +this.price;  
  }
  public boolean equals(Apple aApple)
  {
    return aApple!=null &&
     this.appleType.equals(aApple.getAppleType()) &&
     this.weight==aApple.getWeight() &&
     this.price==aApple.getPrice();
  }
  /* ADD YOUR CODE HERE */
  
}
