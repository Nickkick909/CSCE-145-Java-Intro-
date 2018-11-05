
package dresserfrontend;

/**
 *Nicholas Knight
 */
public class Dresser {
    private Clothing[][] drawerArr;
    public static final int DRAWERS=5;
    public static final int ITEMS=10;
    
    public Dresser()
    {
        drawerArr=new Clothing[DRAWERS][ITEMS];
    }
    /*
    public Dresser(int size1, int size2)
    {
        if(size1>0&&size2>0)
        {
            drawerArr=new Clothing[size1][size2];
        }
    }*/
    public void add(Clothing aClothing)
    {
        if(aClothing==null)
                {
                    return;
                }
        if(drawerArr[DRAWERS-1][ITEMS-1]!=null)
        {
            return;
        }
        /*for(int i=0;i<DRAWERS;i++)
        {
            for(int j=0;j<ITEMS;j++)
            {
              if(drawerArr[i][j]==null)
                {
                drawerArr[i][j]=aClothing;
                break;
                }  
            } 
        }*/
        switch(aClothing.getClothingType())
        {
            case Undergarments:
                int i=0;
                for(int j=0;j<ITEMS;j++)
                {
                   if(drawerArr[i][j]==null)
                   {
                        drawerArr[i][j]= aClothing;
                        break;
                   } 
                }
                break;
            case Socks:
                i=1;
                for(int j=0;j<ITEMS;j++)
                {
                   if(drawerArr[i][j]==null)
                   {
                        drawerArr[i][j]= aClothing;
                        break;
                   } 
                }
                break;
            case Stockings:
                i=1;
                for(int j=0;j<ITEMS;j++)
                {
                   if(drawerArr[i][j]==null)
                   {
                        drawerArr[i][j]= aClothing;
                        break;
                   } 
                }
                break;
            case Top:
                i=2;
                for(int j=0;j<ITEMS;j++)
                {
                   if(drawerArr[i][j]==null)
                   {
                        drawerArr[i][j]= aClothing;
                        break;
                   } 
                }
                break;
            case Bottom:
                i=3;
                for(int j=0;j<ITEMS;j++)
                {
                   if(drawerArr[i][j]==null)
                   {
                        drawerArr[i][j]= aClothing;
                        break;
                   } 
                }
                break;
            case Cape:
                i=4;
               for(int j=0;j<ITEMS;j++)
                {
                   if(drawerArr[i][j]==null)
                   {
                        drawerArr[i][j]= aClothing;
                        break;
                   } 
                }
                break;
            
                
        }
    }
    public void remove(Clothing aClothing)
    {
        int removeIndexI=-1;
        int removeIndexJ=-1;
        //search for the clothing
        for(int i=0;i<DRAWERS;i++)
        {
            for(int j=0;j<ITEMS;j++)
            {
                //this line is causing a runtime error that says NullPointerException
                if(aClothing.equals(drawerArr[i][j])) //found clothing
                {
                    removeIndexI=i;
                    removeIndexJ=j;
                    break;
                }                //it deletes 2 item after the one you tell it to delete and the one you wanted it to
            }
        }
        if(removeIndexI==-1 || removeIndexJ==-1)//not found
        {
            return;
        }
        for(int i=removeIndexI;i<DRAWERS-1;i++)//shift the clothing
        {
            for(int j=removeIndexJ;j<ITEMS-1;j++)
            {
                drawerArr[i][j]=drawerArr[i+1][j+1];
            }
            
        }
        drawerArr[DRAWERS-1][ITEMS-1]=null;//fix the last clothing
    }
    public String print()
    {
        String aPrint="";
        for(int i=0;i<DRAWERS;i++)
        {
            for(int j=0;j<ITEMS;j++)
            {
             if(drawerArr[i][j]!=null)
             {
                 aPrint+= "\nDrawer "+i+
                    "\n"+drawerArr[i][j].toString();
             }
            }
        }
        
        
        return aPrint;//drawerArr.toString()+"Test";
    }
}
