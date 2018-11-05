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
public class Truck extends Vehicle {
    private double loadCapacity;
    private double towingCapacity;
    
    public Truck()
    {
        super();
        this.loadCapacity=0.0;
        this.towingCapacity=0.0;
    }
    public Truck(String aManuName, int aCylinders, String aOwnersName, double aLoadCapacity, double aTowingCapacity)
    {
        super(aManuName, aCylinders, aOwnersName);
        this.setLoadCapacity(aLoadCapacity);
        this.setTowingCapacity(aTowingCapacity);
    }
    public double getLoadCapacity()
    {
        return this.loadCapacity;
    }
    public double getTowingCapacity()
    {
        return this.towingCapacity;
    }
    public void setLoadCapacity(double aLoadCapacity)
    {
        if(aLoadCapacity>=0.0)
        {
            this.loadCapacity=aLoadCapacity;
        }
    }
    public void setTowingCapacity(double aTowingCapacity)
    {
        if(aTowingCapacity>=0.0)
        {
            this.towingCapacity=aTowingCapacity;
        }
    }
    public String toString()
    {
        return super.toString()+"Load Capactiy: "+this.loadCapacity
                +"\nTowing Capacity: "+this.towingCapacity+"\n";
    }
    public boolean equals(Truck aTruck)
    {
        return aTruck!=null&&
                super.equals(aTruck)&&
                this.loadCapacity==aTruck.getLoadCapacity() &&
                this.towingCapacity==aTruck.getTowingCapacity();
    }
}
