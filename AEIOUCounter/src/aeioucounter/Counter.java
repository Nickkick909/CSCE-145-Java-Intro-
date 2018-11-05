/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeioucounter;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author nicho
 */
public class Counter {
    private String fileName;
    private int finalCount;
    private String text;
    public Counter()
    {
        this.fileName="no file";
        this.finalCount=0;
        this.text="none";
    }
    public Counter(String aFileName, int aFinalCount, String aText)
    {
        this.setFileName(aFileName);
        this.setFinalCount(aFinalCount);
        this.setText(aText);
    }
    public String getFileName()
    {
        return this.fileName;
    }
    public int getFinalCount()
    {
        return this.finalCount;
    }
    public String getText()
    {
        return this.text;
    }
    public void setFileName(String aFileName)
    {
        this.fileName=aFileName;
    }
    public void setFinalCount(int aFinalCount)
    {
        if(aFinalCount>=0)
        {
            this.finalCount=aFinalCount;
        }
    }
    public void setText(String aText)
    {
        this.text=aText;
    }
     public void readFile(String aFileName)
    {
        if(aFileName==null)
            return;
        try
        {    
           
           Scanner fileScanner = new Scanner(new File(aFileName));
           String finalString="";
           while(fileScanner.hasNextLine())
           {
               String fileLine=fileScanner.nextLine();
               finalString+=fileLine;
               
               
             //System.out.println(this.text); 
           
           }
           this.setText(finalString.toLowerCase());
           fileScanner.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
                
    }
     public String toString()
     {
         return "The file "+this.fileName+" has \"AEIOU\" in order "+this.finalCount+" times.";
     }
     public void sort(int i)
     {
         
             String aText=this.text;
             
         
         if(aText.charAt(i)=='a')
            {
                i++;
                
                if(aText.charAt(i)=='e')
                {
                
                i++;
                    if(aText.charAt(i)=='i')
                    {
                        i++;
                        //System.out.println(count.toString());
                        if(aText.charAt(i)=='o')
                        {
                            i++;
                            if(aText.charAt(i)=='u')
                            {
                                this.setFinalCount((this.getFinalCount()+1));
                               
                            }
                                               
                            else if(aText.charAt(i)=='a' ||
                            aText.charAt(i)=='e' ||
                            aText.charAt(i)=='o' ||
                            aText.charAt(i)=='i')
                            {
                            return;
                            }
                            else
                            {
                            i++;
                            }
                        }                    
                        else if(aText.charAt(i)=='a' ||
                        aText.charAt(i)=='e' ||
                        aText.charAt(i)=='i' ||
                        aText.charAt(i)=='u')
                        {
                            return;
                        }
                        else
                        {
                        i++;
                        }
                    }
                    else if(aText.charAt(i)=='a' ||
                        aText.charAt(i)=='e' ||
                        aText.charAt(i)=='o' ||
                        aText.charAt(i)=='u')
                     {
                        return;
                    }
                    else
                    {
                    i++;
                    }
                }
                else if(aText.charAt(i)=='a' ||
                        aText.charAt(i)=='i' ||
                        aText.charAt(i)=='o' ||
                        aText.charAt(i)=='u')
                {
                   return;
                }
                else
                {
                   i++;
                }
            }
     
     }
}
