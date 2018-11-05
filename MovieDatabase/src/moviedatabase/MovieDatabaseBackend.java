/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase;

/**
 *
 * @author nicho
 */
import java.util.Scanner;
import java.io.*;
public class MovieDatabaseBackend {
    public static final int DEFAULT_SIZE=100;
    public static final String DELIM="\t";
    private int lastIndex;
    private Movie[] movies;
    
    public MovieDatabaseBackend()
    {
        init(DEFAULT_SIZE);
    }
    public MovieDatabaseBackend(int size)
    {
        init(size);
    }
    private void init(int size)//initialization
    {
        if(size<=0)
            return;
        movies=new Movie[size];
        lastIndex=0;
    }
    public void addMovie(Movie aMovie)
    {
        //this.init(movies.length);
        if(lastIndex>=movies.length)//array is full
            return;
        movies[lastIndex]= aMovie;
        lastIndex++; 
        
        this.writeMovieDBFile("movie_database.txt");
    }
    public void removeMovie(String aTitle)
    {
        for(int i=0; i<movies.length;i++)
        {
              
            if(movies[i] ==null)
              {
                  break;
              }
           
            if(movies[i].getName().equals(aTitle))
            {
                movies[i]=null;
                for(int j=i;j<movies.length;j++)
                {
                    movies[i]=movies[i+1];
                    if(movies[i+2]==null)
                    {
                        movies[i+1]=null;
                        break;
                    }
                }
            }
        }
    }
    public void writeMovieDBFile(String aFileName)
    {
        if(aFileName==null)
            return;
        try
        {
            PrintWriter fileWriter= 
                    new PrintWriter(new FileOutputStream(aFileName));
            for(Movie movie : movies)
            {
                if(movie==null)
                    break;
                fileWriter.println(movie.getName()+DELIM+
                        movie.getYear()+DELIM +
                        movie.getRating() +DELIM+
                        movie.getDirector() +DELIM+
                        movie.getBoxOfficeGross());
                
            }
            fileWriter.close();
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
    public void readMovieDBFile(String aFileName)
    {
        if(aFileName==null)
            return;
        try
        {    
           //clearMovies();
           Scanner fileScanner = new Scanner(new File(aFileName));
           
           while(fileScanner.hasNextLine())
           {
               String fileLine=fileScanner.nextLine();
               System.out.println(fileLine);
               String [] splitLines=fileLine.split(DELIM);
               if(splitLines.length==5)
               {
                   this.addMovie(new Movie(splitLines[0], Integer.parseInt(splitLines[1]),
                   Double.parseDouble(splitLines[2]), splitLines[3],
                   Double.parseDouble(splitLines[4])));
                   
               }
           }
           fileScanner.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }       
    }
    public void sortByTitle(String aTitle)
    {
        
        for(int i=0;i<movies.length;i++)
        {
            if(movies[i] ==null)
              {
                  break;
              }
            if(movies[i].getName().equals(aTitle))
            {
                System.out.println(movies[i]);
            }
        }
    }
    public void sortByRating()
    {
    //bubble sort
    boolean hasSwapped=true;
    while(hasSwapped==true)
    {
     hasSwapped=false;
         for(int i=0; i<movies.length-1;i++)
         {
            if(movies[i] ==null || movies[i+1]==null)
              {
                  break;
              }
              if(movies[i].getRating()>movies[i+1].getRating())
              {
               Movie temp=movies[i];
               movies[i]=movies[i+1];
               movies[i+1]=temp;
               
               hasSwapped=true;
              }
             
              
         }
    }
        //this.printFile();
        
    }
    public void sortByBoxOffice()
    {
        //bubble sort
    boolean hasSwapped=true;
    while(hasSwapped==true)
    {
     hasSwapped=false;
         for(int i=0; i<movies.length-1;i++)
         {
           if(movies[i] ==null || movies[i+1]==null)
              {
                  break;
              }
              if(movies[i].getBoxOfficeGross()>movies[i+1].getBoxOfficeGross())
              {
               Movie temp=movies[i];
               movies[i]=movies[i+1];
               movies[i+1]=temp;
               
               hasSwapped=true;
              }
              
         }
    }
        
    }
    public void searchDirector(String aDirector)
    {
        for(int i=0;i<movies.length;i++)
        {
            if(movies[i] ==null)
              {
                  break;
              }
            if(movies[i].getDirector().equals(aDirector))
            {
                System.out.println(movies[i]);
            }
        }
        
    }
    public void printFile()
    {
       for(int i=0;i<movies.length;i++)
        {
            if(movies[i]!=null){
           System.out.println(movies[i]);  
            }
        }
        //System.out.println(this.readMovieDBFile(aFile));
       
    }
    
    
    private void clearMovies()
    {
        for(int i= 0; i<movies.length;i++)
        {
            movies[i]=null;
        }
    }
    
}
