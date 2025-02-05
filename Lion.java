// The Lion class extends Animal, adding a speed boost feature
public class Lion extends Animal {

    /********************************************************************
     * ATTRIBUTES                                                      *
     ********************************************************************/
    
    private double fastSpeed; // Multiplier for the lion's speed during a boost
    private boolean boost;    // Indicates whether the lion is currently boosted

    /********************************************************************
     * CONSTRUCTORS                                                    *
     ********************************************************************/

    // Constructor to initialize a Lion object with attributes from the Animal class plus fastSpeed and boost
    public Lion(String name, 
                double speed, 
                String species, 
                double currentPosition, 
                double fastSpeed, 
                boolean boost) {

        super(name, speed, species, currentPosition); // Call superclass constructor
        this.fastSpeed = fastSpeed; // Assign fast speed multiplier
        this.boost = boost;         // Initialize boost status
    }

    /********************************************************************
     *   METHODS                                                       *
     ********************************************************************/

    // Method to increase the lion's speed every 24 seconds
    public void increaseSpeed(int time) {
        if (time % 24 == 0) { // If the current time is a multiple of 24
            this.speed *= this.fastSpeed; // Multiply speed by the fastSpeed factor
            this.boost = true; // Activate boost mode
        } else {
            this.boost = false; // Otherwise, reset boost status
        }
    }

    // POLYMORPHISM: Overrides updatePosition to include speed boost logic
    @Override
    public void updatePosition(int time) {
        increaseSpeed(time); // Check if speed should be increased
        this.currentPosition += this.speed * time; // Update position based on speed and elapsed time
    }

    /********************************************************************
     * OUTPUT METHOD                                                   *
     ********************************************************************/

    // Prints the lion's current status, including speed and whether it's boosted
    @Override
    public void printInfo() {
        String lineFormat = "%-10s %-10s %-10s %-20s %-15s%n"; // Adjusted for better alignment
        String speedRounded = String.format("%.1f", this.speed); // Round speed to 1 decimal place
        String currPosRounded = String.format("%.1f", this.currentPosition); // Round position to 1 decimal place
        System.out.format(lineFormat, this.name, speedRounded, this.species, currPosRounded, "Boost: " + this.boost);
    }
}