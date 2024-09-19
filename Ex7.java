public class Ex7 {
  public int value;
  public String color;

  public Coin(int value, String color)
  {
    Ex7 coin = new Ex7();
    coin.value = 45;
    coin.color = "Gold";

    System.out.println("color: " + coin.color);
    System.out.println("value: " + coin.value);
  }

  void updateColor() {
    if (this.color == "silver") {
      color = "gold";
    } else {
      color = "silver";
    }
  }

  int getValue() {
    return value;
  }

  String getColor() {
    return color;
  }

  public String toString() {
    return ("coin color:" + color + "/value:" + value);
  }

}
