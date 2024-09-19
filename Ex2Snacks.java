import java.util.Scanner;

public class Ex2Snacks {
  private String name;
  private String comp;
  private double price;

  public Snack(String name, String comp ,double price)
  {
    return Snack();
  }

  void updatePrice(double price) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter sale number: ");
    double sale = scanner.nextDouble();
    price *= sale;
  }

  public String toString() {
    return name + "/" + comp + "/" + price;
  }

}
