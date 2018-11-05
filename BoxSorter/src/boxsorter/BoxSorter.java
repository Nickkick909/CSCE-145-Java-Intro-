
package boxsorter;

/**
 *Nicholas Knight
 */
import java.util.Scanner;
public class BoxSorter {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard=new Scanner(System.in);
        Box[] boxArr=new Box[5]; 
        System.out.println("Welcome to the box sorter!!");
        for(int i=0; i<boxArr.length;i++)
        {
            boxArr[i]=new Box();
            System.out.println("Enter the label, length, width, and height of box"+(i+1));
            System.out.print("Label: ");
            boxArr[i].setLabel(keyboard.nextLine());
            System.out.print("Length: ");
            boxArr[i].setLength(keyboard.nextDouble());
            keyboard.nextLine();
            System.out.print("Width: ");
            boxArr[i].setWidth(keyboard.nextDouble());
            keyboard.nextLine();
            System.out.print("Height: ");
            boxArr[i].setHeight(keyboard.nextDouble());
            keyboard.nextLine();
            
        }
         //bubble sort
    boolean hasSwapped=true;
    while(hasSwapped==true)
    {
     hasSwapped=false;
         for(int i=0; i<boxArr.length-1;i++)
         {
           
              if(boxArr[i].getVolume()>boxArr[i+1].getVolume())
              {
               Box temp=boxArr[i];
               boxArr[i]=boxArr[i+1];
               boxArr[i+1]=temp;
               
               hasSwapped=true;
              }
              
         }
    }
    System.out.println("Sorted boxes by volume");
        for (int i=0; i<boxArr.length;i++)
        {
            System.out.println(boxArr[i].toString());
        }
    }
    
}
