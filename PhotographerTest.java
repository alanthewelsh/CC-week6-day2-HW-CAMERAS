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
    analogueCamera = new AnalogueCamera ("Sony", "NRF", "Low-Res");
  }

  @Test 
  public void canAddCamera(){
    photographer.store(digitalcamera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemoveCamera(){
    photographer.store(digitalcamera);
    photographer.remove();
   assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canPrint(){
    photographer.add(digitalCamera);
    assertEquals("Nikon", photographer.cameraDetails());
  }

}