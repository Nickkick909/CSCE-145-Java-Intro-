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
public class Vehicle {
    private String manuName;
    private int cylinders;
    private String ownersName;
    
    public Vehicle()
    {
        this.manuName="No name yet";
        this.cylinders=1;
        this.ownersName="No name yet";
    }
    public Vehicle(String aManuName, int aCylinders, String aOwnersName)
    {
        this.setManuName(aManuName);
        if(aCylinders>0)
        {
            this.setCylinders(aCylinders);
        }
        this.setOwnersName(aOwnersName);
    }
    public String getManuName()
    {
        return this.manuName;
    }
    public int getCylinders()
    {
        return this.cylinders;
    }
    public String getOwnersName()
    {
        return this.ownersName;
    }
    public void setManuName(String aManuName)
    {
        this.manuName=aManuName;
    }
    public void setCylinders(int aCylinders)
    {
        if(aCylinders>0)
        {
            this.cylinders=aCylinders;
        }
    }
    public void setOwnersName(String aOwnersName)
    {
        this.ownersName=aOwnersName;
    }
    public String toString()
    {
        return "Manufacturer's Name: "+this.getManuName()
                +"\nNumber Of Cylinders: "+this.getCylinders()
                +"\nOwner's Name: "+this.getOwnersName()+"\n";
    }
    public boolean equals(Vehicle aVehicle)
    {
        return aVehicle!= null &&
                this.manuName.equalsIgnoreCase(aVehicle.getManuName()) &&
                this.cylinders== aVehicle.getCylinders() &&
                this.ownersName.equalsIgnoreCase(aVehicle.getOwnersName());
                
    }
}
