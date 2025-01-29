/**********************************************************************
  *                            Penguin                                *
  *                                                                   *
  * PROGRAMMER:  (Stephen Bridgett)                                   * 
  *                                                                   *
  * DESCRIPTION: This is a 'Penguin' object that extends the Animal   *
  *              objects. The Penguin object will inherit its         *
  *              attributes and methods.                              *
  ********************************************************************/
import java.util.Random;

public class Penguin extends Animal {

    /********************************************************************
    * ATTRIBUTES                                                      *
    ******************************************************************/
  
 private boolean slide_;
 private int slideTime_;
 private int slideDuration_;

   /********************************************************************
    * CONSTRUCTORS                                                    *
    ******************************************************************/

 public Penguin(String name_, 
                double speed_, 
                String species_, 
                double currentPosition_, 
                boolean slide_,
                int slideTime_,
                int slideDuration_){
  super(name_, 
        speed_, 
        species_, 
        currentPosition_);
 
  this.slide_ = slide_;
  this.slideTime_ = slideTime_;
  this.slideDuration_ = slideDuration_;
  
 }

   /********************************************************************
    *   METHODS                                                       *
    ******************************************************************/
 public boolean getSlide(){
  return slide_;
 }
 
 public void checkForSlide(int time){
  if (time==slideTime_){
   slide_ = true;
  }
  if (time == slideTime_ + slideDuration_){
   slide_ = false;
  }
 }
 
 
  //POLYMORPHISM//  
  public void updatePosition(int time){
  checkForSlide(time);
  this.currentPosition += this.speed;
 }
  /********************************************************************
    * OUTPUT METHOD                                                   *
    ******************************************************************/
 public void printInfo(){
  String line_format = "%10s %10s %10s %20s %22s %n";
  String speed_rounded = String.format("%.1f", this.speed);
  String currPos_rounded = String.format("%.1f", this.currentPosition);
  System.out.format(line_format, this.name, speed_rounded, this.species, currPos_rounded, "Belly Slide: "+slide_); //POLYMORPHISM//
 }
}