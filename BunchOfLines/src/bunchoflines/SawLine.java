/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bunchoflines;

/**
 *Nicholas Knight and Kelsey Warf
 */
public class SawLine implements Line{
    private double modValue;
    public SawLine()
    {
        modValue=0.0;
    }
    public SawLine(double aMod)
    {
        this.setModValue(aMod);
    }
    public double getModValue()
    {
        return this.modValue;
    }
    public void setModValue(double aMod)
    {
        this.modValue=aMod;
    }
    public double getYPoint(double xValue)
    {
        return xValue%this.modValue;
    }
}
