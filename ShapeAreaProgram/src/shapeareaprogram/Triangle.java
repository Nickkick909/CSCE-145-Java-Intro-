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
public class Triangle implements Shape {
    private double base;
    private double height;
    public Triangle()
    {
        this.base=0.1;
        this.height=0.1;
    }
    public Triangle(double aB, double aH)
    {
        this.setBase(aB);
        this.setHeight(aH);
    }
    public double getBase()
    {
        return this.base;
    }
    public double getHeight()
    {
        return this.height;
    }
    public void setBase(double aB)
    {
        if(aB>=0)
        {
            this.base=aB;
        }
    }
    public void setHeight(double aH)
    {
        if(aH>=0)
        {
            this.height=aH;
        }
    }
    public double getArea()
    {
        return (0.5*(this.base*this.height));
    }
    public String toString()
    {
        return "Triangle base: "+this.base+" Height: "+this.height+" Area: "+this.getArea();
    }
    public String getShapeType()
    {
        return "Triangle";
    }
}


