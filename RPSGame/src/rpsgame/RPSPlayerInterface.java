/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsgame;

/**
 *Nicholas Knight and Kelsey Warf
 */
public interface RPSPlayerInterface {
    public int getPoints();
    public String getGesture();
    public void setPoints(int aPoints);
    public void setGesture(String aGesture);
    public void chooseGesture();
            
}
