import Java.scanner;

public class Ex6 {
  private String snackCode;
  private int price;
  private int stock;

  public int buySnack(String userSnack, int money) {
    if (money > price) {
      return money - price;
    } else {
      return 0;
    }
  }

}
