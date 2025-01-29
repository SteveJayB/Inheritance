/**********************************************************************
  *                             Lion                                  *
  *                                                                   *
  * PROGRAMMER:  (Stephen Bridgett)                                   *
  *                                                                   *
  * DESCRIPTION: This is a 'Lion' object that extends the Animal      *
  *              objects. The Lion object will inherit its            *
  *              attributes and methods.                              *
  ********************************************************************/

public class Lion extends Animal {

    /********************************************************************
    * ATTRIBUTES                                                      *
    ******************************************************************/
  private double fastSpeed;
  private boolean boost;
    /********************************************************************
    * CONSTRUCTORS                                                    *
    ******************************************************************/

 
  public Lion (String name_, 
                  double speed_, 
                  String species_, 
                  double currentPosition_, 
                  double fastSpeed_,
                  boolean boost_){
  
  super(name_, 
        speed_, 
        species_, 
        currentPosition_);
  
 } 

   /********************************************************************
    *   METHODS                                                       *
    ******************************************************************/  
  public void increaseSpeed(int time){
   if (time % 24 == 0){
    this.speed *= this.fastSpeed;
    boolean boost_ = true;
   }
  }
 
 //POLYMORPHISM// 
 public void updatePosition(int time){
  increaseSpeed(time);
  this.currentPosition += this.speed;
 }
 
  /********************************************************************
    * OUTPUT METHOD                                                   *
    ******************************************************************/
 public void printInfo(){
  String line_format = "%10s %10s %10s %20s %21s %n";
  String speed_rounded = String.format("%.1f", this.speed);
  String currPos_rounded = String.format("%.1f", this.currentPosition);
  System.out.format(line_format, this.name, speed_rounded, this.species, currPos_rounded, "Boost: false"); //POLYMORPHISM//
 } 
}  