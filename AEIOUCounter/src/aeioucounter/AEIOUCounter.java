package aeioucounter;

import java.util.Scanner;
import java.io.*;
/**
 *Nicholas Knight
 */
public class AEIOUCounter {
public static final String FILE_NAME="blah.txt";
public static final String DELIM="\t";
    
    public static void main(String[] args) {
        Counter count= new Counter(FILE_NAME,0, "");
        count.readFile(FILE_NAME);
        //System.out.println(count.toString());
        for(int i=0; i< count.getText().length();i++)
        {
         count.sort(i);
        }
        System.out.println(count.toString());
        
        //couldn't get it to skip non vowels after it found the first vowel in the chain
        
        
        
    }
   
}
