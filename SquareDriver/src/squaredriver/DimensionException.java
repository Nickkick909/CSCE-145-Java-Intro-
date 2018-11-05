/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaredriver;

/**
 *Nicholas Knight
 */
public class DimensionException extends Exception {
    public DimensionException()
    {
        super("Dimension Exception");
    }
    public DimensionException(String msg)
    {
        super(msg);
    }
}
