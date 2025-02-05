public class Penguin extends Animal {

    /********************************************************************
     * ATTRIBUTES                                                      *
     ********************************************************************/
    
    private boolean slide_;        // Indicates if the penguin is currently sliding
    private int slideTime_;        // The time when the penguin starts sliding
    private int slideDuration_;    // The duration of the slide

    /********************************************************************
     * CONSTRUCTORS                                                    *
     ********************************************************************/

    // Constructor to initialize all attributes of the Penguin class
    public Penguin(String name, 
                   double speed, 
                   String species, 
                   double currentPosition, 
                   boolean slide,
                   int slideTime,
                   int slideDuration) {
        
        super(name, speed, species, currentPosition); // Call superclass constructor
        
        this.slide_ = slide;
        this.slideTime_ = slideTime;
        this.slideDuration_ = slideDuration;
    }

    /********************************************************************
     *   METHODS                                                       *
     ********************************************************************/

    // Getter method to check if the penguin is sliding
    public boolean isSliding() {
        return slide_;
    }

    // Determines if the penguin should start or stop sliding based on the given time
    public void checkForSlide(int time) {
        if (time == slideTime_) { // If current time matches slide start time, start sliding
            slide_ = true;
        }
        if (time == slideTime_ + slideDuration_) { // If slide duration has passed, stop sliding
            slide_ = false;
        }
    }

    // POLYMORPHISM: Overrides the updatePosition method from Animal class
    @Override
    public void updatePosition(int time) {
        checkForSlide(time); // Check if the penguin should slide

        if (slide_) { 
            this.currentPosition += this.speed * 1.5 * time; // Increase speed when sliding
        } else {
            this.currentPosition += this.speed * time; // Normal movement
        }
    }

    /********************************************************************
     * OUTPUT METHOD                                                   *
     ********************************************************************/

    // Formats and prints the penguin's information, including its sliding status
    @Override
    public void printInfo() {
        String lineFormat = "%-10s %-10s %-10s %-10s %-15s%n"; // Adjusted for better alignment
        String speedRounded = String.format("%.1f", this.speed); // Round speed to 1 decimal place
        String currPosRounded = String.format("%.1f", this.currentPosition); // Round position to 1 decimal place
        System.out.format(lineFormat, this.name, speedRounded, this.species, currPosRounded, "Belly Slide: " + this.slide_);
    }
}