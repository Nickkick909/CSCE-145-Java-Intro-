package stringhelpertester;

/**
 *Nicholas Knight
 */

public class StringHelper {
    private String phrase01;
    private String phrase02;
    private String phrase03;
    private String phrase04;
    char[]vowels=new char[]{'a','e','i','o','u'};
    
    public StringHelper()
    {
        this.phrase01="No phrase yet";
        this.phrase02="No phrase yet";
        this.phrase03="No phrase yet";
        this.phrase04="No phrase yet";
    }
    public StringHelper(String aPhrase01, String aPhrase02, String aPhrase03, String aPhrase04)
    {
        //TODO call mutators
        this.setPhrase01(aPhrase01);
        this.setPhrase02(aPhrase02);
        this.setPhrase03(aPhrase03);
        this.setPhrase04(aPhrase04);
    }
    //getters
    public String getPhrase01()
    {
      return this.phrase01;
    }
    public String getPhrase02()
    {
        return this.phrase02;
    }
    public String getPhrase03()
    {
        return this.phrase03;
    }
    public String getPhrase04()
    {
        return this.phrase04;
    }
    //setters
    public void setPhrase01(String aPhrase01)
    {
     this.phrase01=aPhrase01;   
    }
    public void setPhrase02(String aPhrase02)
    {
        this.phrase02=aPhrase02;
    }
    public void setPhrase03(String aPhrase03)
    {
        this.phrase03=aPhrase03;
    }
    public void setPhrase04(String aPhrase04)
    {
        this.phrase04=aPhrase04;
    }
    public String meshStrings(String phrase01, String phrase02)
    {
        String meshed="";
        if(phrase01.length()>phrase02.length())
        {
          for(int i=0; i<phrase01.length();i++)
        {
            if(i<phrase02.length())
            {
            meshed+=phrase01.charAt(i);
            meshed+=phrase02.charAt(i);
            }
            else
            {
                meshed+=phrase01.charAt(i);
            }
        }  
          
        }
        else if(phrase01.length()<phrase02.length())
        {
          for(int i=0; i<phrase02.length();i++)
        {
            if(i<phrase01.length())
            {
            meshed+=phrase01.charAt(i);
            meshed+=phrase02.charAt(i);
            }
            else
            {
                meshed+=phrase02.charAt(i);
            }
        }
        }
          else
          {
           for(int i=0; i<phrase01.length();i++)
        {
            meshed+=phrase01.charAt(i);
            meshed+=phrase02.charAt(i);
        }        
          }
         
        
        return meshed;
    }
    public String replaceVowelsWithOodle(String phrase03)
    {
        String replacedVowels="";
        for(int i=0; i<phrase03.length();i++)
        {
           if(phrase03.charAt(i)==vowels[0])
        {
        replacedVowels+="oodle";
        }
        else if(phrase03.charAt(i)==vowels[1])
        {
        replacedVowels+="oodle";
        }
        else if(phrase03.charAt(i)==vowels[2])
        {
        replacedVowels+="oodle";
        }
        else if(phrase03.charAt(i)==vowels[3])
        {
        replacedVowels+="oodle";
        }
        else if(phrase03.charAt(i)==vowels[4])
        {
        replacedVowels+="oodle";
        }
           else
        {
            replacedVowels+=phrase03.charAt(i);
        }
        }
        
        return replacedVowels;
    }
    public double weight(String phrase04)
    {
        double wordWeight=0;
        for(int i=0; i<phrase04.length();i++)
        {
        if(phrase03.charAt(i)==vowels[0])
        {
        wordWeight+=2.5;
        }
        else if(phrase03.charAt(i)==vowels[1])
        {
        wordWeight+=2.5;
        }
        else if(phrase03.charAt(i)==vowels[2])
        {
        wordWeight+=2.5;
        }
        else if(phrase03.charAt(i)==vowels[3])
        {
        wordWeight+=2.5;
        }
        else if(phrase03.charAt(i)==vowels[4])
        {
        wordWeight+=2.5;
        }
           else
        {
            wordWeight+=3.4;
        }
        }
        
        return wordWeight;   
    }
    
    
    
}
