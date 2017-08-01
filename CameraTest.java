import static org.junit.Assert.*;
import org.junit.*;

public class CameraTest {

  Camera camera;

  @Before
  public void before(){
    camera = new Camera("Nikon 34T", "Noise reduction filter", "Hi-resolution");
  }

  @Test void canAddCamera(){
    assertEquals(1, camera.cameraCount());
  }

}