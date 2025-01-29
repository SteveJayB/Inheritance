
/**********************************************************************
  *                             Race                                  *
  *                                                                   *
  * PROGRAMMER:  (Stephen Bridgett)                                   *
  *                                                                   *
  * DESCRIPTION: This file will create the race object.               *
  ********************************************************************/
//Create the Race object
public class Race {
 
    /********************************************************************
    * ATTRIBUTES                                                      *
    ******************************************************************/  
 private Animal[] contestants;
 int time;
 double distance;
 private Animal winner;

  /********************************************************************
    * CONSTRUCTORS                                                    *
    ******************************************************************/ 
 public Race(Animal[] contestants, double distance){
  this.contestants = contestants;
  this.time = 0;
  this.distance = distance;
  this.winner = null;

 }
 
  /********************************************************************
    *   METHODS                                                       *
    ******************************************************************/
 //Run the race
 public void runRace(){
  while (this.winner==null){
   this.time++;
    for (Animal a : this.contestants){
     a.updatePosition(time);
    }
   checkForWinner();
   printRaceInfo();
  }
  printWinner();
 }
 
 //Check for winner
  public void checkForWinner(){
  for (Animal a : this.contestants){
   if (a.getCurrentPosition() >= this.distance){
    this.winner = a;
   }
  }
 }
  
    /********************************************************************
    * OUTPUT METHOD                                                   *
    ******************************************************************/ 
 //Print race info in lines 
 public void printRaceInfo(){
  System.out.println("                              Time: " +this.time+ " seconds");
  System.out.println("");
  String line_format = "%10s %10s %10s %25s %13s %n";
  System.out.format(line_format, "Name", "Speed", "Species", "Current Position", "Specialty");
  System.out.println("---------------------------------------------------------------------------------");
  for (Animal a : this.contestants){
   a.printInfo();
   System.out.println("---------------------------------------------------------------------------------");
  }
  
  System.out.print("\n \n");
 }
 
 //Print winner of race
 public void printWinner(){
  System.out.print(this.winner.getName()+" has won!\n\n");
 }

}  