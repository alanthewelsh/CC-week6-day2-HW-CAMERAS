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
    if(cameraCount() > 0) {
      return this.store.remove(0);
    }
    return null;
  }

  // public void printAllDetails(){

  // }

}