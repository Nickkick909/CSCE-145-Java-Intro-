
package dresserfrontend;

/**
 *Nicholas Knight
 */
enum Type {Undergarments, Socks, Stockings, Top, Bottom, Cape};
enum Color {Brown,Red,Pink,Orange,Green,Blue,Purple,Grey};
public class Clothing {
    private Type clothingType;
    private Color clothingColor;
    
    public Clothing()
    {
        this.clothingType=Type.Undergarments;
        this.clothingColor=Color.Grey;
    }
    public Clothing(Type aClothingType, Color aClothingColor)
    {
        this.setClothingType(aClothingType);
        this.setClothingColor(aClothingColor);
    }
    public Type getClothingType()
    {
        return this.clothingType;
    }
    public Color getClothingColor()
    {
        return this.clothingColor;
    }
    public void setClothingType(Type aClothingType)
    {
        this.clothingType=aClothingType;
    }
    public void setClothingColor(Color aClothingColor)
    {
        this.clothingColor=aClothingColor;
    }
    public boolean equals(Clothing aClothing)
    {
        return aClothing != null &&
             this.clothingColor.equals(aClothing.getClothingColor()) &&
             this.clothingType.equals(aClothing.getClothingType());
    }
    public String toString()
    {
        return "Type: "+this.clothingType+", Color: "+this.clothingColor;
    }
}
    

