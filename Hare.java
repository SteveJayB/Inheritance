/**********************************************************************
  *                             Hare                                  *
  *                                                                   *
  * PROGRAMMER:  (Stephen Bridgett)                                   *
  *                                                                   *
  * DESCRIPTION: This is a 'Hare' object that extends the Animal      *
  *              objects. The Hare object will inherit its            *
  *              attributes and methods.                              *
  ********************************************************************/

public class Hare extends Animal {

    /********************************************************************
    * ATTRIBUTES                                                      *
    ******************************************************************/
 private int napStart_;
 private int napDuration_;
 private boolean napping_;

   /********************************************************************
    * CONSTRUCTORS                                                    *
    ******************************************************************/

 public Hare(String name_, 
             double speed_, 
             String species_, 
             double currentPosition_, 
             int napStart_, 
             int napDuration_, 
             boolean napping_){
  super(name_, 
        speed_, 
        species_, 
        currentPosition_);
  
  this.napStart_ = napStart_;
  this.napDuration_ = napDuration_;
  this.napping_ = napping_;
 }

   /********************************************************************
    *   METHODS                                                       *
    ******************************************************************/
 
 //POLYMORPHISM//
 public void updatePosition(int time){
  if (time == napStart_){
   napping_ = true;
  }
  
  if (time == napStart_ + napDuration_){
   napping_ = false;    
  }
  
  if (!napping_){
   this.currentPosition = this.currentPosition + this.speed;
  }
 }
  /********************************************************************
    * OUTPUT METHOD                                                   *
    ******************************************************************/
 public void printInfo(){
  String line_format = "%10s %10s %10s %20s %21s %n";
  String speed_rounded = String.format("%.1f", this.speed);
  String currPos_rounded = String.format("%.1f", this.currentPosition);
  System.out.format(line_format, this.name, speed_rounded, this.species, currPos_rounded, "Napping: "+napping_); //POLYMORPHISM//
 } 
}