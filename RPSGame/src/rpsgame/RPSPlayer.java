/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsgame;

/**
 *Nicholas Knight and Kelsey Warf
 */
public class RPSPlayer implements RPSPlayerInterface{
    private String gesture;
    private int points;
    public RPSPlayer()
    {
        this.gesture="none";
        this.points=0;
    }
    public String getGesture()
    {
        return this.gesture;
    }
    public int getPoints()
    {
        return this.points;
    }
    public void setGesture(String aGesture)
    {
        if(aGesture.equalsIgnoreCase("Rock") || aGesture.equalsIgnoreCase("Paper") || aGesture.equalsIgnoreCase("Scissors"))
        {
            this.gesture=aGesture;
        }
        else
        {
            System.out.println("That was not a valid choice!");
            this.gesture="none";
        }
    }
    public void setPoints(int aPoints)
    {
        if(points>=0)
        {
            this.points=aPoints;
        }
    }
    public void chooseGesture()
    {
        this.gesture="none";
    }
}
