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
public class MovieDatabase {

    /**
     * @param args the command line arguments
     */
    public static final String FILE="movie_database.txt";
    public static void main(String[] args) {
        // TODO code application logic here
        MovieDatabaseBackend movies= new MovieDatabaseBackend();
        //movies.writeMovieDBFile(FILE);
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Welcome to the movie database!");
        boolean quit=false;
        while(!quit)
        {
            System.out.println("Would you like to"
                    + "\n1. add a movie"
                    + "\n2. remove a movie"
                    + "\n3. sort by title"
                    + "\n4. sort by rating"
                    + "\n5. sort by box office gross"
                    + "\n6. search by director"
                    + "\n7. print the database"
                    + "\nor 9. quit?");
            int choice=keyboard.nextInt();
            keyboard.nextLine();
            switch(choice)
            {
                case 1:
                    Movie nMovie=new Movie();
                    System.out.println("Enter the title");
                    nMovie.setName(keyboard.nextLine());
                    System.out.println("Enter the year");
                    nMovie.setYear(keyboard.nextInt());
                    keyboard.nextLine();
                    System.out.println("Enter the rating");                    
                    nMovie.setRating(keyboard.nextDouble());
                    keyboard.nextLine();
                    System.out.println("Enter the director");
                    nMovie.setDirector(keyboard.nextLine());
                    System.out.println("Enter the box office gross");      
                    nMovie.setBoxOfficeGross(keyboard.nextDouble());
                    keyboard.nextLine();
                    movies.addMovie(nMovie);
                    movies.printFile();
                    break;
                case 2:
                    System.out.println("Enter the title");
                    movies.removeMovie(keyboard.nextLine());
                    
                    break;
                case 3:
                    System.out.println("Enter the title");
                    movies.sortByTitle(keyboard.nextLine());
                    
                    break;
                case 4:
                    System.out.println("Sorted by rating");
                    movies.sortByRating();
                    movies.writeMovieDBFile(FILE);
                    break;
                case 5:
                    System.out.println("Sorted by box office gross");
                    movies.sortByBoxOffice();
                    
                    break;
                case 6:
                    System.out.println("Enter the director");
                    movies.searchDirector(keyboard.nextLine());
                    
                    break;
                case 7:
                    movies.readMovieDBFile(FILE);
                    
                    break;
                case 9:
                    System.out.println("Goodbye");
                    quit=true;
                    break;
            }
                    
        }
    }
    
}
