import java.util.Random;

// Dog class extends Animal, inheriting its properties and methods
public class Dog extends Animal {

    /********************************************************************
     * ATTRIBUTES                                                      *
     ********************************************************************/
    
    private boolean squ_; // Boolean flag indicating if the dog sees a squirrel

    /********************************************************************
     * CONSTRUCTORS                                                    *
     ********************************************************************/

    // Constructor for Dog, initializing its attributes and calling the Animal constructor
    public Dog(String name, double speed, String species, double currentPosition) {
        super(name, speed, species, currentPosition); // Call to the superclass constructor
        this.squ_ = false; // Default value for squirrel detection
    }

    /********************************************************************
     *   METHODS                                                       *
     ********************************************************************/

    // Randomly toggles the squ_ variable to determine if the dog sees a squirrel
    public void toggleSqu() {
        Random r = new Random();
        this.squ_ = r.nextBoolean();
    }

    // POLYMORPHISM: Overrides the updatePosition method from the Animal class
    @Override
    public void updatePosition(int time) {
        if (this.squ_) { // If the dog sees a squirrel, its speed varies randomly
            Random s = new Random();
            double newSpeed = s.nextDouble() * (this.speed * 2) - this.speed; // Random speed adjustment
            this.currentPosition += newSpeed * time; // Update position accordingly
        } else {
            this.currentPosition += this.speed * time; // Normal movement
        }
    }

    /********************************************************************
     * OUTPUT METHOD                                                   *
     ********************************************************************/

    // Formats and prints the dog's information, including its status regarding squirrels
    @Override
    public void printInfo() {
        String lineFormat = "%-10s %-10s %-10s %-10s %-15s%n"; // Adjusted for better alignment
        String speedRounded = String.format("%.1f", this.speed); // Round speed to 1 decimal place
        String currPosRounded = String.format("%.1f", this.currentPosition); // Round position to 1 decimal place
        System.out.format(lineFormat, this.name, speedRounded, this.species, currPosRounded, "Squirrel: " + this.squ_);
    }
}