package concertpromotion;

/**
 *Nicholas Knight
 */
public class Concert {
    //create attributes
    private String name;
    private int capacity;
    private int numbByPhone;
    private int numbByPerson;
    private double priceByPhone;
    private double priceAtVenue;

public Concert()
{
this.name="No name yet";
this.capacity=0;
this.numbByPhone=0;
this.numbByPerson=0;
this.priceByPhone=0.0;
this.priceAtVenue=0.0;
}
public Concert(String aName, int aCapacity, double aPriceByPhone, double aPriceAtVenue)//param const 1
{
   this.setName(aName);
   this.setCapacity(aCapacity);
   this.setPriceByPhone(aPriceByPhone);
   this.setPriceAtVenue(aPriceAtVenue);
}
public Concert(String aName, int aCapacity, int aNumbByPhone, int aNumbByPerson, double aPriceByPhone, double aPriceAtVenue)//param const 2
{
   this.setName(aName);
   this.setCapacity(aCapacity);
   this.setNumbByPhone(aNumbByPhone);
   this.setNumbByPerson(aNumbByPerson);
   this.setPriceByPhone(aPriceByPhone);
   this.setPriceAtVenue(aPriceAtVenue);
}

public String getName()
{
return this.name;
}
public int getCapacity()
{
return this.capacity;
}
public int getNumberOfTicketsSoldByPhone()
{
return this.numbByPhone;
}
public int getNumberOfTicketsSoldAtVenue()
{
return this.numbByPerson;
}
public double getPriceAtVenue()
{
return this.priceAtVenue;
}
public double getPriceByPhone()
{
return this.priceByPhone;
}

public void setName(String aName)
{
    this.name=aName;
}
public void setCapacity(int aCapacity)
{
    if(capacity>0)
    {
        this.capacity=aCapacity;
    }
}
public void setNumbByPhone(int aNumbByPhone)
{
    if(numbByPhone>0)
    {
        this.numbByPhone=aNumbByPhone;
    }
}
public void setNumbByPerson(int aNumbByPerson)
{
    if(numbByPerson>0)
    {
        this.numbByPerson=aNumbByPerson;
    }
}
public void setPriceByPhone(double aPriceByPhone)
{
    if(priceByPhone>0)
    {
        this.priceByPhone=aPriceByPhone;
    }
}
public void setPriceAtVenue(double aPriceAtVenue)
{
    if(priceAtVenue>0)
    {
        this.priceAtVenue=aPriceAtVenue;
    }
}
public int TotalNumberOfTicketsSold()
{
    return numbByPhone+numbByPerson; 
}
public int TicketsRemaining()
{
    return capacity-TotalNumberOfTicketsSold();
}
public void BuyTicketsAtVenue(int aBuyTicketsAtVenue)
{
 if(TicketsRemaining()>=aBuyTicketsAtVenue)
 {
     numbByPerson+=aBuyTicketsAtVenue;
 }
}
public void BuyTicketsByPhone(int aBuyTicketsByPhone)
{
   if(TicketsRemaining()>=aBuyTicketsByPhone)
   {
       numbByPhone+=aBuyTicketsByPhone;
   }
}
public double TotalSales()
{
 return (numbByPerson*priceAtVenue)+(numbByPhone*priceByPhone);   
}
}   
