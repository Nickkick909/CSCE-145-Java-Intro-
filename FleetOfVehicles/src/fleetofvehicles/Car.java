/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fleetofvehicles;

/**
 *
 * @author nicho
 */
public class Car extends Vehicle{
    private double gasMileage;
    private int numberOfPassengers;
    
    public Car()
    {
        this.gasMileage=0.0;
        this.numberOfPassengers=0;
    }
    public Car(String aManuName, int aCylinders, String aOwnersName, double aGasMileage, int aNumberOfPassengers)
    {
        super(aManuName,aCylinders,aOwnersName);
        this.setGasMileage(aGasMileage);
        this.setNumberOfPassengers(aNumberOfPassengers);
    }
    public double getGasMileage()
    {
        return this.gasMileage;
    }
    public int getNumberOfPassengers()
    {
        return this.numberOfPassengers;
    }
    public void setGasMileage(double aGasMileage)
    {
        if(aGasMileage>=0.0)
        {
            this.gasMileage=aGasMileage;
        }
    }
    public void setNumberOfPassengers(int aNumberOfPassengers)
    {
        if(aNumberOfPassengers>=0)
        {
            this.numberOfPassengers=aNumberOfPassengers;
        }
    }
    public String toString()
    {
        return super.toString()+"Gas Mileage: "+this.gasMileage
                +"\nNumber Of Passengers: "+this.numberOfPassengers;
    }
    public boolean equals(Car aCar)
    {
        return aCar!=null &&
                super.equals(aCar) &&
                this.gasMileage==aCar.getGasMileage() &&
                this.numberOfPassengers==aCar.getNumberOfPassengers();
    }
}



