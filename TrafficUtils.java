public class TrafficUtils {

  public static int legalCities(CameraInfo[] cameras) {
    boolean[] noViolationCities = new boolean[100];
    for (int i = 0; i < noViolationCities.length; i++) {
      noViolationCities[i] = true; 
    }

    for (CameraInfo camera : cameras) {
      if (!camera.allGood()) {
        noViolationCities[camera.getCity()] = false; 
      }
    }

    int count = 0;
    for (boolean noViolation : noViolationCities) {
      if (noViolation) {
        count++;
      }
    }

    return count; 
  }
}
