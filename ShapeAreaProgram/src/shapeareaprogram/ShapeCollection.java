/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeareaprogram;

/**
 *
 * @author nicho
 */
public class ShapeCollection {
   public static final int SIZE=10;
    private Shape[] shapes;
    public ShapeCollection(){
        shapes=new Shape[SIZE];
    }
    public void addShape(Shape aShape){
        for(int i=0;i<shapes.length;i++)
        {
            
            if(shapes[SIZE-1]!=null){
                System.out.println("Full");
                i=15;
            }
            else{
                
                if(shapes[i]==null){
                    shapes[i]=aShape;
                    
                    i=15;
                }
            }
        }
     this.sortShapes();
    }
    private void sortShapes(){  
    boolean hasSwapped=true;
    while(hasSwapped==true)
    {
     hasSwapped=false;
         for(int i=0; i<shapes.length-1;i++)
         {
           if(shapes[i]!=null && shapes[i+1]!=null){
              if(shapes[i].getArea()>shapes[i+1].getArea())
              {
               Shape temp=shapes[i];
               shapes[i]=shapes[i+1];
               shapes[i+1]=temp;
               
               hasSwapped=true;
              }
           }
              
         }
    }
    }
    public void removeShapes(String aType, double aArea){
        for(int i=0;i<shapes.length;i++){
            if(shapes[i].getShapeType().equalsIgnoreCase(aType) && shapes[i].getArea()==aArea)
            { 
                shapes[i]=null;
                i=15;
            
            for(int j=0;j<shapes.length-1;j++)
            {
                if(shapes[j]==null && shapes[j+1]!=null)
                {
                    shapes[j]=shapes[j+1];
                    shapes[j+1]=null;
                    j--;
                }
            }
            }
        }
    }
    public void printShapes(){
        /*for(int i=0; i<shapes.length;i++){
            //if(shapes[i]!=null){
                System.out.println(shapes[i].toString());    
            //}
        }*/
        for(int i=0; i<shapes.length;i++)
        {
            if(shapes[0]==null)
            {
                System.out.println("None");
                i=15; //used to break the loop;
            }
            else if(shapes[i]==null)
            {
                i=15;
            }
            else
            {
            System.out.println(shapes[i].toString());
            
            }
        }
    }
    
}
