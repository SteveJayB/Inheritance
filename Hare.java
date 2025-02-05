// The Hare class extends Animal, inheriting its properties and behaviors
public class Hare extends Animal {

    /********************************************************************
     * ATTRIBUTES                                                      *
     ********************************************************************/
    
    private int napStart_;       // The time at which the hare starts napping
    private int napDuration_;    // The duration for which the hare naps
    private boolean napping_;    // Indicates if the hare is currently napping

    /********************************************************************
     * CONSTRUCTORS                                                    *
     ********************************************************************/

    // Constructor to initialize all attributes of the Hare class
    public Hare(String name, 
                double speed, 
                String species, 
                double currentPosition, 
                int napStart, 
                int napDuration, 
                boolean napping) {
        
        super(name, speed, species, currentPosition); // Call superclass constructor
        
        this.napStart_ = napStart;
        this.napDuration_ = napDuration;
        this.napping_ = napping;
    }

    /********************************************************************
     *   METHODS                                                       *
     ********************************************************************/

    // POLYMORPHISM: Overrides updatePosition method to include napping behavior
    @Override
    public void updatePosition(int time) {
        if (time == napStart_) { // Check if it's time to start napping
            napping_ = true;
        }

        if (time == napStart_ + napDuration_) { // Check if napping time is over
            napping_ = false;
        }

        if (!napping_) { // If not napping, move normally
            this.currentPosition += this.speed * time; // Multiply speed by time to correctly update position
        }
    }

    /********************************************************************
     * OUTPUT METHOD                                                   *
     ********************************************************************/

    // Formats and prints the hare's information, including its napping status
    @Override
    public void printInfo() {
        String lineFormat = "%-10s %-10s %-10s %-10s %-15s%n"; // Adjusted for better alignment
        String speedRounded = String.format("%.1f", this.speed); // Round speed to 1 decimal place
        String currPosRounded = String.format("%.1f", this.currentPosition); // Round position to 1 decimal place
        System.out.format(lineFormat, this.name, speedRounded, this.species, currPosRounded, "Napping: " + this.napping_);
    }
}