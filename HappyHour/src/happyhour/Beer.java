package happyhour;

/**
 *Nicholas Knight
 */
public class Beer {
    private String brand;
    private double content;
    private double weight;
    
    public Beer()
    {
        this.brand="No brand";
        this.content=0.0;
        this.weight=0.0;
    }
    
    public Beer(String aBrand, double aContent, double aWeight)
    {
        this.setBrand(aBrand);
        this.setContent(aContent);
        this.setWeight(aWeight);
    }
    public String getBrand()
    {
        return this.brand;
    }
    public double getContent()
    {
        return this.content;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public void setBrand(String aBrand)
    {
        this.brand=aBrand;
    }
    public void setContent(double aContent)
    {
        if(aContent>0 && aContent<1)
        {
            this.content=aContent;
        }
    }
    public void setWeight(double aWeight)
    {
        if(aWeight>0)
        {
            this.weight=aWeight;
        }
    }
    public double Intoxicated(double aIntoxicated)
    {
      aIntoxicated=(((0.08 + 0.015)* weight) / (12* 7.5 * getContent())); 
      return aIntoxicated;
    }
}
