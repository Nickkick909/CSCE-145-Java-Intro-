package stringhelpertester;

/**
 *Nicholas Knight
 */
import java.util.Scanner;
public class StringHelperTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringHelper test01=new StringHelper("doggo","kitty","wowohwow","whynot");
        StringHelper test02=new StringHelper("thingy","rock","road","cat");
        StringHelper test03=new StringHelper("harp","fiddle","burrito","taco");
        
        System.out.println("Welcome to the String Helper Tester");
        System.out.println("Meshing "+test01.getPhrase01()+ " with "+ test01.getPhrase02());
        System.out.println(test01.meshStrings(test01.getPhrase01(), test01.getPhrase02()));
        System.out.println("Replacing vowels in the word "+test01.getPhrase03()+" with oodle");
        System.out.println(test01.replaceVowelsWithOodle(test01.getPhrase03()));
        System.out.println("The weight of the word "+test01.getPhrase04()+" is");
        System.out.println(test01.weight(test01.getPhrase04()));    
        
        System.out.println("Meshing "+test02.getPhrase01()+ " with "+ test02.getPhrase02());
        System.out.println(test02.meshStrings(test02.getPhrase01(), test02.getPhrase02()));
        System.out.println("Replacing vowels in the word "+test02.getPhrase03()+" with oodle");
        System.out.println(test02.replaceVowelsWithOodle(test02.getPhrase03()));
        System.out.println("The weight of the word "+test02.getPhrase04()+" is");
        System.out.println(test02.weight(test02.getPhrase04())); 
        
        System.out.println("Meshing "+test03.getPhrase01()+ " with "+ test03.getPhrase02());
        System.out.println(test03.meshStrings(test03.getPhrase01(), test03.getPhrase02()));
        System.out.println("Replacing vowels in the word "+test03.getPhrase03()+" with oodle");
        System.out.println(test03.replaceVowelsWithOodle(test03.getPhrase03()));
        System.out.println("The weight of the word "+test03.getPhrase04()+" is");
        System.out.println(test03.weight(test03.getPhrase04())); 
    }
    
}
