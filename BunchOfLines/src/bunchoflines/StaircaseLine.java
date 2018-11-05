/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bunchoflines;

/**
 *
 * @author nicho
 */
public class StaircaseLine implements Line {
    private double width;
    private double height;
    public StaircaseLine()
    {
        this.height=0.0;
        this.width=0.0;
    }
    public StaircaseLine(double aW, double aH)
    {
        this.setWidth(aW);
        this.setHeight(aH);
    }
    public double getWidth()
    {
        return this.width;
    }
    public double getHeight()
    {
        return this.height;
    }
    public void setWidth(double aW)
    {
        if(aW>=0)
        {
            this.width=aW;
        }
    }
    public void setHeight(double aH)
    {
        if(aH>=0)
        {
            this.height=aH;
        }
    }
    public double getYPoint(double xValue)
    {
        
        return ((int)xValue/(int)this.width)*this.height;
    }
}
