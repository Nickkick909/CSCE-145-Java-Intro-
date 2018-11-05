/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedatabase;

/**
 *Nicholas Knight
 */
public class Movie {
    private String name;
    private int year;
    private double rating;
    private String director;
    private double boxOfficeGross;
    
    public Movie()
    {
     this.name="no name";
     this.year=2018;
     this.rating=0.0;
     this.director="none";
     this.boxOfficeGross=0.0;
    }
    public Movie(String aName, int aYear, double aRating, String aDirector, double aBoxOffice)
    {
        this.setName(aName);
        this.setYear(aYear);
        this.setRating(aRating);
        this.setDirector(aDirector);
        this.setBoxOfficeGross(aBoxOffice);
    }
    public String getName()
    {
        return this.name;
    }
    public int getYear()
    {
        return this.year;
    }
    public double getRating()
    {
        return this.rating;
    }
    public String getDirector()
    {
        return this.director;
    }
    public double getBoxOfficeGross()
    {
        return this.boxOfficeGross;
    }
    public void setName(String aName)
    {
        this.name=aName;
    }
    public void setYear(int aYear)
    {
        if(aYear>=1800)
        {
            this.year=aYear;
        }
    }
    public void setRating(double aRating)
    {
        if(aRating>=0.0 && aRating<=5.0)
        {
            this.rating=aRating;
        }
    }
    public void setDirector(String aDirector)
    {
        this.director=aDirector;
    }
    public void setBoxOfficeGross(double aBoxOffice)
    {
        if(aBoxOffice>=0.0)
        {
            this.boxOfficeGross=aBoxOffice;
        }
    }
    public String toString()
    {
        return this.name+" "+this.year+" "+this.rating+" "+this.director+" "+this.boxOfficeGross;
    }
    public boolean equals(Movie aMovie){
        return aMovie!=null &&
                this.name.equals(aMovie.getName()) &&
                this.year==aMovie.getYear() &&
                this.rating==aMovie.getRating() &&
                this.director.equals(aMovie.getDirector()) &&
                this.boxOfficeGross==aMovie.getBoxOfficeGross();
    }
}

