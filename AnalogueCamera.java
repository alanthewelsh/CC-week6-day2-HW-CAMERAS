public class AnalogueCamera implements Printable{

  private String make;
  private String filter;
  private String resolution;


  public AnalogueCamera(String make, String filter, String resolution) {
    this.make = make;
    this.filter = filter;
    this.resolution = resolution;

  }  

  public String print(){
    return this.make + " | " + this.filter + " | " + this.resoultion;
  }

  public String print(){
    return "click!";
  }
  
}