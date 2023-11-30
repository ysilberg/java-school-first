import java.util.Scanner;

public class Q_Eleven {
  public static void main(String[] args) {
    try (Scanner myObj = new Scanner(System.in)) {
      System.out.println("Please enter price:");
      double price = myObj.nextInt();
      double vat = (price * 16.5) / 100 + price;
      System.out.println("The  price  after  VAT  is: " + vat + ", Vat is 16.5%");
    }

  }
}