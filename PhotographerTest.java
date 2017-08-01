import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {

  Photographer photographer;
  DigitalCamera digitalcamera;
  AnalogueCamera analogueCamera;

  @Before
  public void before(){
    photographer = new Photographer();
    digitalcamera = new DigitalCamera("Nikon", "NRF", "Hi-Res");
  }

  @Test 
  public void canAddCamera(){
    photographer.store(digitalcamera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemoveCamera(){
    if(cameraCount() > 0) {
      return camera.remove(0);
    }
    return null;
  }

}