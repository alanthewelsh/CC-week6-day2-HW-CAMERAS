public class DigitalCamera implements Printable{

  private String make;
  private String filter;
  private String resolution;


  public DigitalCamera(String make, String filter, String resolution) {
    this.make = make;
    this.filter = filter;
    this.resolution = resolution;

  }  

  // public String print(){
  //   return this.make + " | " + this.filter + " | " + this.resoultion;
  // }

  
}