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
public class Rectangle implements Shape{
    private double length;
    private double width;
    public Rectangle()
    {
        this.length=0.1;
        this.width=0.1;
    }
    public Rectangle(double aL, double aW)
    {
        this.setLength(aL);
        this.setWidth(aW);
    }
    public double getLength()
    {
        return this.length;
    }
    public double getWidth()
    {
        return this.width;
    }
    public void setLength(double aL)
    {
        if(aL>=0)
        {
            this.length=aL;
        }
    }
    public void setWidth(double aW)
    {
        if(aW>=0)
        {
            this.width=aW;
        }
    }
    public double getArea()
    {
        return this.length*this.width;
    }
    public String toString()
    {
        return "Rectangle Lenght: "+this.length+" Width: "+this.width+" Area: "+this.getArea();
    }
    public String getShapeType()
    {
        return "Rectangle";
    }
}
