package salaryanalyzer1;

/**
 *Nicholas Knight
 */
import java.io.*;
import java.util.*;
public class SalaryAnalyzer1 {
	static final String IN_FILE_NAME = "StateOfSC-Salary-List-04012015.txt";
	static final String OUT_FILE_NAME = "OVER250000.txt";
	static final String DELIM = "\t";
	public static void main(String[] args)
	{
		System.out.println("Let's see how many state employees make over $250,000 and work at USC.");
		analyzeEmployeeFile(IN_FILE_NAME);
                //printToSalaryFile(IN_FILE_NAME,OUT_FILE_NAME);
		System.out.println("Results have been printed to "+OUT_FILE_NAME);
                
	}
	public static void analyzeEmployeeFile(String fileName)
	{
            if(IN_FILE_NAME==null)
                return;
            try
            {
              Scanner fileScanner= new Scanner(new File(IN_FILE_NAME));
              String fileLine=fileScanner.nextLine();
              
              String[] splitLines=fileLine.split(DELIM);
      
              fileScanner=new Scanner(new File(IN_FILE_NAME));
              //read the body
              int count=0;
              while(fileScanner.hasNextLine())
              {
                  //fileLine = fileScanner.nextLine();
                  fileLine =fileScanner.nextLine();
                  splitLines=fileLine.split(DELIM);
                  if(splitLines.length==8 && splitLines[0].equalsIgnoreCase("University of South Carolina"))
                  {
                      String agency= splitLines[0];
                      String lName= splitLines[1];
                      String fName=splitLines[2];
                      String mName= splitLines[3];
                      String jobTitle=splitLines[4];
                      String base=splitLines[5];
                      String bonus=(splitLines[6]);
                      String total=(splitLines[7]);
                      double totalPay=Integer.parseInt(total);
                      if(totalPay>=250000 && agency.equalsIgnoreCase("University of South Carolina"))
                      {
                          for(int i=0; i<splitLines.length;i++)
                          {
                              System.out.println(splitLines[i]+" ");
                              printToSalaryFile(OUT_FILE_NAME, splitLines[i]);
                          }
                          
                      }
                      
                      count++;
                      
                  }
                  
                  
              }
              printToSalaryFile(IN_FILE_NAME,OUT_FILE_NAME);
              fileScanner.close();
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
           catch(Exception e)
            {
                System.out.println(e);//this is getting thrown saying that "line not found"
            }
                
            
	}
	public static void printToSalaryFile(String fileName, String text)
	{
            if(fileName==null)
                return;
            try
            {
                PrintWriter fileW= new PrintWriter(new FileOutputStream(fileName));
                fileW.close();
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
	}
}
