public class Ex14 {

  private String company;
  private String model;
  private String id;
  private double price;
  private int owners;

  public void Car() {
    this.company = "Mercades";
    this.model = "s300";
    this.id = "56345";
    this.price = 1000000.00;
    this.owners = 0;
  }

  public double GetPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void sellCar() {
    owners++;
  }

  public String toString() {
    return ("company - " + company + " model- " + id + " price- " + price + "owners- " + owners);
  }

}
