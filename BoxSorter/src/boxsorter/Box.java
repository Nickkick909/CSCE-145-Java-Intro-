/*
 *Nicholas Knight
 */
package boxsorter;

public class Box {
    private String label;
    private double length;
    private double width;
    private double height;
    
    public Box()
    {
        this.label="No label yet";
        this.length=0.1;
        this.width=0.1;
        this.height=0.1;
    }
    public Box(String aLabel, double aLength, double aWidth, double aHeight)
    {
        this.setLabel(aLabel);
        this.setLength(aLength);
        this.setWidth(aWidth);
        this.setHeight(aHeight);
    }
    public String getLabel()
    {
        return this.label;
    }
    public double getLength()
    {
        return this.length;
    }
    public double getWidth()
    {
        return this.width;
    }
    public double getHeight()
    {
        return this.height;
    }
    public void setLabel(String aLabel)
    {
        this.label=aLabel;
    }
    public void setLength(double aLength)
    {
        if(aLength>0)
        {
            this.length=aLength;
        }
    }
    public void setWidth(double aWidth)
    {
        if(aWidth>0)
        {
          this.width=aWidth;  
        }
    }
    public void setHeight(double aHeight)
    {
        if(aHeight>0)
        {
            this.height=aHeight;
        }
    }
    public double getVolume()
    {
        return (this.length*this.width*this.height);
    }
    public String toString()
    {
        return "Label: "+this.label+ "\nVolume: "+getVolume();
    }
            
}
