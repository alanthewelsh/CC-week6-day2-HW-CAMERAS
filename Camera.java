import java.util.*;

class Camera {
  private String name;
  private String nrf;
  private String resolution;
  private ArrayList<CameraStore> store;

  public Camera(String name, String nrf){
    this.name = name;
    this.nrf = nrf;
    this.resolution = resolution;
    this.store = new ArrayListing<CameraStore>();
  }

  public int cameraCount(){
    return this.store.size();
  }
  public void add(CameraStore camera){
    this.store.add(camera);
  }

}