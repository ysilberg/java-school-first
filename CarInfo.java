public class CarInfo {
  private String id;         // License plate number
  private boolean privateCar; // True if private, false if public
  private int speed;         // Speed of the vehicle

  // Getters and Setters
  public String getId() {
      return id;
  }

  public void setId(String id) {
      this.id = id;
  }

  public boolean isPrivateCar() {
      return privateCar;
  }

  public void setPrivateCar(boolean privateCar) {
      this.privateCar = privateCar;
  }

  public int getSpeed() {
      return speed;
  }

  public void setSpeed(int speed) {
      this.speed = speed;
  }

  // Method to check if the car committed a traffic violation
  public boolean illegal(int maxSpeed) {
      return privateCar || speed > maxSpeed;
  }
}
