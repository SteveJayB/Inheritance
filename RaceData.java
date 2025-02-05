// Import Scanner for user input
import java.util.Scanner;

// RaceData class to set up and run the race
public class RaceData {

    // Scanner object to take user input
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {

        /********************************************************************
         * INITIALIZING CONTESTANTS                                         *
         ********************************************************************/
        
        // Creating Animal objects with different subclasses (POLYMORPHISM)
        Animal a = new Dog("Dug", 7.8, "Dog", 0);
        Animal b = new Animal("Roger", 15, "Dragon", 0);
        Animal c = new Lion("Simba", 11, "Lion", 0, 15, false);
        Animal d = new Animal("Smokey", 7, "Bear", 0);
        Animal e = new Hare("Thumper", 11.1, "Hare", 0, 2, 20, false);
        Animal f = new Animal("Bob", 6.5, "Human", 0);
        Animal g = new Penguin("Booby", 4, "Penguin", 0, true, 8, 22);
        Animal h = new Animal("Larry", 6, "Snake", 0);
        Animal i = new Dog("Sunshine", 5, "Dog", 0);
        Animal j = new Animal("Gizarzarp", 16, "Alien", 0);

        // Initializing an array with all contestants
        Animal[] contestants = { a, b, c, d, e, f, g, h, i, j };
        
        // Setting race distance
        int distance = 250;

        // Creating the Race object with the contestants and distance
        Race race = new Race(contestants, distance);

        /********************************************************************
         * USER INPUT & RACE EXECUTION                                      *
         ********************************************************************/

        while (true) {
            // Warning message about possible output issues with more than 7 contestants
            System.out.println("\nWARNING: Having more than seven race contestants may cause output formatting issues!");
            
            // Prompt user to continue or cancel the race
            System.out.print("\nDo you want to continue? (Y/N)? ");
            String userInput = scan.next();

            if (userInput.equalsIgnoreCase("Y")) { // If user chooses "Y", start the race
                race.runRace();
                break; // Exit loop after race finishes
            } 
            else if (userInput.equalsIgnoreCase("N")) { // If user chooses "N", exit program
                System.out.println("Thank you!");
                break;
            } 
            else { // Handle invalid input
                System.out.println("Invalid input. Please restart the program and enter 'Y' or 'N' only!");
                break;
            }
        }
        
        // Close Scanner object to prevent resource leaks
        scan.close();
    }
}