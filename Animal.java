// The Animal class represents an animal with a name, speed, species, and current position.
public class Animal {

    /********************************************************************
     * ATTRIBUTES                                                      *
     ********************************************************************/
    protected String name;            // Name of the animal
    protected double speed;           // Speed of the animal
    protected String species;         // Species of the animal
    protected double currentPosition; // Current position of the animal

    /********************************************************************
     * CONSTRUCTORS                                                    *
     ********************************************************************/

    // Constructor to initialize all attributes of the Animal class
    public Animal(String name, double speed, String species, double currentPosition) {
        this.name = name;
        this.speed = speed;
        this.species = species;
        this.currentPosition = currentPosition; // Ensure proper assignment
    }

    // Constructor to initialize only the current position
    public Animal(double currentPosition) {
        this.currentPosition = currentPosition;
    }

    /********************************************************************
     * GETTER METHODS                                                  *
     ********************************************************************/

    // Returns the name of the animal
    public String getName() {
        return this.name;
    }

    // Returns the speed of the animal
    public double getSpeed() {
        return this.speed;
    }

    // Returns the species of the animal
    public String getSpecies() {
        return this.species;
    }

    // Returns the current position of the animal
    public double getCurrentPosition() {
        return this.currentPosition;
    }

    /********************************************************************
     * SETTER METHODS                                                  *
     ********************************************************************/

    // Sets the speed of the animal
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // Sets the current position of the animal
    public void setCurrentPosition(double currentPosition) {
        this.currentPosition = currentPosition;
    }

    /********************************************************************
     *   METHODS                                                       *
     ********************************************************************/

    // Updates the position of the animal based on speed and time
    public void updatePosition(int time) {
        this.currentPosition += this.speed * time; // Multiply speed by time to update position correctly
    }

    /********************************************************************
     * OUTPUT METHOD                                                   *
     ********************************************************************/

    // Prints the animal's information in a formatted manner
    public void printInfo() {
        String lineFormat = "%-10s %-10s %-10s %-10s%n"; // Adjusted format for better alignment
        String speedRounded = String.format("%.1f", this.speed); // Rounds speed to 1 decimal place
        String currentPosRounded = String.format("%.1f", this.currentPosition); // Rounds position to 1 decimal place
        System.out.format(lineFormat, this.name, speedRounded, this.species, currentPosRounded);
    }
}