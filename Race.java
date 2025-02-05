// The Race class simulates a race between different Animal contestants
public class Race {

    /********************************************************************
     * ATTRIBUTES                                                      *
     ********************************************************************/
    
    private Animal[] contestants; // Array to store all race participants
    private int time;             // The elapsed race time in seconds
    private double distance;      // The total race distance
    private Animal winner;        // The winner of the race, initially null

    /********************************************************************
     * CONSTRUCTORS                                                    *
     ********************************************************************/

    // Constructor to initialize the race with contestants and a specified distance
    public Race(Animal[] contestants, double distance) {
        this.contestants = contestants;
        this.time = 0;       // Start time at 0
        this.distance = distance;
        this.winner = null;  // No winner at the start of the race
    }

    /********************************************************************
     *   METHODS                                                       *
     ********************************************************************/

    // Runs the race simulation until a winner is determined
    public void runRace() {
        while (this.winner == null) { // Continue race until there is a winner
            this.time++; // Increment race time

            for (Animal a : this.contestants) {
                a.updatePosition(1); // Update position for each contestant (1-second intervals)
            }

            checkForWinner(); // Check if any contestant has reached the finish line
            printRaceInfo();  // Display current race status
        }

        printWinner(); // Announce the winner
    }

    // Checks if any contestant has reached or crossed the finish line
    public void checkForWinner() {
        for (Animal a : this.contestants) {
            if (a.getCurrentPosition() >= this.distance) {
                this.winner = a;
                break; // Exit loop once a winner is found
            }
        }
    }

    /********************************************************************
     * OUTPUT METHODS                                                  *
     ********************************************************************/

    // Prints race progress and the current positions of all contestants
    public void printRaceInfo() {
        System.out.println("                              Time: " + this.time + " seconds\n");
        
        // Formatting for structured race info display
        String lineFormat = "%-10s %-10s %-10s %-20s %-15s%n";
        System.out.format(lineFormat, "Name", "Speed", "Species", "Current Position", "Specialty");
        System.out.println("---------------------------------------------------------------------------------");

        for (Animal a : this.contestants) {
            a.printInfo(); // Print each animal's current status
            System.out.println("---------------------------------------------------------------------------------");
        }

        System.out.print("\n\n"); // Add spacing for readability
    }

    // Prints the winner of the race
    public void printWinner() {
        System.out.println(this.winner.getName() + " has won the race!\n");
    }
}