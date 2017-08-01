import java.util.*;

class Photographer {
  private ArrayList<Printable> store;

  public Photographer(){
    this.store = new ArrayList<Printable>();
  }

  public int cameraCount(){
    return this.store.size();
  }

  public void store(Printable camera){
    this.store.add(camera);
  }

  public void remove(){
    this.store.clear();
  }

  public void printAllDetails(){
        String details = "";
       for (int i = 0 ; i < this.digitalcamera.size(); i++ ) {
          details += this.digitalcamera.get(i).printDetails();
        }
       return details;
  }

}