/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adimondprogram;

/**
 *Nicholas Knight and Kelsey
 */
public class Diamond extends ShapeBasics implements DiamondInterface{
    private int width;
    
    public Diamond()
    {
        super();
        this.width=0;
    }
    public Diamond(int aWidth,int aOffset)
    {
        super(aOffset);
        this.setWidth(aWidth);
    }
    public int getWidth()
    {
        return this.width;
    }
    public void setWidth(int aWidth)
    {
        if(aWidth%2==1 &&aWidth>=0)
        {
            this.width=aWidth;
        }
    }
    public void drawHere()
    {
        
        drawTopV();
        drawBottomV();
    }
    private void drawTopV()
    {
        int spacesInFront=width/2;
        for(int i=0;i<((width+1)/2);i++)
        {
            skipSpaces(spacesInFront+getOffset());
            spacesInFront--;
            System.out.print("*");
            
            for(int j=0;j<2*i-1;j++)
            {
                System.out.print(" ");
            }
            if(i!=0)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void drawBottomV()
    {
        int spacesInFront=1;
        //int spacesInside=2*(i-1);
        for(int i=width/2;i>0;i--)
        {
            
            skipSpaces(spacesInFront+getOffset());
            spacesInFront++;
            System.out.print("*");
            
            skipSpaces(2*i-3);
            //spacesInside-=2;
            if(i!=1)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void skipSpaces(int skipSpaces)
    {
        for(int i=0;i<skipSpaces;i++)
        {
            System.out.print(" ");
        }
    }
}
