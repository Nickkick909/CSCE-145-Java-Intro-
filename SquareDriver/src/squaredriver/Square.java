/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaredriver;

/**
 *Nicholas Knight
 */
public class Square{
    private int length;
    public Square()
    {
        this.length=1;
    }
    public Square(int aLength)
    {
        this.setLength(aLength);
    }
    public int getLength()
    {
        return this.length;
    }
    public void setLength(int aLength) throws DimensionException 
    {
        if(aLength<=0)
        {
            throw new DimensionException();
        }
        else
        {
            this.length=aLength;
        }
    }
    public void draw()
    {
        for(int i=0; i<this.length;i++)
        {
            for(int j=0; j<this.length;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public int getArea()
    {
        return this.length*this.length;
    }
    public int getPerimeter()
    {
        return this.length*4;
    }
}
