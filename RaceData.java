/**********************************************************************
  *                          State Tester                             *
  *                                                                   *
  * PROGRAMMER:  (Stephen Bridgett)                                   *
  *                                                                   *
  * DESCRIPTION: This file will create a quick race of ten animals.   *
  ********************************************************************/
//import scanner for user input
import java.util.Scanner;

//create Test Race 4
public class RaceData {
  
  //initializing user input
  static Scanner scan = new Scanner(System.in);
  static String userInput = null;  
  
 public static void main(String[] args){
  Animal a = new Dog("Dug", 7.8, "Dog", 0); //POLYMORPHISM//
  Animal b = new Animal("Roger", 15, "Dragon", 0);
  Animal c = new Lion("Simba", 11, "Lion", 0, 15, false); //POLYMORPHISM//
  Animal d = new Animal("Smokey", 7, "Bear", 0);
  Animal e = new Hare("Thumper", 11.1, "Hare", 0, 2, 20, false); //POLYMORPHISM//
  Animal f = new Animal("Bob", 6.5, "Human", 0);
  Animal g = new Penguin("Booby", 4, "Penguin", 0, true, 8, 22); //POLYMORPHISM//
  Animal h = new Animal("Larry", 6, "Snake", 0);
  Animal i = new Dog("Sunshine", 5, "Dog", 0); //POLYMORPHISM//
  Animal j = new Animal("Gizarzarp", 16, "Alien", 0);
  
  Animal[] contestants = new Animal[]{a,b,c,d,e,f,g,h,i,j}; //initialize contestants
  int distance = 250; //distance of the race
  Race r = new Race(contestants, distance); //defining contentants and distance for race
  
  //Warning message that also runs race
  while (true)
  {
    System.out.print("\nWARNING: Having more than seven race contestants risks for the race output to be printed incorrectly! \n");
    System.out.print("\nDo you want to continue? (Y/N)? ");
    userInput = scan.next();
    if (userInput.equalsIgnoreCase("Y")) //Enter Y to continue with race
      r.runRace();
    else if (userInput.equalsIgnoreCase("N")) //Enter N to cancel race
    {
      System.out.print(" Thank you! ");
      break;
    }
    else{
      System.out.print("Try running the program again using 'Y' or 'N' only!"); //Inform the user of wrong input type 
        }
    break;
   } 
 }
} 