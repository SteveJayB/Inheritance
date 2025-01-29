/**********************************************************************
  *                             Dog                                   *
  *                                                                   *
  * PROGRAMMER:  (Stephen Bridgett)                                   *
  *                                                                   *
  * DESCRIPTION: This is a 'Dog' object that extends the Animal       *
  *              objects. The Dog object will inherit its             *
  *              attributes and methods.                              *
  ********************************************************************/
import java.util.Random;

public class Dog extends Animal {

    /********************************************************************
    * ATTRIBUTES                                                      *
    ******************************************************************/
  
 private boolean squ_;

   /********************************************************************
    * CONSTRUCTORS                                                    *
    ******************************************************************/

 public Dog (String name_, 
             double speed_, 
             String species_, 
             double currentPosition_){
  super(name_, 
        speed_, 
        species_, 
        currentPosition_);
 
  this.squ_ = false;
  
  boolean squ = squ_;
 }

   /********************************************************************
    *   METHODS                                                       *
    ******************************************************************/
 public void toggleSqu(){
  Random r = new Random();
  this.squ_ = r.nextBoolean();
 }

 //POLYMORPHISM//
 public void updatePosition(int time){ 
  if (this.squ_){
   Random s = new Random();
   double new_speed = s.nextDouble()*(this.speed*2)-this.speed;
   
   this.currentPosition = this.currentPosition + new_speed;
  }
  else {
   this.currentPosition = this.currentPosition + this.speed;
  }
 }
  /********************************************************************
    * OUTPUT METHOD                                                   *
    ******************************************************************/
  //formats the data to be displayed neatly
  public void printInfo(){
  String line_format = "%10s %10s %10s %20s %22s %n";
  String speed_rounded = String.format("%.1f", this.speed);
  String currPos_rounded = String.format("%.1f", this.currentPosition);
  System.out.format(line_format, this.name, speed_rounded, this.species, currPos_rounded, "Squirrel: "+this.squ_); //POLYMORPHISM//
 }
}