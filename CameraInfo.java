public class CameraInfo {
  private int city;           // City code (0 to 99)
  private int maxSpeed;       // Speed limit in the camera area
  private CarInfo[] cars;     // Array of vehicles photographed

  // Getters and Setters
  public int getCity() {
      return city;
  }

  public void setCity(int city) {
      this.city = city;
  }

  public int getMaxSpeed() {
      return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
      this.maxSpeed = maxSpeed;
  }

  public CarInfo[] getCars() {
      return cars;
  }

  public void setCars(CarInfo[] cars) {
      this.cars = cars;
  }


  public boolean allGood() {
      for (CarInfo car : cars) {
          if (car.illegal(maxSpeed)) {
              return false; 
          }
      }
      return true; 
  }
}
