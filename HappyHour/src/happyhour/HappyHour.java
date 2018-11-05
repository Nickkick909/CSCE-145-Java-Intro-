package happyhour;

/**
 *Nicholas Knight
 */
import java.util.Scanner;
public class HappyHour {

    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        Beer beer1=new Beer();
        Beer beer2=new Beer();
        System.out.println("Let's Party! Responsibly....."
        +"\nWhat's the name of the first beer?");
        beer1.setBrand(keyboard.nextLine());
        System.out.println("What's the alcoholic content?");
        beer1.setContent(keyboard.nextDouble());
        keyboard.nextLine();
        System.out.println("What's the name of the second beer?");
        beer2.setBrand(keyboard.nextLine());
        System.out.println("What's the alcoholic content?");
        beer2.setContent(keyboard.nextDouble());
        keyboard.nextLine();
        System.out.println("What's the weight of the person consuming said beverages?");
        beer1.setWeight(keyboard.nextDouble());
        beer2.setWeight(beer1.getWeight());
        System.out.println("It would take "+beer1.Intoxicated(0)+ " \n"+
                beer1.getBrand()+ " beers to become intoxicated.");
        System.out.println("It would take "+beer2.Intoxicated(0)+ " \n"+
                beer2.getBrand()+ " beers to become intoxicated.");
        System.out.println("Drink responsibly kids!!");
    }
    
}
