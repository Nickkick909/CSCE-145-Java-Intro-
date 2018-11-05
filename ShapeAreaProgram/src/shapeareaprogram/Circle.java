/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeareaprogram;

/**
 *Nicholas Knight
 */
public class Circle implements Shape{
    private double radius;
    public Circle()
    {
        this.radius=0.1;
    }
    public Circle(double aR)
    {
        this.setRadius(aR);
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double aR)
    {
        if(aR>=0)
        {
            this.radius=aR;
        }
    }
    public double getArea()
    {
        return Math.PI*this.radius*this.radius;
    }
    public String toString()
    {
        return "Circle Radius: "+this.radius+" Area: "+this.getArea();
    }
    public String getShapeType()
    {
        return "Circle";
    }
}
