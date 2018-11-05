/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bunchoflines;

/**
 *Nicholas Knight and Kelsey Warf
 */
public class ExponentialLine implements Line {
    private double exponent;
    public ExponentialLine()
    {
        this.exponent=0.0;
    }
    public ExponentialLine(double aExponent)
    {
        this.setExponent(aExponent);
    }
    public double getExponent()
    {
        return this.exponent;
    }
    public void setExponent(double aExponent)
    {
        this.exponent=aExponent; 
    }
    public double getYPoint(double xValue)
    {
        return Math.pow(xValue, this.exponent);
    }
}
