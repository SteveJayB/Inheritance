/**********************************************************************
  *                        Animal Object                              *
  *                                                                   *
  * PROGRAMMER:  (Stephen Bridgett)                                   *
  *                                                                   *
  * DESCRIPTION: This file creates an inheritance-based               *
  *              object-oriented program to simulate the              * 
  *              Tortoise v. Hare race, allowing for any animal,      *
  *              with specific abilities for defined animals.         *
  ********************************************************************/

public class Animal {    //object defined as Animal
  /********************************************************************
    * ATTRIBUTES                                                      *
    ******************************************************************/
  protected String name;
  protected double speed;
  protected String species;
  protected double currentPosition;
  /********************************************************************
    * CONSTRUCTORS                                                    *
    ******************************************************************/

  //all necessary parameters for attributes
  public Animal(String name_, 
                double speed_,
                String species_,
                double currentPosition_) 
     {
       this.name = name_;
       this.speed = speed_;
       this.species = species_;
       currentPosition_ = 0; 
     }
  
  public Animal(double currentPosition_)
     {
       currentPosition_ = currentPosition_;
     }
  
  /********************************************************************
    *   METHODS                                                       *
    ******************************************************************/
  public String getName()
  {
   return this.name;
  }
  public double getSpeed()
  {
   return this.speed;
  }
  public String getSpecies()
  {
   return this.species;
  }  
  public double getCurrentPosition()
  {
   return currentPosition;
  }  
  public double setSpeed(double speed_)
  {
   return this.speed;
  }
  public double setCurrentPosition(double currentPosition_)
  {
   return currentPosition;
  }
  
  public void updatePosition(int time)
  { 
    this.currentPosition = this.speed + currentPosition;
  }  

    /********************************************************************
    * OUTPUT METHOD                                                   *
    ******************************************************************/
  //formats the data to be displayed neatly
  public void printInfo(){
  String line_format = "%10s %10s %10s %20s %n";
  String speed_rounded = String.format("%.1f", this.speed);
  String currentPos_rounded = String.format("%.1f", this.currentPosition);
  System.out.format(line_format, this.name, speed_rounded, this.species, currentPos_rounded);
 }
}