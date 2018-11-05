/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsgame;

/**
 *Nicholas Knight and Kelsey Warf
 */
import java.util.Random;
public class RPSComputerPlayer extends RPSPlayer {
    private Random rand;
    public RPSComputerPlayer()
    {
        super();
        rand =new Random();
    }
    public void chooseGesture()
    {
        int number=rand.nextInt(3);
        if(number==0)
        {
           super.setGesture("rock");
        }
        if(number==1)
        {
            super.setGesture("paper");
        }
        if(number==2)
        {
            super.setGesture("scissors");
        }
    }
}
