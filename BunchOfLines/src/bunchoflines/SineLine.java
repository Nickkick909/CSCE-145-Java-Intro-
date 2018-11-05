/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bunchoflines;

/**
 *Nicholas Knight Kelsey Warf
 */
public class SineLine implements Line{
    private double amplitude;
    private double frequency;
    public SineLine()
    {
        this.amplitude=0.0;
        this.frequency=0.0;
    }
    public SineLine(double aAmp, double aFreq)
    {
        this.setAmplitude(aAmp);
        this.setFrequency(aFreq);
    }
    public double getAmplitude()
    {
        return this.amplitude;
    }
    public double getFrequency()
    {
        return this.frequency;
    }
    public void setAmplitude(double aAmp)
    {
        this.amplitude=aAmp;
    }
    public void setFrequency(double aFreq)
    {
        this.frequency=aFreq;
    }
    public double getYPoint(double xValue)
    {
        return this.amplitude*Math.sin(xValue*this.frequency);
    }
}
