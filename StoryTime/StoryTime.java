/**
 * Created by Nicholas Knight
 */
import java.util.Scanner;
public class StoryTime {
  
  
  public static void main(String[] args) { 
    Scanner keyboard= new Scanner(System.in);
    System.out.println("It is a hot and clear summer day. What kind of car do you take on a drive? \nA top down Mustang, or a top down Jeep? (Mustang or Jeep)");
    String car=keyboard.nextLine();
    
    if(car.equalsIgnoreCase("mustang")) 
    {
     System.out.println("You make the correct decision of taking the convertible sports car for a joyride." + 
                        "\nYou are driving down the road and come to a 4 way stop. \nDo you go \"left\", \"right\", or \"straight?\""); 
         String fourWayStop= keyboard.nextLine();
         if(fourWayStop.equalsIgnoreCase("left"))
         {
           System.out.println("You turn left." +
                                "\nThis road is very bumpy, so you have to drive super slow."+
                                "\nSince you brought a sports car, you don't enjoy going slow." +
                              "\nWhat do you do? Make a u-turn and go back \"home\", or have fun and drive \"fast?\"");
               String bumpyRoad= keyboard.nextLine();
               if(bumpyRoad.equalsIgnoreCase("home")) 
               {
                 System.out.println("You go home and make yourself a sandwich and play with your doggo. THE END");
               }
                  else if (bumpyRoad.equalsIgnoreCase("fast")) 
                  {
                    System.out.println("You say screw it and drive fast."+
                                       "\nAfter all, what's a sports car for?" +
                                       "\nAfter a few miles the bumps get to your car, and it breaks." +
                                       "\nSince you chose to drive quickly on a poor quality road, you get stranded on the side of the road "+
                                       "\nwaiting for someone to come get you, and you now have a repair bill. THE END");
                  }
                  else 
                  {
                    System.out.println("You lose");
                  }
         }
         else if(fourWayStop.equalsIgnoreCase("right"))
         {
           System.out.println("You find a guy on the side of the road."
                                +"\nYou know how to change a flat tire (\"true\" or \"false\")");
           Boolean knowHow=keyboard.nextBoolean();
           
           System.out.println("You have your phone (\"true\" or \"false\")");
           Boolean havePhone=keyboard.nextBoolean();
           
           System.out.println("You trust the guy (\"true\" or \"false\")");
           Boolean trustHim=keyboard.nextBoolean();
           //System.out.println("right");
               if(trustHim && knowHow)
               {
                 System.out.println("Trusting him, you park behind him on the side of the road. You get out of your car and walk up to him and ask"
                                           +"\n\"Hey, do you need help\""
                                           +"\n\"Yeah, actually! Do you know how to change one? I promise I will reward you if you help.\""
                                           +"\n\"I do in fact know how to change a flat.\""
                                           +"\nYou help him change his flat tire, then he reaches in his pocket and gives you a folded up piece of paper."
                                           +"\n\"For your help\" he says"
                                           +"\nYou unfold the paper and it turns out to be a power ball ticket that has the winning numbers!!"
                                           +"\nThis man just gave you a ticket that is worth $50 million!!"
                                           +"\nHe smiles at you and drives off."
                                           +"\nYou quickly claim the 50 million, and go home a millionaire. THE END");;
               }
               else if(trustHim && havePhone && !knowHow)
               {
                System.out.println("Trusting him, you park behind him on the side of the road. You get out of your car and walk up to him and ask"
                                  +"\n\"Hey, do you need me to call someone?\""
                                  +"\n\"Yeah, that would be great. My phone died and I have a flat tire.\""
                                  +"\nYou call a mechanic and tell him your location"
                                  +"\nAfter the tire has been changed and the mechanic is gone, the man gives you ay folded up piece of paper."
                                           +"\n\"For your help\" he says"
                                           +"\nYou unfold the paper and it turns out to be a power ball ticket that has the winning numbers!!"
                                           +"\nThis man just gave you a ticket that is worth $50 million!!"
                                           +"\nHe smiles at you and drives off."
                                           +"\nYou quickly claim the 50 million, and go home a millionaire. THE END"); 
               }
               else if((knowHow && !trustHim) ||(havePhone && !trustHim))
               {
                 System.out.println("You don't fully trust him but want to help");
                     if(knowHow)
                     {
                      System.out.println("You pull up next to him on the road, but you stay in your car. You roll down the window and ask"
                                           +"\n\"Hey, do you have a flat tire?\""
                                           +"\n\"Yeah, actually! Do you know how to change one? I promise I will reward you if you help.\""
                                           +"\n\"I do in fact know how to change a flat.\""
                                           +"\nYou park you car off the road in front of his and get out."
                                           +"\nYou help him change his flat tire, then he reaches in his pocket and gives you a folded up piece of paper."
                                           +"\n\"For your help\" he says"
                                           +"\nYou unfold the paper and it turns out to be a power ball ticket that has the winning numbers!!"
                                           +"\nThis man just gave you a ticket that is worth $50 million!!"
                                           +"\nHe smiles at you and drives off."
                                           +"\nYou quickly claim the 50 million, and go home a millionaire. THE END");
                     }
                     else
                     {
                      System.out.println("You pull up next to him on the road, but you stay in your car. You roll down the window and ask"
                                           +"\n\"Hey, do you need me to call someone?\""
                                           +"\n\"Yeah, that would be great. My phone died and I have a flat tire.\""
                                           +"\nYou call a mechanic and tell him your location"
                                           +"\nAfter the tire has been changed and the mechanic is gone, the man gives you ay folded up piece of paper."
                                           +"\n\"For your help\" he says"
                                           +"\nYou unfold the paper and it turns out to be a power ball ticket that has the winning numbers!!"
                                           +"\nThis man just gave you a ticket that is worth $50 million!!"
                                           +"\nHe smiles at you and drives off."
                                           +"\nYou quickly claim the 50 million, and go home a millionaire. THE END");
                     }
               }
               else if(!knowHow && !havePhone && !trustHim)
               {
                System.out.println("You don't have your phone, know how to change a flat, and you don't trust the guy on the side of the road,"
                                  +"\nso you keep driving. You enjoy the rest of your ride, but you can't help, but to think about that guy."
                                  +"\nWhat if he never got help? You go back home and feel bad for not being able to help the guy. THE END"); 
               }
               
         }
         else if(fourWayStop.equalsIgnoreCase("straight"))
         {
           System.out.println("You keep going straight." +
                              "\nThis road leads to an interstate, so you merge onto the interstate."+
                              "\nThe posted speed limit is 70. How fast do you go?" +
                              "\nEnter a speed (mph).");
               int speed=keyboard.nextInt();
               keyboard.nextLine();
               if((speed<65) || (speed==65)) 
               {
                 System.out.println("You go under the speed limit, because you do not want to get a ticket, but you piss off every single driver on the road." + 
                                    "\nYou learn that you should not drive so slow on the interstate. THE END");
               }
               else if((speed>65) &&(speed<80))
               {
                 System.out.println("You drive stick close to the speed limit. You do not encounter and issues with law enforcement or other drivers, "+
                                      "\nand you have a fun drive. THE END");
               }
               else if((speed==80) || (speed>80))
               {
                 System.out.println("You enjoy speeding through the traffic with the wind in your hair and the sound of a mighty V8 behind you." +
                                      "\nAfter about 10 minutes, you see blue lights behind you. Do you \"pull over\" or \"floor it?\"");
                     String cops=keyboard.nextLine();
                     if(cops.equalsIgnoreCase("pull over"))
                     {
                       System.out.println("You pull over for the cop and he gives you a warning and lets you go on your way."
                                         +"\nYour enjoy the rest of your ride and don't speed. THE END");
                     }
                     else if(cops.equalsIgnoreCase("floor it"))
                     {
                       System.out.println("You floor it and try to lose him. You make a good effort, but soon back up arrives and you are forced to stop."
                                            +"\nYou get arrested with serious charges, and lose your precious car. THE END");
                     }
                 
               }
           
         }
         else {
           System.out.println("You lose");
         }
    }
    else if(car.equalsIgnoreCase("jeep"))
    {
      System.out.println("You make a pretty good decision to take a convertible Jeep for a joyride."
                           +"\nYou are driving down the road and come to a 4 way stop. Do you go \"left\", \"right\", or \"straight\"?");
          String fourWayStop= keyboard.nextLine();
          if(fourWayStop.equalsIgnoreCase("left"))
          {
            System.out.println("You turn left."+
                               "\nThis road is very bumpy, so you have to drive slow. Since you brought a Jeep, you don't mind" +
                               "\ngoing over some bumps, so you keep going at a pretty normal speed." +
                               "\nYou see what appears to be a trail that leads through the woods."+
                               "\nDo you follow the \"trail\" or stay on the \"road?\"");
                String offRoad= keyboard.nextLine();
                    if(offRoad.equalsIgnoreCase("trail"))
                    {
                      System.out.println("You decide to have fun and go off roading."
                                           +"\nIt turns out that the trail is actually great for driving."
                                           +"\nYou have a fun time spinning in the mud and climbing hills."
                                           +"\nAfter about 10 min you come across a lost dog"
                                        +"\nYou do the sensible thing and yell out\"Hey is anyone missing a dog\""
                                        +"\nNo one answers you so you put the dog in your car and head back home."
                                        +"\nYou make flyers for the lost dog, but no one ever shows up to claim him."
                                        +"\nYou end up getting attatched to him, and you decide to keep him. THE END");
                    }
                    else if(offRoad.equalsIgnoreCase("road"))
                    {
                      System.out.println("You stay on the road. You keep driving for a while when you start to feel rain."
                                           +"\nSince your Jeep is convertible this is bad."
                                           +"\nYou turn around and floor it, trying to get home as quickly as possible."
                                           +"\nYou didn't realise how long you had been driving. It turns out that you were almost an hour away from home."
                                           +"\nBy the time you get home, you and the entire interior of your Jeep are soaked."
                                           +"\nYou pull into the garage and go inside and try to dry off."
                                           +"\nSuch a beautiful day ruined by a little rain. THE END");  
                    }
                    else
                    {
                      System.out.println("You lose");
                    }
          }
          else if(fourWayStop.equalsIgnoreCase("right"))
          {
           System.out.println("You find a guy on the side of the road."
                                +"\nYou know how to change a flat tire (\"true\" or \"false\")");
           Boolean knowHow=keyboard.nextBoolean();
           
           System.out.println("You have your phone (\"true\" or \"false\")");
           Boolean havePhone=keyboard.nextBoolean();
           
           System.out.println("You trust the guy (\"true\" or \"false\")");
           Boolean trustHim=keyboard.nextBoolean();
           //System.out.println("right");
               if(trustHim && knowHow)
               {
                 System.out.println("Trusting him, you park behind him on the side of the road. You get out of your car and walk up to him and ask"
                                           +"\n\"Hey, do you need help\""
                                           +"\n\"Yeah, actually! Do you know how to change one? I promise I will reward you if you help.\""
                                           +"\n\"I do in fact know how to change a flat.\""
                                           +"\nYou help him change his flat tire, then he reaches in his pocket and gives you a folded up piece of paper."
                                           +"\n\"For your help\" he says"
                                           +"\nYou unfold the paper and it turns out to be a power ball ticket that has the winning numbers!!"
                                           +"\nThis man just gave you a ticket that is worth $50 million!!"
                                           +"\nHe smiles at you and drives off."
                                           +"\nYou quickly claim the 50 million, and go home a millionaire. THE END");;
               }
               else if(trustHim && havePhone && !knowHow)
               {
                System.out.println("Trusting him, you park behind him on the side of the road. You get out of your car and walk up to him and ask"
                                  +"\n\"Hey, do you need me to call someone?\""
                                  +"\n\"Yeah, that would be great. My phone died and I have a flat tire.\""
                                  +"\nYou call a mechanic and tell him your location"
                                  +"\nAfter the tire has been changed and the mechanic is gone, the man gives you ay folded up piece of paper."
                                           +"\n\"For your help\" he says"
                                           +"\nYou unfold the paper and it turns out to be a power ball ticket that has the winning numbers!!"
                                           +"\nThis man just gave you a ticket that is worth $50 million!!"
                                           +"\nHe smiles at you and drives off."
                                           +"\nYou quickly claim the 50 million, and go home a millionaire. THE END"); 
               }
               else if((knowHow && !trustHim) ||(havePhone && !trustHim))
               {
                 System.out.println("You don't fully trust him but want to help");
                     if(knowHow)
                     {
                      System.out.println("You pull up next to him on the road, but you stay in your car. You roll down the window and ask"
                                           +"\n\"Hey, do you have a flat tire?\""
                                           +"\n\"Yeah, actually! Do you know how to change one? I promise I will reward you if you help.\""
                                           +"\n\"I do in fact know how to change a flat.\""
                                           +"\nYou park you car off the road in front of his and get out."
                                           +"\nYou help him change his flat tire, then he reaches in his pocket and gives you a folded up piece of paper."
                                           +"\n\"For your help\" he says"
                                           +"\nYou unfold the paper and it turns out to be a power ball ticket that has the winning numbers!!"
                                           +"\nThis man just gave you a ticket that is worth $50 million!!"
                                           +"\nHe smiles at you and drives off."
                                           +"\nYou quickly claim the 50 million, and go home a millionaire. THE END");
                     }
                     else
                     {
                      System.out.println("You pull up next to him on the road, but you stay in your car. You roll down the window and ask"
                                           +"\n\"Hey, do you need me to call someone?\""
                                           +"\n\"Yeah, that would be great. My phone died and I have a flat tire.\""
                                           +"\nYou call a mechanic and tell him your location"
                                           +"\nAfter the tire has been changed and the mechanic is gone, the man gives you ay folded up piece of paper."
                                           +"\n\"For your help\" he says"
                                           +"\nYou unfold the paper and it turns out to be a power ball ticket that has the winning numbers!!"
                                           +"\nThis man just gave you a ticket that is worth $50 million!!"
                                           +"\nHe smiles at you and drives off."
                                           +"\nYou quickly claim the 50 million, and go home a millionaire. THE END");
                     }
               }
               else if(!knowHow && !havePhone && !trustHim)
               {
                System.out.println("You don't have your phone, know how to change a flat, and you don't trust the guy on the side of the road,"
                                  +"\nso you keep driving. You enjoy the rest of your ride, but you can't help, but to think about that guy."
                                  +"\nWhat if he never got help? You go back home and feel bad for not being able to help the guy. THE END"); 
               }
               
         }
          else if(fourWayStop.equalsIgnoreCase("straight"))
          {
            System.out.println("You keep going straight." +
                              "\nThis road leads to an interstate, so you merge onto the interstate."+
                              "\nThe posted speed limit is 70. How fast do you go?" +
                              "\nEnter a speed (mph).");
               int speed=keyboard.nextInt();
               keyboard.nextLine();
               if((speed<65) || (speed==65)) 
               {
                 System.out.println("You go under the speed limit, because you do not want to get a ticket, but you piss off every single driver on the road." + 
                                    "\nYou learn that you should not drive so slow on the interstate. THE END");
               }
               else if((speed>65) &&(speed<80))
               {
                 System.out.println("You drive stick close to the speed limit. You do not encounter and issues with law enforcement or other drivers, "+
                                      "\nand you have a fun drive. THE END");
               }
               else if((speed==80) || (speed>80))
               {
                 System.out.println("You enjoy speeding through the traffic with the wind in your hair and the sound of a muffled engine behind you." +
                                      "\nAfter about 10 minutes, you see blue lights behind you. Do you \"pull over\" or \"floor it?\"");
                     String cops=keyboard.nextLine();
                     if(cops.equalsIgnoreCase("pull over"))
                     {
                       System.out.println("You pull over for the cop and he gives you a warning and lets you go on your way."
                                         +"\nYour enjoy the rest of your ride and don't speed. THE END");
                     }
                     else if(cops.equalsIgnoreCase("floor it"))
                     {
                       System.out.println("You floor it and try to lose him. You make a good effort, but soon back up arrives and you are forced to stop."
                                            +"\nYou get arrested with serious charges, and lose your precious off-roading toy. THE END");
                     }
                 
               }
           
          }
          else
          {
            System.out.println("You lose");
          }
    }
    else 
    {
      System.out.println("You lose");
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
