/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bunchoflines;

/**
 *Nicholas Knight and Kelsey Warf
 */
public class SlopedLine implements Line {
    private double slope;
    public SlopedLine()
    {
        this.slope=0.0;
    }
    public SlopedLine(double aSlope)
    {
        this.setSlope(aSlope);
    }
    public double getSlope()
    {
        return this.slope;
    }
    public void setSlope(double aSlope)
    {
        this.slope=aSlope;
    }
    public double getYPoint(double xPoint)
    {
        return this.slope*xPoint;
    }
}
