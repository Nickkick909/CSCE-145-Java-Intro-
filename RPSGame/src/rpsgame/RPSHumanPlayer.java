/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsgame;

/**
 *Nicholas Knight and Kelsey Warf
 */
import java.util.Scanner;
public class RPSHumanPlayer extends RPSPlayer {
    private Scanner keyboard;
    public RPSHumanPlayer()
    {
        super();
        keyboard=new Scanner(System.in);
    }
    public void chooseGesture()
    {
        super.setGesture(keyboard.nextLine());
    }
}
