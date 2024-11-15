public class Engine {
  private String engineNumber;
  private int maxSpeed;

  public Engine(String engineNumber, int maxSpeed) {
      this.engineNumber = engineNumber;
      this.maxSpeed = maxSpeed;
  }

  public String getEngineNumber() {
      return engineNumber;
  }

  public void setEngineNumber(String engineNumber) {
      this.engineNumber = engineNumber;
  }

  public int getMaxSpeed() {
      return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
      this.maxSpeed = maxSpeed;
  }
}

